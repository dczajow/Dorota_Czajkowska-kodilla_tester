package com.kodilla.parametrized_tests;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class StringValidatorTestSuite {
    private StringValidator validator = new StringValidator();

    @Test
    public void shouldReturnFalseIfStringIsEmpty(){
        assertFalse(validator.isBlank("test"));
    }

    @ParameterizedTest
    @ValueSource(strings = {"","  "})
    public void shouldreturnTrueIfStringIsEmpty(String text){
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullSource
    public void shouldReturnTrueIfStringIsNull(String text){
        assertTrue(validator.isBlank(text));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnTrueIfStringIsEmpty(String tekts){
        System.out.println("|" + tekts + "|"); // display what is passed by param
        assertTrue(validator.isBlank(tekts));
    }

}
