package com.company;

/**
 * This program demonstrates polymorphic behavior.
 */

public class AbstractDemo
{
    public static void main(String[] args)
    {
        Shape shape;

        Rectangle rect = new Rectangle(); // assign subclass reference to subclass variable
        shape = rect; // shape points to the object rect.
        shape.setValues(78, 5); // Set data in Rectangle's object
        System.out.println("Area of rectangle : " + shape.getArea()); //Display the area of rectangle


        Triangle tri = new Triangle(); // assign subclass reference to subclass variable
        shape = tri; // shape points to the object rect.
        shape.setValues(34,3); // Set data in Triangle's object
        System.out.println("Area of triangle : " + shape.getArea()); //Display the area of triangle
    }
}