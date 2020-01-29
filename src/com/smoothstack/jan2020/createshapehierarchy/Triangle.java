package com.smoothstack.jan2020.createshapehierarchy;

public class Triangle implements Shape, Greeting {

    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle() {
        this(0,0);
    }

    @Override
    public double calculateArea() {
        return 0.5*this.getBase()*this.getHeight();
    }

    @Override
    public void display() {
        Greeting.super.display();
        System.out.printf("My dimension is (base x height) = %f x %f\n", this.getBase(), this.getHeight());
        Shape.super.display();
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
