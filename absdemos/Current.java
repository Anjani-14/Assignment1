package com.objects.absdemos;

public class Current extends Bank {

	 public Current(double initialBalance) {
	        super(initialBalance);
	    }

	    @Override
	    public void withdraw(double amount) {
	        if (balance >= amount) {
	            balance -= amount;
	            System.out.println("Withdrawal of $" + amount + " from Current successful.");
	        } else {
	            System.out.println("Insufficient funds in Current account.");
	        }
	    }
	    @Override
	    public void deposit(double amount) {
	        if (amount > 0) {
	            balance += amount;
	            System.out.println("Deposit of $" + amount + " to Current successful.");
	        } else {
	            System.out.println("Invalid deposit amount for Current.");
	        }
	    }
			
		}


