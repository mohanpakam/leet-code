package com.mpakam.util;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MathUtilsTest {

    private MathUtils mathUtils;

    @BeforeEach
    void init() {
        mathUtils = new MathUtils();
    }

    @Test
    void testAdd() {
        int result = mathUtils.add(2, 3);
        assertEquals(5, result);
    }

    @Test
    void testSubtract() {
        int result = mathUtils.subtract(5, 3);
        assertEquals(2, result);
    }

    @Test
    void testMultiply() {
        int result = mathUtils.multiply(4, 3);
        assertEquals(12, result);
    }

    @Test
    void testDivide() {
        double result = mathUtils.divide(10, 2);
        assertEquals(5.0, result, 0.0001); // Provide a delta for comparing double values
    }

    @Test
    void testDivideByZero() {
        assertThrows(ArithmeticException.class, () -> mathUtils.divide(5, 0));
    }
}
