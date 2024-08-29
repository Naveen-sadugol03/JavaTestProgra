package com.gentech.inheritance;
class Sports
{
	Sports(String sname,String category)
	{
		System.out.println("Sports Name :"+sname);
		System.out.println("Sports category :"+category);
	}
}
class Indoor extends Sports
{
	String location ;
	Indoor( )
	{
		super("Chess","Indoor");
		location="Delhi";
		System.out.println("Location :"+location);
	}
}
class Outdoor extends Sports
{
	String location;
	Outdoor()
	{
		super("Hockey","Outdoor");
		location="Bangalore";
		System.out.println("Location :"+location);
	}
}


public class Hierarchial {

	public static void main(String[] args) {
		Indoor o=new Indoor();
		Outdoor o1=new Outdoor();

	}

}
