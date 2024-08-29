package com.gentech.abstractprog;


abstract class AbstractClassWithInstanceBlock {

    {
        System.out.println("Instance block in AbstractClass");
    }
}

class Subclass extends AbstractClassWithInstanceBlock {
    
}

public class Instanceblockalone {

	public static void main(String[] args) {
		
		Subclass sub=new Subclass();
	}

}
