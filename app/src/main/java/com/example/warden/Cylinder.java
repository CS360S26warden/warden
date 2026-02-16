package com.example.warden;

public class Cylinder extends Shape
{
    private int radius;
    private int height;

    public Cylinder(int radius, int height, int x, int y)
    {
        this.radius = radius;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public double getArea() {
        return 3.14*radius*radius*height;
    }
}
