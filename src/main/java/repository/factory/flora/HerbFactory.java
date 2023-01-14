package repository.factory.flora;

import entities.creatures.Creature;
import entities.creatures.Group;
import entities.creatures.flora.Herb;
import repository.CreatureInfo;
import repository.factory.CreatureFactory;

import java.util.concurrent.atomic.AtomicInteger;

public class HerbFactory extends CreatureFactory {
    private static final AtomicInteger id = new AtomicInteger(0);

    public HerbFactory() {
        groupId = Group.HERB.getGroupId();
        type = Group.HERB.getType();
        isAlive = false;
        limit = config.getLimit(type);
        curWeight = limit.getMaxWeight() * config.getStartWeightFactor();
        ration = config.getRation(type);
        icon = config.getIcon(type);
    }

    @Override
    public Creature create(String type) {

        int creatureId = id.getAndIncrement();

        CreatureInfo creatureInfo = new CreatureInfo(type,
                groupId,
                creatureId,
                isAlive,
                curWeight,
                icon,
                satiety,
                ration);

        return new Herb(creatureInfo, limit);
    }
}
