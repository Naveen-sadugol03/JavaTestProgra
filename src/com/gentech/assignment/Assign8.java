package com.gentech.assignment;

class Ass8{
	byte[] func(byte x[]) {
		byte y[]=new byte[x.length];
		int k=0;
		for(int i=0;i<x.length;i++) {
			y[k]=x[i];
			k++;
		}
		return y;
	}
}
public class Assign8 {

	public static void main(String[] args) {
		byte x[]= {1,2,3,4,5};
		Ass8 o=new Ass8();
		byte[] res=o.func(x);
		for(int i=0;i<x.length;i++) {
			System.out.println(res[i]+"");
		}
		

	}

}
