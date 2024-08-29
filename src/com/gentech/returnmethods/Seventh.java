package com.gentech.returnmethods;

class Seven
{
	int[] reverseprint()
	{
		int res[]=new int[11];
		int k=7;
		int j=0;
		for(int i=10;i>=0;i--)
		{
			res[j]=7*i;
			j++;
		}
		return res;
	}
}
public class Seventh {

	public static void main(String[] args) {
		Seven f=new Seven();
		int c[]=f.reverseprint();
		for(int i=0;i<c.length;i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
