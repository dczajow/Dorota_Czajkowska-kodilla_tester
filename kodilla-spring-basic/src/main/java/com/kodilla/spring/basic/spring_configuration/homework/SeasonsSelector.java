package com.kodilla.spring.basic.spring_configuration.homework;

import java.time.LocalDate;

public class SeasonsSelector {
    private static final String seasons[] = {
            "Winter", "Winter", "Spring", "Spring", "Summer", "Summer",
            "Summer", "Summer", "Fall", "Fall", "Winter", "Winter"
    };

    public static String getSeason( LocalDate date ) {
        return seasons[ date.getMonthValue() ];
    }

}