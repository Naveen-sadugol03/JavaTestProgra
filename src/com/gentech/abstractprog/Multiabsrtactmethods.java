package com.gentech.abstractprog;

abstract class Shapes {

    abstract double calculateArea();


    abstract double calculatePerimeter();
}

abstract class Polygon extends Shapes {
    
    
    Polygon() {
        super();
    }
}
class Rect extends Polygon {
    double width;
    double height;

    Rect(double width, double height) {
        super();
        this.width = width;
        this.height = height;
    }

    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
public class Multiabsrtactmethods {

	public static void main(String[] args) {
		Rect rectangle = new Rect(5.0, 3.0);
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Perimeter of Rectangle: " + rectangle.calculatePerimeter());
	}

}
