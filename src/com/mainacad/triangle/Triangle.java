package com.mainacad.triangle;

import com.mainacad.abs.AbstractShape;

public class Triangle extends AbstractShape {

    private double base;
    private double height;

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle() {
    }

    @Override
    public double getArea() {
        return (base*height)/2;
    }
}
