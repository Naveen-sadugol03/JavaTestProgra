package com.gentech.returnmethods;

class Reversearr
{
	int[] reverseprint(int a[])
	{
		int res[]=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--)
		{
			res[k]=a[i];
			k++;
		}
		return res;
	}
}
public class Reversearray {

	public static void main(String[] args) {
		Reversearr f=new Reversearr();
		int a[]= {1,2,3,4,5,6};
		int c[]=f.reverseprint(a);
		for(int i=0;i<(c.length);i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
