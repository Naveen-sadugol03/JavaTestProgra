package com.gentech.inheritance;

class Payment
{
	Payment(String payname,int modenumber)
	{
		System.out.println("Employee Name :"+payname);
		System.out.println("Employee Job :"+modenumber);
	}
}
class Online extends Payment
{
	String payName;
	Online()
	{
		super("UPI",2);
		payName="Scan QR code ";
		System.out.println("Deaprtment :"+payName);
	}
}

public class Case1 {

	public static void main(String[] args) {
		Online o=new Online();

	}

}
