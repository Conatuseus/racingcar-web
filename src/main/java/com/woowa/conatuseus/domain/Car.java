package com.woowa.conatuseus.domain;

import com.woowa.conatuseus.domain.exceptions.InvalidCarNameException;
import com.woowa.conatuseus.domain.movestrategy.MoveStrategy;

public class Car implements Comparable<Car> {


    private final String name;
    private int position = 0;

    public Car(String name) throws RuntimeException {
        if (!this.isValidName(name)) {
            throw new InvalidCarNameException("잘못된 이름입니다.");
        }
        this.name = name;
    }

    private boolean isValidName(String name) {
        return !name.isBlank();
    }

    public void move(MoveStrategy moveStrategy) {
        if (moveStrategy.movable()) {
            this.position++;
        }
    }

    @Override
    public int compareTo(Car another) {
        return another.position - this.position;
    }
}
