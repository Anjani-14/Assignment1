package com.objects.absdemos;
import java.util.Scanner;

public class ATMMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        double initialBalance = 1000.0; 
        Bank account;

        System.out.println("Welcome to the Virtual ATM!");

        while (true) {
            System.out.println("Choose an option:");
            System.out.println("1. Savings Account");
            System.out.println("2. Current Account");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            
            if (choice == 1) {
                account = new Savings(initialBalance);
            } else if (choice == 2) {
                account = new Current(initialBalance);
            } else if (choice == 3) {
                System.out.println("Thank you for using the Virtual ATM. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please select a valid option.");
                continue;
            }
            while (true) {
                System.out.println("Choose an action:");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Go back to Account Selection");

                int action = scanner.nextInt();

                switch (action) {
                    case 1:System.out.print("Enter the amount to withdraw: $");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit: $");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 3:
                    System.out.println("Your account balance: $" + account.getBalance());
                    break;
                case 4:
                    System.out.println("Returning to Account Selection.");
                    break;
                default:
                    System.out.println("Invalid action. Please select a valid action.");
                    break;
            }
                if (action == 4) {
                    break;
                }
            }
        }

        scanner.close();
    }

	}

