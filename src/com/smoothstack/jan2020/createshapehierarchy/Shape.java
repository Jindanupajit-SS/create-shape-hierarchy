package com.smoothstack.jan2020.createshapehierarchy;

public interface Shape {

    double calculateArea();

    default void display() {
        System.out.printf("My area is %f.\n", this.calculateArea());
    }

}
