package com.gentech.inheritance;

class Anima {

    String name;
    Anima(String name) {
        
        System.out.println("Animal name: " + name);
    }
}

class Dogs extends Anima {
   
     String name;
    Dogs(String name) {
        super(name);
        
        System.out.println("Dog name: " + name);
    }
}

class Petss extends Dogs{
	String name;
	Petss(String name){
		super(name);
			
			System.out.println("Pets name: " + name);
	}
}

public class Variable {
    public static void main(String[] args) {
        Petss myDog = new Petss("Buddy");  
    }
}
