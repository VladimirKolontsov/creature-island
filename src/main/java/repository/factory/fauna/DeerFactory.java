package repository.factory.fauna;

import entities.creatures.Creature;
import entities.creatures.Group;
import entities.creatures.fauna.herbivores.Deer;
import repository.CreatureInfo;
import repository.factory.CreatureFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class DeerFactory extends CreatureFactory {
    private static final AtomicInteger ID = new AtomicInteger(0);

    public DeerFactory() {
        groupId = Group.DEER.getGroupId();
        type = Group.DEER.getType();
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

        return new Deer(creatureInfo, limit);
    }
}
