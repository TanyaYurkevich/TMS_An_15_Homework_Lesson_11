package com.teachmeskills.Lesson11_HW.Task2.model;

import com.teachmeskills.Lesson11_HW.Task2.model.Shape;

public class Rectangle extends Shape {
    private double Width;
    private double Length;

    public Rectangle(double width, double length) {
        Width = width;
        Length = length;
    }

    @Override
    public double getPerimeterShape() {
        double PerRectangle = 2*(Width+Length);
        return PerRectangle;
    }
}
