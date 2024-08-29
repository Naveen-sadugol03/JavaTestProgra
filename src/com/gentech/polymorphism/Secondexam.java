package com.gentech.polymorphism;

abstract class Employee {
    public abstract double calculateSalary();
}


class FullTimeEmployee extends Employee {
    private double annualSalary;

    public FullTimeEmployee(double annualSalary) {
        this.annualSalary = annualSalary;
    }

   
    public double calculateSalary() {
        return annualSalary / 12; 
    }
}


class PartTimeEmployee extends Employee {
    private double hourlyWage;
    private int hoursWorked;

    public PartTimeEmployee(double hourlyWage, int hoursWorked) {
        this.hourlyWage = hourlyWage;
        this.hoursWorked = hoursWorked;
    }
    public double calculateSalary() {
        return hourlyWage * hoursWorked; 
    }
}

public class Secondexam {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee(60000);
        Employee emp2 = new PartTimeEmployee(20, 80);

        System.out.println("Full-time  $" + emp1.calculateSalary());
        System.out.println("Part-time  $" + emp2.calculateSalary());
    }
}
