package com.gentech.inheritance;

class Animal {
    void makeSound(String sound) {
        System.out.println("Animal makes a sound: " + sound);
    }
}

class Dog extends Animal {

    void makeSound(String sound) {
    	super.makeSound("Sound");
        System.out.println("Dog barks: " + sound);
    }
}

class Pet extends Dog {
    void makeSound(String sound) {
    	super.makeSound("Bark");
        System.out.println("Pet barks loudly: " + sound);
    }
}

public class Case4 {
    public static void main(String[] args) {
        Animal myAnimalPet = new Pet();
        myAnimalPet.makeSound("Woof"); 
    }
}