package repository.factory.fauna;

import entities.creatures.Creature;
import entities.creatures.Group;
import entities.creatures.fauna.herbivores.Goat;
import repository.CreatureInfo;
import repository.factory.CreatureFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class GoatFactory extends CreatureFactory {
    private static final AtomicInteger ID = new AtomicInteger(0);

    public GoatFactory() {
        groupId = Group.GOAT.getGroupId();
        type = Group.GOAT.getType();
        limit = config.getLimit(type);
        curWeight = limit.getMaxWeight() * config.getStartWeightFactor();
        ration = config.getRation(type);
        icon = config.getIcon(type);
    }

    @Override
    public Creature create(String type) {

        int creatureId = ID.getAndIncrement();

        CreatureInfo creatureInfo = new CreatureInfo(type,
                groupId,
                creatureId,
                isAlive,
                curWeight,
                icon,
                satiety,
                ration);

        return new Goat(creatureInfo, limit);
    }
}
