package com.mainacad.rectangle;

import com.mainacad.abs.AbstractShape;

public class Rectangle extends AbstractShape {

    private double side1;
    private double side2;

    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public Rectangle(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public Rectangle() {
    }

    @Override
    public double getArea() {
        return side1*side2;
    }
}
