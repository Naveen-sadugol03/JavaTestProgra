package com.gentech.assignment;

class Ass6{
	boolean logical(int x) {
		if(x<20 && x!=0) {
			return true;
		}
		else {
			return false;
		}
	}
}
public class Assign6 {

	public static void main(String[] args) {
		int x=20;
		Ass6 o=new Ass6();
		boolean res=o.logical(x);
		System.out.println(res+"");
		
	}

}
