package com.smoothstack.jan2020.createshapehierarchy;

public class Rectangle implements Shape, Greeting {

    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle() {
        this(0,0);
    }


    @Override
    public double calculateArea() {
        return this.width*this.height;
    }

    @Override
    public void display() {
        Greeting.super.display();
        System.out.printf("My dimension is (width x height) = (%f x %f)\n",this.getWidth(), this.getHeight());
        Shape.super.display();
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
