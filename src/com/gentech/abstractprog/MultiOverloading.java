package com.gentech.abstractprog;

abstract class Shapess {
    double width;
    double height;
    Shapess() {
        this.width = 0;
        this.height = 0;
    }

    
    Shapess(double width, double height) {
        this.width = width;
        this.height = height;
    }

    abstract double calculateArea();
    abstract double calculatePerimeter();
}

abstract class Polygons extends Shapess {
    

    Polygons() {
        super(); 
    }
}

class Rectangles extends Polygon {
	double width;
	double height;
    Rectangles(double width, double height) {
        super();
        this.width=width;
        this.height=height;
        
    }
    Rectangles(){
    	super();
    }
    double calculateArea() {
        return width * height;
    }

    double calculatePerimeter() {
        return 2 * (width + height);
    }
}
public class MultiOverloading {

	public static void main(String[] args) {
		 Rectangles rectangle = new Rectangles(5.0,3.0);
		
		 System.out.println("Rectangle - Area: " + rectangle.calculateArea());
	     System.out.println("Rectangle - Perimeter: " + rectangle.calculatePerimeter());
	    
		 
	}

}
