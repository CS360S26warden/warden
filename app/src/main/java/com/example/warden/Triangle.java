package com.example.warden;

public class Triangle extends Shape {
    private int base;
    private int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    public double getArea() {
        return (base * height) / 2.0;
    }
}
