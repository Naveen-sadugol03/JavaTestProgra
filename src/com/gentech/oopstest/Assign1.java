package com.gentech.oopstest;
class Assign
{
	private int x;
	private int y;
	public Assign(int x,int y)
	{
		this.x=x;
		this.y=y;
		System.out.println(x+y);
	}
}

class A extends Assign
{
	public A(int x,int y) {
		super(x,y);
		System.out.println("this is class A");
	}
	
}

class B extends A
{
	B(int x,int y){
		super(x,y);
		System.out.println("this is class B");
	}
	
}
	

public class Assign1
{
	public static void main(String[] args)
	{
		B obj=new B(12,13);
	}
}

		