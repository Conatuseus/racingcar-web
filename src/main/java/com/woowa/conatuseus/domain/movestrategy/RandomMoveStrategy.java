package com.woowa.conatuseus.domain.movestrategy;

import java.util.Random;

public class RandomMoveStrategy implements MoveStrategy {

    private static final int MAX_RANDOM_NUMBER = 10;
    private static final int MOVE_POSSIBLE_NUMBER = 5;

    @Override
    public boolean movable() {
        Random random = new Random();
        return random.nextInt(MAX_RANDOM_NUMBER) >= MOVE_POSSIBLE_NUMBER;
    }
}
