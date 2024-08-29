package com.gentech.inheritance;

class Vehicle {

	Vehicle() {
		System.out.println("Default Vehicle Constructor");
	}
	Vehicle(String type, int wheels) {
		System.out.println("Vehicle Type: " + type);
		System.out.println("Number of Wheels: " + wheels);
	}
}
class Car extends Vehicle {
	String model;
	Car() {
    	super(); 
        System.out.println("Default Car Constructor");
    }
	Car(String model) {
		super("Car", 4);
		
		System.out.println("Car Model: " + model);
	}
}
public class Case2 {

	public static void main(String[] args) {
		Car car1 = new Car("Toyota");
		Car car2=new Car();

	}

}
