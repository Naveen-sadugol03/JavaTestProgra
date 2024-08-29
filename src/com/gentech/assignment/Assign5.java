package com.gentech.assignment;

class Ass5{
	static Boolean func(int age) {
		if(age<18) {
			return false;
		}
		else {
			return true;
		}
	}
}
public class Assign5 {

	public static void main(String[] args) {
		int age=19;
		Boolean res=Ass5.func(age);
		if(res==true) {
			System.out.println("eligible for voting" );
		}
		else {
		System.out.println("Not eligible for voting" );
		}

	}

}
