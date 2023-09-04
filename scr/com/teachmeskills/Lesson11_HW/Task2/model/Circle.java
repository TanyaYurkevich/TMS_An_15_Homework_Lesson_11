package com.teachmeskills.Lesson11_HW.Task2.model;

import com.teachmeskills.Lesson11_HW.Task2.model.Shape;

public class Circle extends Shape {
    private double R;
    private double Pi;

    public Circle(double radius) {
        this.R = radius;
        this.Pi = Math.PI;

    }

    @Override
    public double getPerimeterShape() {
        return 2*Pi*R;
    }
}
