package com.objects.absdemos;

public class Savings extends Bank {
	 public Savings(double initialBalance) {
	        super(initialBalance);
	    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " from Savings successful.");
        } else {
            System.out.println("Insufficient funds in Savings account.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit of $" + amount + " to Savings successful.");
        } else {
            System.out.println("Invalid deposit amount for Savings.");
        }
    }

}
