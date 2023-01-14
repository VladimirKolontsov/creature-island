package services.task;

import entities.creatures.Creature;
import entities.map.Cell;

public class DeathTask extends Task {
    public DeathTask(Creature creature, Cell cell) {
        super(creature, cell);
    }

    @Override
    public void run() {
        if(creature.isAlive()){
            creature.die();
        }
    }
}
