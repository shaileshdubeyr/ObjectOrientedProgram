package com.objectorientedprogram;

public class Stock {

	public static void main(String[] args) {
		StockPortfolio sareDetails = new StockPortfolio();
		sareDetails.nameOfStocks(" ", " ", " ");
		System.out.println();
		sareDetails.Display();
		System.out.println();
		sareDetails.Debit();
	}
}
