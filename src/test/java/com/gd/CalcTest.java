package com.gd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sum() {
        assertEquals(5, Calc.sum(2, 3));
        assertEquals(7, Calc.sum(2, 5));
    }
}