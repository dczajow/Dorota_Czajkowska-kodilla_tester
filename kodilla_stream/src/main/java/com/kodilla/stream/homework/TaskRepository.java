package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Write tasks", LocalDate.of(2020, 1, 10), LocalDate.of(2020, Month.SEPTEMBER, 5)));
        tasks.add(new Task("Sign documents", LocalDate.of(2020, Month.APRIL, 13), LocalDate.of(2021, Month.AUGUST, 10)));
        tasks.add(new Task("Create posts on website", LocalDate.of(2010, Month.DECEMBER, 21), LocalDate.of(2022, Month.FEBRUARY, 28)));
        tasks.add(new Task("Write new tasks", LocalDate.of(2020, Month.SEPTEMBER, 6), LocalDate.of(2020, Month.OCTOBER, 1)));

        return tasks;
    }
}