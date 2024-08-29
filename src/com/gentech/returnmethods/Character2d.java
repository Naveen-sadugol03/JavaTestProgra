package com.gentech.returnmethods;

class Char
{
	char[][] firstrow(char x[][])
	{
		char y[][]=new char[x.length][x[0].length];
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<x[0].length;j++)
			{
				y[i][j]=x[i][j];
			}
		}
		return y;
	}
}
public class Character2d {

	public static void main(String[] args) {
		Char c=new Char();
		char z[][]= {{'a','b','c'},{'d','e','f'}};
		char res[][]=c.firstrow(z);
		for(int i=0;i<1;i++)
		{
			for(int j=0;j<res[0].length;j++)
			{
				System.out.print(res[i][j]+" ");
			}
		}
		

	}

}
