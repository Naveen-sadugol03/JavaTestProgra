package com.gentech.returnmethods;

class Factorialnum
{
	int factorial(int num)
	{
		int f=1;
		for(int i=1;i<=num;i++)
		{
			f=f*i;
		}
		return f;
	}
}
public class Factorial {

	public static void main(String[] args) {
		Factorialnum f=new Factorialnum();
		int num=5;
		int res=f.factorial(num);
		System.out.print(res);
	}

}
