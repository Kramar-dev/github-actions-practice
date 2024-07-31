package com.gd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OnePlusOneTest {

    @Test
    void onePlusOneTest() {
        assertEquals(2, Calc.sum(1, 1));
    }

    @Test
    void onePlusOneTestShouldFailed() {
        assertEquals(3, Calc.sum(1, 2));
    }
}
