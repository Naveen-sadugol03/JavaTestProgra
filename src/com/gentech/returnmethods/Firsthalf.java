package com.gentech.returnmethods;

class Firstarray
{
	int[] firsthalfprint(int a[])
	{
		int res[]=new int[a.length/2];
		int k=0;
		for(int i=0;i<(a.length/2);i++)
		{
			res[k]=a[i];
			k++;
		}
		return res;
	}
}
public class Firsthalf {

	public static void main(String[] args) {
		Firstarray f=new Firstarray();
		int a[]= {1,2,3,4,5,6};
		int c[]=f.firsthalfprint(a);
		for(int i=0;i<(c.length);i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
