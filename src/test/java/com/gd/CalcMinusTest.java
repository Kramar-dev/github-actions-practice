package com.gd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalcMinusTest {

    @Test
    void testMinus() {
        assertEquals(7, Calc.minus(10, 3));
    }
}
