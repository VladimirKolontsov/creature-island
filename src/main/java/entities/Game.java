package entities;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import entities.map.Island;
import repository.factory.Factory;
import view.View;


@Getter
@RequiredArgsConstructor
public class Game {
    private final Island island;
    private final Factory entityFactory;
    private final View view;

}
