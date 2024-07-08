package com.gd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTest {

    @Test
    void sum() {
        assertEquals(5, Calc.sum(2, 3));
    }

    @Test
    void test1() {
        assertEquals(2, Calc.sum(1, 1));
    }
}