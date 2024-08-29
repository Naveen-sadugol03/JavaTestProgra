package com.gentech.returnmethods;

class Sumofele{
	int sumprint(int a[])
	{
		int res=0;
		for(int i=0;i<a.length;i++)
		{
			res=res+a[i];
			
		}
		return res;
	}
}
public class Sumofall {

	public static void main(String[] args) {
		Sumofele f=new Sumofele();
		int a[]= {1,2,3,4,5,6};
		int c=f.sumprint(a);
		System.out.print(c+" ");
	}

}

	

