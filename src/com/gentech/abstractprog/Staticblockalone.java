package com.gentech.abstractprog;


abstract class AbstractClassWithStaticBlock {


    static {
        System.out.println("Static block in AbstractClass");
    }
}

class Child extends AbstractClassWithStaticBlock {
    
}
public class Staticblockalone {

	public static void main(String[] args) {
		Child instance = new Child();

	}

}
