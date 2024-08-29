package com.gentech.inheritance;
class Employee
{
	Employee(String ename,String jobname)
	{
		System.out.println("Employee Name :"+ename);
		System.out.println("Employee Job :"+jobname);
	}
}
class Department extends Employee
{
	String deptName;
	Department(String Dname, String Location )
	{
		super("Santosh","Manager");
		deptName="Accounting";
		System.out.println("Deaprtment :"+deptName);
	}
}
class Project extends Department
{
	String projectName;
	Project()
	{
		super("Accounting","Bangalore");
		projectName="ProjectA";
		System.out.println("Project :"+projectName);
	}
}


public class Multilevel {

	public static void main(String[] args) {
		Project o=new Project();

	}

}
