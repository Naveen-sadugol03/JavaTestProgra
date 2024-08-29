package com.gentech.returnmethods;

class Secondarray
{
	short[] Secondhalfprint(short a[])
	{
		short res[]=new short[a.length/2];
		int k=0;
		for(int i=a.length/2;i<a.length;i++)
		{
			res[k]=a[i];
			k++;
		}
		return res;
	}
}
public class Secondhalf {

	public static void main(String[] args) {
		Secondarray f=new Secondarray();
		short a[]= {1,2,3,4,5,6};
		short c[]=f.Secondhalfprint(a);
		for(int i=0;i<(c.length);i++)
		{
			System.out.print(c[i]+" ");
		}

	}

}
