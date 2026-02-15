package com.company;

class Box {
    double width;
    double height;
    double depth;

    // This is the constructor for Box.
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    // compute and return volume - Volume of box
    double volume() {
        return width * height * depth;
    }

    // compute and return volume - surface area
    double surface() {
        return (2*((width * height) + (height * depth) + (depth * width)));
    }
}

public class boxVolumeSurface {
    public static void main(String[] args) {
        // declare, allocate, and initialize Box objects
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);

        double vol1, sur1, vol2, sur2;

        // get volume of first box
        vol1 = myBox1.volume();
        sur1 = myBox1.surface();
        System.out.println("Volume of first box " + vol1);
        System.out.println("Surface of first box " + sur1);

        // get volume of second box
        vol2 = myBox2.volume();
        sur2 = myBox2.surface();
        System.out.println("Volume of second box " + vol2);
        System.out.println("Surface of second box " + sur2);
    }
}
