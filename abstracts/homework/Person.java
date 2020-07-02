package com.kodilla.abstracts.homework;

public class Person {
    String firstName;
    int age;
    String job;

    public void JobDescription() {
        System.out.println(this.job + " responsibilities:" );
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        p1.job = "Chef";
        p1.firstName = "Kristof";
        p1.age = 34;

        p1.JobDescription();

    }
}
