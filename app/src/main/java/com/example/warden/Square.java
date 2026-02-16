package com.example.warden;

public class Square extends Shape
{
    private int base;

    public Square(int base)
    {
        this.base = base;
    }

    public double getArea() {
        return (base * base);
    }
}
