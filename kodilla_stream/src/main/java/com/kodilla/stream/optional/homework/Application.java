package com.kodilla.stream.optional.homework;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        List<Student> students = initStudents();
        for (Student student : students) {
            print(student);
        }
    }

    private static void print(Student student) {
        System.out.println(student.getName() + " - " + Optional.ofNullable(student.getTeacher()).map(teacher -> teacher.getName()).orElse("undefined"));
    }

    private static List<Student> initStudents() {
        Teacher teacher1 = new Teacher("Jan Nowak");
        Teacher teacher2 = new Teacher("Alina Malinowska");
        Teacher teacher3 = new Teacher("Zdzisław Grykowski");

        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan Kowalski", teacher1));
        students.add(new Student("Anna Manowska", teacher1));
        students.add(new Student("Marek Ogórek"));
        students.add(new Student("Bolek Lolek", teacher2));
        students.add(new Student("Marco Polo", teacher3));

        return students;

    }

}
