package com.objectorientedprogram;

import java.util.Scanner;

public class StockPortfolio {
	Scanner scandata  = new Scanner(System.in);
	
	int NumOfStocks1, NumOfShares1, SharePrice1;
	int NumOfStocks2, NumOfShares2, SharePrice2;
	int NumOfStocks3, NumOfShares3, SharePrice3;

public StockPortfolio() {
	System.out.println("enter the stock1");
    NumOfStocks1 = scandata.nextInt();
    System.out.println("enter the stock1 sares");
    NumOfShares1 = scandata.nextInt();
    System.out.println("enter the stock1 price");
    SharePrice1 = scandata.nextInt();
    System.out.println("enter the stock2");
    NumOfStocks2 = scandata.nextInt();
    System.out.println("enter the stock2 sares");
    NumOfShares2 = scandata.nextInt();
    System.out.println("enter the stock2 price");
    SharePrice2 = scandata.nextInt();
    System.out.println("enter the stock3 stock");
    NumOfStocks3 = scandata.nextInt();
    System.out.println("enter the stock sares");
    NumOfShares3 = scandata.nextInt();
    System.out.println("enter the price");
    SharePrice3 = scandata.nextInt();
}

	void nameOfStocks(String a, String b, String c) {
		a = "Tata Power Share";
		b = "Adani Share";
		c = "Apollo Tyres Share";
		System.out.println("Share I have :- " + a + " , " + b + " , " + c);
	}

	void Debit() {
		Scanner sc = new Scanner(System.in);
		Scanner ammount = new Scanner(System.in);
		System.out.println("Enter the share num you want to sell:- ");
		System.out.println("1 for Tata Power, 2 for Adani, 3 for Adani");
		int shareName = ammount.nextInt();
		if (shareName == 1 || shareName == 2 || shareName == 3) {
			System.out.println("Enter share amount :- ");
			int shareAmount = ammount.nextInt();
			if (shareAmount <= SharePrice1 && shareName == 1) {
				System.out.println("You sold Tata Power share of amount :- " + shareAmount
						+ " Now Share remaining amount are :- " + (SharePrice1 - shareAmount));
			} else if (shareAmount <= SharePrice2 && shareName == 2) {
				System.out.println("You sold Adani share of amount :- " + shareAmount
						+ " Now Share remaining amount are:- " + (SharePrice2 - shareAmount));
			} else if (shareAmount <= SharePrice3 && shareName == 3) {
				System.out.println("You sold Apollo Tyres share of amount :- " + shareAmount
						+ " Now Share remaining amount are:- " + (SharePrice3 - shareAmount));
			} else {

				System.out.println("You don't have that much amount, Enter less amount");
			}
		} else {
			System.out.println("Enter proper number.");
		}
	}

	void Display() {
		int oneStock1 = SharePrice1 / NumOfStocks1;
		int oneShare1 = oneStock1 / NumOfShares1;
		System.out.println(
				"The value of Tata Power one Stock:- " + oneStock1 + " and total Stocks I have-> " + NumOfStocks1);
		System.out.println("The value of Tata Power one Share:- " + oneShare1 + " and total Stocks I have-> "
				+ NumOfShares1 + " Shares, worth " + SharePrice1 + "rs");
		System.out.println();
		int oneStock2 = SharePrice2 / NumOfStocks2;
		int oneShare2 = oneStock2 / NumOfShares2;
		System.out
				.println("The value of Adani one Stock:- " + oneStock2 + " and total Stocks I have-> " + NumOfStocks2);
		System.out.println("The value of Adani one Share:- " + oneShare2 + " and total Stocks I have-> " + NumOfShares2
				+ " Shares, worth " + SharePrice2 + "rs");
		System.out.println();
		int oneStock3 = SharePrice3 / NumOfStocks3;
		int oneShare3 = oneStock3 / NumOfShares3;
		System.out.println(
				"The value of Apollo Tyres one Stock:- " + oneStock3 + " and total Stocks I have-> " + NumOfStocks3);
		System.out.println("The value of Apollo Tyres one Share:- " + oneShare3 + " and total Stocks I have-> "
				+ NumOfShares3 + " Shares, worth " + SharePrice3 + "rs");
	}
}