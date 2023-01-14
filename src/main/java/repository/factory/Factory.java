package repository.factory;

import entities.creatures.Creature;

import java.util.Map;

public interface Factory {
    Creature create(String type);

    Map<String, Creature> getPrototypes();
}
