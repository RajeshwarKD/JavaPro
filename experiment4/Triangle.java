package com.company;

/**
 *  This class Triangle calculates
 *  the area of triangle
 */

public class Triangle extends Shape
{
    //Calculate and return area of triangle
    public double getArea()
    {
        return (getHeight() * getWidth()) / 2;
    }
}