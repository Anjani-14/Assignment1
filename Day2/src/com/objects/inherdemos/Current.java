package com.objects.inherdemos;

public class Current extends Account {
	public Current(double balance) {
        super(balance);
	}

	@Override
	public void withdraw(double amount) {
		if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful from Current. Current balance: " + balance);
        } else {
            System.out.println("Insufficient balance in Current.");
        }
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
        System.out.println("Deposit successful to Current. Current balance: " + balance);
    }
	}


