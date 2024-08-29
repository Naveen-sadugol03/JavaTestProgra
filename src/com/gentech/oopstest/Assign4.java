package com.gentech.oopstest;

class Person {
    String name;
    Person(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("Name: " + name);
    }
}

public class Assign4 {
    public static void main(String[] args) {

        Person person = new Person("Naveen");

        person.display(); 
    }
}