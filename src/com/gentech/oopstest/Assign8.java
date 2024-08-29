package com.gentech.oopstest;

class Encap{
	private int accountno;
	public int getaccountno()
	{
		return accountno;
	}
	public void setaccountno(int accountno)
	{
		this.accountno=accountno;
	}
}
public class Assign8
{	
	public static void main(String[] args)
	{
		Encap o=new Encap();
		o.setaccountno(1111010);
		int res=o.getaccountno();
		System.out.println("result : "+res);
	}
}
