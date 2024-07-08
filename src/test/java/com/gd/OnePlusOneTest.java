package com.gd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OnePlusOneTest {

    @Test
    void run() {
        assertEquals(2, Calc.sum(1, 1));
    }
}
