package com.mainacad;

import com.mainacad.abs.Shape;
import com.mainacad.circle.Circle;
import com.mainacad.rectangle.Rectangle;
import com.mainacad.square.Square;
import com.mainacad.trapezoid.Trapezoid;
import com.mainacad.triangle.Triangle;

public class ApplicationRunner {

    static String myName = "Hanna Lata";

    public static void main(String[] args) {

        System.out.println("My name is " +  myName);

        Square square = new Square();
        square.setSide(10.0);

        System.out.println("Square with side " + square.getSide() + " has area " + square.getArea());

        Circle circle = new Circle(10.0);

        System.out.println("Circle with side " + circle.getRadius() + " has area " + circle.getArea());

        Triangle triangle = new Triangle(10.0, 15.0);
        Rectangle rectangle = new Rectangle(10.0, 15.0);
        Trapezoid trapezoid = new Trapezoid(10.0, 15.0, 20.0);

        Shape maxShape = null;
        Shape minShape = null;

        if (square.getArea() > circle.getArea()) {
            maxShape = square;
        } else {
            maxShape = circle;
        }
        if (maxShape.getArea() < triangle.getArea()) {
            maxShape = triangle;
        }
        if (maxShape.getArea() < rectangle.getArea()) {
            maxShape = rectangle;
        }
        if (maxShape.getArea() < trapezoid.getArea()) {
            maxShape = trapezoid;
        }

        System.out.println("Max shape is " + maxShape.getClass().getSimpleName() + " and has area " + maxShape.getArea());

        if (square.getArea() < circle.getArea()) {
            minShape = square;
        } else {
            minShape = circle;
        }
        if (minShape.getArea() > triangle.getArea()) {
            minShape = triangle;
        }
        if (minShape.getArea() > rectangle.getArea()) {
            minShape = rectangle;
        }
        if (minShape.getArea() > trapezoid.getArea()) {
            minShape = trapezoid;
        }

        System.out.println("Min shape is " + minShape.getClass().getSimpleName() + " and has area " + minShape.getArea());


    }
}

