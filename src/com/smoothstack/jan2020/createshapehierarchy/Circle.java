package com.smoothstack.jan2020.createshapehierarchy;

public class Circle implements Shape, Greeting {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle() {
        this(0);
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(this.getRadius(), 2);
    }

    @Override
    public void display() {

        Greeting.super.display();
        System.out.printf("My dimension (radius) is %f.\n", this.getRadius());
        Shape.super.display();
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
