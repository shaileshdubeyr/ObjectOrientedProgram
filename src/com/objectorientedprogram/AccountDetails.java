package com.objectorientedprogram;

import java.util.Scanner;

public class AccountDetails {
	static Scanner customerchoice = new Scanner(System.in);

	public static double debitMoney(double amount)  {
		System.out.println("enter the amount to withdraw");
		double debitAmount = customerchoice.nextDouble();
		if (amount >= debitAmount)
			return amount - debitAmount;
		else {
			System.out.println("exceeded the limit Please check balance");
			return amount;
		}
	}

	public static double addAmount(double amount) {
		System.out.println("deposit the money");
		double depositAmount = customerchoice.nextDouble();
		return depositAmount + amount;
	}

	public void mainOperation() {
		double amount = 0;
		while (true) {
			System.out.println("enter the a to add amount d to debit amount c to check balance E to Exit");
			char choice = customerchoice.next().charAt(0);
			switch (choice) {
			case 'a':
				amount = addAmount(amount);
				System.out.println("the balance is " + amount);
				break;
			case 'd':
				amount = debitMoney(amount);
				System.out.println("The transection is successfull");
				System.out.println("the balance is " + amount);
				break;
			case 'c':
				System.out.println("the balance is " + amount);
				break;
			case 'e':
				System.out.println("the balance is " + amount);
				break;
			default:
				System.out.println("Unable to preoess Entered wong input");
				break;
			}
			if (choice == 'e') {
				break;
			}
		}
	}
}
