package repository.factory;

import entities.creatures.Creature;
import repository.Limit;
import repository.maps.Ration;
import setting.Config;
import util.Satiety;

import java.util.Map;

public abstract class CreatureFactory implements Factory {
    protected int groupId;
    protected String type;
    protected Config config = Config.getConfig();
    protected boolean isAlive = true;
    protected double curWeight;
    protected Satiety satiety = Satiety.ALL_RIGHT;
    protected Ration ration;
    protected Limit limit;
    protected String icon;

    @Override
    public Map<String, Creature> getPrototypes() {
        return null;
    }
}
