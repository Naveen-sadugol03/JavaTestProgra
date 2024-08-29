package com.gentech.oopstest;

abstract class Assignstatic{
	{
		System.out.println("this is instance block");
	}
	static
	{
		System.out.println("this is static block");
	}
}

class Sub extends Assignstatic 
{
	
}

public class Assign3
{
	public static void main(String[] args)
	{
		Sub o=new Sub();
	
	}
}


	


