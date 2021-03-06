package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.kodilla.basic_assertion.ResultChecker.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        System.out.println(sumResult);
        Assertions.assertEquals(13, sumResult);
    }
    @Test
    public void testSub() {
        Calculator calculator2 = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator2.subtract(a, b);
        System.out.println(subResult);
        assertTrue(assertEquals(-3, subResult));
    }

    @Test
    public void testSquared() {
        Calculator calculator3 = new Calculator();
        int a = -5;
        int squaredResult = calculator3.squared(a);
        System.out.println(squaredResult);
        assertTrue(assertEquals(25, squaredResult));
    }

}
