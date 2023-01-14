package entities.creatures.fauna.predators;

import entities.creatures.fauna.Animal;
import repository.CreatureInfo;
import repository.Limit;

public class Predator extends Animal {
    public Predator(CreatureInfo info, Limit limit) {
        super(info, limit);
    }
}
