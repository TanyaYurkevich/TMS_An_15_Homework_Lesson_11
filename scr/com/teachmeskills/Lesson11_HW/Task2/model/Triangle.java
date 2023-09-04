package com.teachmeskills.Lesson11_HW.Task2.model;

import com.teachmeskills.Lesson11_HW.Task2.model.Shape;

public class Triangle extends Shape {
    private double Side1;
    private  double Side2;
    private double Side3;

    public Triangle(double side1, double side2, double side3) {
        Side1 = side1;
        Side2 = side2;
        Side3 = side3;
    }

    @Override
    public double getPerimeterShape() {
        double PerTriangle = Side1+Side3+Side2;
        return PerTriangle;
    }
}
