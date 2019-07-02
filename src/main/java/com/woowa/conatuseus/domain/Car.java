package com.woowa.conatuseus.domain;

import com.woowa.conatuseus.domain.exceptions.InvalidCarNameException;

public class Car {


    private final String name;

    public Car(String name) throws RuntimeException {
        if (!this.isValidName(name)) {
            throw new InvalidCarNameException("잘못된 이름입니다.");
        }
        this.name = name;
    }

    private boolean isValidName(String name) {
        return !name.isBlank();
    }


}
