package services.task;

import entities.creatures.Creature;
import entities.map.Cell;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Task implements Runnable {
    protected final Creature creature;
    protected final Cell cell;

    public void run() {

    }
}
