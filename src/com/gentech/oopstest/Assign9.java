package com.gentech.oopstest;
class Animals {

    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dogs extends Animals {

    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}


public class Assign9 {
    public static void main(String[] args) {

        Animals myAnimal ;
        myAnimal = new Dogs();
        myAnimal.makeSound(); 
          
        
    }
}