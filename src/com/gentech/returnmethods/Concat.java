package com.gentech.returnmethods;

class concatenation
{   
	String concat(String str[])
	{    
		String s="";
		for(int i=0;i<str.length;i++)
		{  
			s+=str[i];
		}return s;
	}
}
public class Concat {
	public static void main(String args[]) {
		concatenation o=new concatenation();
		String str[]= {"Naveen","Sadugol"};
		String s=o.concat(str);			 
		System.out.println(s);
	}

}