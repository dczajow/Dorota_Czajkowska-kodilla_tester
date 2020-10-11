package com.kodilla.parametrized_tests;


public class StringManipulator {
    public String reverseWithLowerCase(String input) {
        StringBuilder builder = new StringBuilder(input);
        return builder.reverse().toString().toLowerCase();
    }

    public int getStringLengthWithoutSpaces(String input) {
        String value = input.replaceAll(" ", "");
        return value.length();
    }

    //public class StringSources {

       /* static Stream<Arguments> provideStringsForTestingLength() {
            return Stream.of(
                    Arguments.of("test", 4),
                    Arguments.of("OtHEr ", 5),
                    Arguments.of("E V e n t", 5),
                    Arguments.of("null ", 4),
                    Arguments.of("A", 1)}*/


}