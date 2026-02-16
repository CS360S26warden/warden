package com.example.warden;

public class Rectangle {
    private int width;
    private int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
    }
    public double getArea(){
        return width*length;
    }
}
