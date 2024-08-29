package com.gentech.polymorphism;

class Animal {

    public void makeSound() {
        System.out.println("Some sound");
    }
}


class Dog extends Animal {
    
    public void makeSound() {
        System.out.println("Bark");
    }
}


class Cat extends Animal {
   
   
    public void makeSound() {
        System.out.println("Meow");
    }
}

public class Firstexam {
    public static void main(String[] args) {
        Animal myAnimal;

     
        Dog dog = new Dog();
        myAnimal=dog;
        myAnimal.makeSound(); 

 
        Cat cat = new Cat();
        myAnimal=cat;
        myAnimal.makeSound(); 
    }
}