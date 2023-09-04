package com.teachmeskills.Lesson11_HW.Task2;

import com.teachmeskills.Lesson11_HW.Task2.model.Circle;
import com.teachmeskills.Lesson11_HW.Task2.model.Rectangle;
import com.teachmeskills.Lesson11_HW.Task2.model.Shape;
import com.teachmeskills.Lesson11_HW.Task2.model.Triangle;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(new Triangle(3,5,7));
        shapes.add(new Circle(5));
        shapes.add(new Rectangle(5,8));
        shapes.add(new Triangle(5,9,8));
        shapes.add(new Circle(10));

        for (Shape element:shapes){
            System.out.println(element.getPerimeterShape());
        }
    }
}
