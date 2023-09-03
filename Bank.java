package com.objects.absdemos;

public abstract class Bank {

	    protected double balance;

	    public Bank(double initialBalance) {
	        balance = initialBalance;
	    }

	    public abstract void withdraw(double amount);

	    public abstract void deposit(double amount);

	    public double getBalance() {
	        return balance;
	    }
	}
