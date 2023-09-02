package com.objects.overloading;

public class Employee {
	String name;
    String designation;
    
    public Employee(String name, String designation) {
        this.name = name;
        this.designation = designation;
    }
    
    public double calcBonus(double basicAllowance) {
        return basicAllowance * 0.1; // 10% of basic allowance
    }
    public double calcBonus(double basicAllowance, double carAllowance) {
        return (basicAllowance + carAllowance) * 0.12; // 12% of total allowances
    }
    
    public double calcBonus(double basicAllowance, double carAllowance, double houseAllowance) {
        return (basicAllowance + carAllowance + houseAllowance) * 0.15; // 15% of total allowances
    }

}
