package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Square square = new Square(10.0);
        showShapedetails(square);

        Circle circle = new Circle(7.00);
        showShapedetails(circle);

        Triangle triangle = new Triangle(6.0, 4.0, 7.211);
        showShapedetails(triangle);
    }

    public static void showShapedetails(Shape shape) {
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }

}

