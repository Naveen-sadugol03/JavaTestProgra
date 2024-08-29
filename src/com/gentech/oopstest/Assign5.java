package com.gentech.oopstest;

class OuterClass {
    private String outerField = "Hello from OuterClass";
    class InnerClass {
        void display() {
            System.out.println("InnerClass accessing: " + outerField);
        }
    }
}

public class Assign5{
    public static void main(String[] args) {
   
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();

        inner.display(); 
    }
}
