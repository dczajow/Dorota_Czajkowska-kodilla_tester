package com.kodilla.collections.adv.maps.complex;

import java.util.HashMap;
import java.util.Map;

public class ComplexMapExample {
    public static void main(String[] args) {
        Map<Student, Grades> school = new HashMap<>();
        Student john = new Student("John", "Stewenson");
        Student jessie = new Student("Jessie", "Pinkman");
        Student barney = new Student("Barney", "Stinson");

        Grades johnGrades = new Grades(5.0, 4.0, 4.5, 5.0, 5.0);
        Grades jessieGrades = new Grades(2.5, 3.0, 2.0);
        Grades barneyGrades = new Grades(4.0, 4.0, 4.0, 4.0, 5.0);

        school.put(john, johnGrades);
        school.put(jessie, jessieGrades);
        school.put(barney, barneyGrades);

        System.out.println(school.get(john));

        for(Map.Entry<Student, Grades> studentEntry : school.entrySet())
            System.out.println(studentEntry.getKey().getFirstname() + ", average: " + studentEntry.getValue().getAverage());
    }
}
