package entities.creatures.fauna.herbivores;

import entities.creatures.fauna.Animal;
import repository.CreatureInfo;
import repository.Limit;

public abstract class Herbivores extends Animal {

    public Herbivores(CreatureInfo info, Limit limit) {
        super(info, limit);
    }
}
