package com.gentech.abstractprog;

abstract class Show {

    static void printMessage() {
        System.out.println(" Print Message");
    }
    
    static void showDetails(String name) {
        System.out.println(" Show Details - Name: " + name);
    }


    static int addNumbers(int a, int b) {
        return a + b;
    }
}
public class Multiplestatic {

	public static void main(String[] args) {
		Show.printMessage();
        Show.showDetails("Naveen Sadugol");
        int sum = Show.addNumbers(5, 10);
        System.out.print(" "+sum);
	}

}
