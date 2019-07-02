package com.woowa.conatuseus.domain;

import com.woowa.conatuseus.domain.exceptions.InvalidCarNameException;
import com.woowa.conatuseus.domain.movestrategy.MoveStrategy;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest {

    @Test
    void 올바른_자동차_생성_Test() {
        assertDoesNotThrow(() -> new Car("first"));
    }

    @Test
    void 이름_공백인_자동차_생성_Test() {
        assertThrows(InvalidCarNameException.class, () -> new Car(""));
    }

    @Test
    void 자동차_이동_Test() {
        Car car=new Car("first");


    }
}