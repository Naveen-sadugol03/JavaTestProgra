package com.gentech.abstractprog;

abstract class Shape {

    abstract double calculateArea();
}

class Rectangle extends Shape  {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }
}
public class Abstractmethodreturn {

	public static void main(String[] args) {
		Shape rectangle = new Rectangle(5.0, 3.0);
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());

	}

}
