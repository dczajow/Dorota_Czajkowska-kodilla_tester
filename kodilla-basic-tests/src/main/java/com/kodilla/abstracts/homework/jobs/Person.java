package com.kodilla.abstracts.homework.jobs;

public class Person {
    String firstName;
    int age;
    Job job;

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.job = new Chef();
        p1.firstName = "Kristof";
        p1.age = 34;

    }
}
