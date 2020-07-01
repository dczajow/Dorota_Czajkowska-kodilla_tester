package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    static double PI = 3.1415927;
    double r;

    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public double perimeter() {
        return 2 * PI * r;
    }

    public static void main(String[] args) {

        Circle circle1 = new Circle();
        circle1.r = 9;
        System.out.println("With side length equals: " + circle1.r + " cm, perimeter equals: " + circle1.perimeter() + " cm, and area equals: " + circle1.area() + " cm2.");


    }
}