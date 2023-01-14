package services.task;

import entities.creatures.Creature;
import entities.creatures.fauna.Animal;
import entities.map.Cell;

public class MoveTask extends Task {
    public MoveTask(Creature creature, Cell cell) {
        super(creature, cell);
    }

    @Override
    public void run() {
        if(creature instanceof Animal){
            Animal animal = (Animal) creature;
            int speed = animal.getSpeed();
            if (speed > 0) {
                animal.move(cell);
            }
        }
    }
}
