package com.objects.inherdemos;
import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Account account;
        
        System.out.println("Select account type (1 for Savings, 2 for Current): ");
        int accountType = scanner.nextInt();
        
        if (accountType == 1) {
            account = new Savings(10); 
        } else if (accountType == 2) {
            account = new Current(100); 
        } else {
            System.out.println("Invalid account type.");
            return ;
        }
        while (true) {
            System.out.println("\nChoose an action:");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Exit");
            int choice = scanner.nextInt();
            switch (choice) {
            case 1:
                System.out.println("Current Balance: $" + account.getBalance());
                break;
            case 2:
                System.out.print("Enter withdrawal amount: ");
                double withdrawAmount = scanner.nextDouble();
                account.withdraw(withdrawAmount);
                break;
            case 3:
                System.out.print("Enter deposit amount: ");
                double depositAmount = scanner.nextDouble();
                account.deposit(depositAmount);
                break;
            case 4:
                System.out.println("Thank you for using the ATM.");
                scanner.close();
                return;
            default:
                System.out.println("Invalid choice.");
                break;
            }
        }
	}

}
