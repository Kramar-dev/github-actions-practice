package com.gd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sum() {
        assertEquals(5, Calc.sum(2, 3));
    }

    @Test
    void minus() {
        assertEquals(5, Calc.minus(10, 5));
    }
}