package services.task;

import entities.creatures.Creature;
import entities.creatures.fauna.Animal;
import entities.map.Cell;

public class EatTask extends Task {
    public EatTask(Creature creature, Cell cell) {
        super(creature, cell);
    }

    @Override
    public void run() {
        if (creature instanceof Animal) {
            Animal animal = (Animal) creature;
            animal.eat(cell);
        }
    }
}
