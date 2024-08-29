package com.gentech.assignment;

class Ass1
{
	static boolean[]  func(boolean arr[]) {
		boolean x[]=new boolean[arr.length];
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			x[k]=arr[i];
			k++;
		}
		return x;
	}

}

public class Assign1{

	public static void main(String[] args) {
		boolean arr[]= { true,false,true,false};
		boolean x[]= Ass1.func(arr);
		for(int i=0;i<x.length;i++) {
			System.out.println(x[i]+" ");
		}
		
	}

}
