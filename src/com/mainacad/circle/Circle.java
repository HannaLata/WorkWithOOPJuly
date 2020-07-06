package com.mainacad.circle;

import com.mainacad.abs.AbstractShape;

public class Circle extends AbstractShape {

    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
    }

    @Override
    public double getArea() {
        return radius*radius*Math.PI;
    }
}
