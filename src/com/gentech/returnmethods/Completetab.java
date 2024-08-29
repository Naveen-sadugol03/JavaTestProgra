package com.gentech.returnmethods;

class Comp
{
	int[] print(int num)
	{
		int res[]=new int[11];
		int j=0;
		for(int i=0;i<=10;i++)
		{
			res[j]=num*i;
			j++;
		}
		return res;
	}
}
public class Completetab {

	public static void main(String[] args) {
		Comp f=new Comp();
		
		int c[]=f.print(10);
		for(int i=0;i<c.length;i++)
		{
			System.out.println("10"+"*"+i+"="+c[i]);
		}

	}

}
	