package com.kodilla.abstracts.homework;

public class TriangleEquilateral extends Shape {
    double a;

        @Override
        public double perimeter() {
            return 3 * a;
        }

        @Override
        public double area() {
            return a * a * 1.732 / 4;
        }

        public static void main(String[] args) {
        TriangleEquilateral triangle1 = new TriangleEquilateral();
        triangle1.a = 6.5;

        System.out.println("With side length equals: " + triangle1.a + " cm, perimeter equals: " + triangle1.perimeter() + " cm, and area equals :" + triangle1.area() + " cm2.");
    }

}
