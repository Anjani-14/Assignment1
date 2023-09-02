package com.objects.inherdemos;

public class Savings extends Account {
	public Savings(double balance) {
        super(balance);
        
}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance - 100) {
            balance -= amount;
            System.out.println("Withdrawal successful from Savings. Current balance: $" + balance);
        } else {
            System.out.println("Insufficient balance in Savings.");
        }		
	}

	@Override
	public void deposit(double amount) {
		 balance += amount;
	        System.out.println("Deposit successful to Savings. Current balance: $" + balance);
	        
	}
	}
