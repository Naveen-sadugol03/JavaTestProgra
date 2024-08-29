package com.gentech.assignment;

class Ass7{
	int func() {
		int x=2;
		int sum=0;
		for(int i=1;i<=10;i++) {
			int res=x*i;
			sum=sum+res;
		}
		return sum;
	}
}
public class Assign7 {

	public static void main(String[] args) {
		Ass7 o=new Ass7();
		int res=o.func();
		System.out.println(res+"");

	}

}
