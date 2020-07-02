package com.kodilla.abstracts.homework;

public class Square extends Shape {
    double a;

    @Override
    public double perimeter() {
        return 4 * a;
    }

    @Override
    public double area() {
        return a * a;
    }

    public static void main(String[] args) {
        Square square1 = new Square();
        square1.a = 6.5;

        System.out.println("With side length equals: " + square1.a + " cm, perimeter equals: " + square1.perimeter() + " cm, and area equals :" + square1.area() + " cm2.");
    }

}
