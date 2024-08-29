package com.gentech.assignment;

class Ass9{
	int func(int num) {
		
			return num;		
	}
}
public class Assign9 {

	public static void main(String[] args) {
		
		Ass9 o=new Ass9();
		for(int i=21;i>=11;i--) {
			if(i%2!=0) {
			int res=o.func(i);
			System.out.println(res+" ");
			}
		}
		

	}

}
