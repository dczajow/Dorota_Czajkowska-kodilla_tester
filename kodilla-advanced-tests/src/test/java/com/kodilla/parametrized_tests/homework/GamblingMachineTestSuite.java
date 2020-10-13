package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/GoodNumbers.csv")
    public void shouldCheckWinsWorks(int value)
            throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(1);

    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumbers.csv")
    public void shouldErrorIfAddOneGoodValue(int value) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(1);

        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });

    }

    @Test
    public void shouldErrorIfAddOneGoodValue() {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(5);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @Test
    public void shouldComputerAddGoodValues()  {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = gamblingMachine.getGenerateComputerNumbers();
        Assertions.assertEquals(6, set.size());
        Assertions.assertTrue(Collections.max(set) <= 50);
        Assertions.assertTrue(Collections.min(set) > 0);
    }
}