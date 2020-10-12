package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class UserValidatorTestSuite {

    UserValidator validator = new UserValidator();

    @ParameterizedTest
    @ValueSource(strings = {"alex123","123","123az","alex_123","alex.123","alex.","_alex"})
    public void shouldReturnTrueForThreeOtMoreAllowedCharacters(String value){
        assertTrue(validator.validateUsername(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"al","al ex"," ale","alex+123","alex@123","alex&","alex123 "})
    public void shouldReturnFalseForNotAllowedCharacters(String value){
        assertFalse(validator.validateUsername(value));
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void shouldReturnFalseIfAnEmptyStringIsPassed(String value){
        assertFalse(validator.validateUsername(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {"test@gmail.com","tets.afterdot@gmail.com","student01@bbk.ac.uk","_123-test@mail.subdomain.company.com"})
    public void shouldReturnTrueForCorrectEmailAddresses(String value){
        assertTrue(validator.validateEmail(value));
    }

    @ParameterizedTest
    @ValueSource(strings = {" test@gmail.com","!tets.afterdot@gmail.com","@student01@bbk.ac.uk","_123 test@mail.subdomain.company.com","test@gmail","correct@onet."})
    public void shouldReturnFalseForIncorrectEmailAddresses(String value){
        assertFalse(validator.validateEmail(value));
    }

}