package com.smoothstack.jan2020.createshapehierarchy;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3, 5);
	    Circle circle = new Circle(10);
	    Triangle triangle = new Triangle(10, 20);

        displayShape(rectangle);
	    displayShape(circle);
	    displayShape(triangle);
    }

    public static void displayShape(Shape shape) {
        shape.display();
    }
}
