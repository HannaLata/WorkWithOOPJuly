package com.mainacad.square;

import com.mainacad.abs.AbstractShape;

import java.lang.annotation.Inherited;

public class Square extends AbstractShape {

    private double side;

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public Square(double side) {
        this.side = side;
    }

    public Square() {
    }

    @Override
    public double getArea() {
        return side*side;
    }
}
