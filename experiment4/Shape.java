package com.company;

/**
 *  The Shape class is an abstract class that holds
 *  general data about a shape.
 */

public abstract class Shape
{
    private double height;  // To hold height.
    private double width;  //To hold width or base

    // Set height and width
    public void setValues(double height, double width)
    {
        this.height = height;
        this.width = width;
    }

    //Get height
    public double getHeight()
    {
        return height;
    }

    //Get width
    public double getWidth()
    {
        return width;
    }

    // The getArea method is abstract.
    // It must be overridden in a subclass.

    public abstract double getArea();
}
