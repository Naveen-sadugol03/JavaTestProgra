package com.gentech.returnmethods;

class Squareten
{
	int[] squareprint()
	{
		int res[]=new int[11];
		
		for(int i=1;i<=10;i++)
		{
			int square;
			square=i*i;
			res[i]=square;
			
		}
		return res;
	}
}
public class Square {

	public static void main(String[] args) {
		Squareten f=new Squareten();
		
		int c[]=f.squareprint();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
