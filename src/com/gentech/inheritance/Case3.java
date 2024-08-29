package com.gentech.inheritance;

class Person {
   
    Person(String name, int age) {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
    }
}

class Employe extends Person {
		
        Employe(String jobTitle, double salary) {
            super("Naveen", 22); 
            System.out.println("Job Title: " + jobTitle);
            System.out.println("Salary: $" + salary);
        }
    }

class Manager extends Employe {
    String department;
    Manager( ) {
        super("Team Lead", 55000.0); 
        department="Marketing";
        System.out.println("Department: " + department);
    }
}

public class Case3 {

    public static void main(String[] args) {
    	Employe emp=new Employe("TeamLead",85000.0);
    	Manager manager2 = new Manager();
    }
}
