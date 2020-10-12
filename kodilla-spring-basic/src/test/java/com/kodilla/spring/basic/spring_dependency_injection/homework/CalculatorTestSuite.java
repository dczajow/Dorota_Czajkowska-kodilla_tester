package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
    Calculator bean = context.getBean(Calculator.class);


    @Test
    public void shouldReturnCorrectAdditionResultAndDisplayResult(){
        double result = bean.add(5.0,7.0);
        Assertions.assertEquals(12.0, result);
    }

    @Test
    public void shouldReturnCorrectSubtractionResultAndDisplayResult(){
        double result = bean.subtract(10.0, 4.0);
        Assertions.assertEquals(6.0, result);
    }

    @Test
    public void shouldReturnCorrectMultiplicationResultAndDisplayResult(){
        double result = bean.multiply(2.0, 3.5);
        Assertions.assertEquals(7.0, result);
    }

    @Test
    public void shouldReturnCorrectDivisionResultAndDisplayResult() throws ZeroUsageException {
        double result = bean.divide(11.0, 2.0);
        Assertions.assertEquals(5.5, result);
    }

    @Test
    public void shouldReturnExceptionWhenDividingByZero()  {
        Assertions.assertThrows(ZeroUsageException.class, ()->{
            double result = bean.divide(11.0, 0);
        });
    }

}