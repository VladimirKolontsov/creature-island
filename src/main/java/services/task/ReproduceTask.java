package services.task;

import entities.creatures.Creature;
import entities.map.Cell;

public class ReproduceTask extends Task {
    public ReproduceTask(Creature creature, Cell cell) {
        super(creature, cell);
    }

    @Override
    public void run() {
        creature.reproduce(cell);
    }
}
