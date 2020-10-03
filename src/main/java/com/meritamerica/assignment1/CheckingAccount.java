package com.meritamerica.assignment1;

import java.lang.Math;

import java.text.NumberFormat;

//Creates Savings Account Class and methods computing withdawals, deposits and future value calculated with interest
public class CheckingAccount {
	private double balance;
	private double interestRate;
	private int years;
	
	CheckingAccount(double openingBalance) {
		super();
		this.balance = openingBalance;
		this.interestRate = 1.0 / 10000.0;
		this.years = 3;

	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public double getInterestRate() {
		return this.interestRate;
	}
	
	/*This will return a true or false - withdraw amount cannot be negative or more than is in Checking Account Balance.
	  This also subtracts the withdraw amount from Savings Account Balance if true*/
	public boolean withdraw(double amount) {
		if (amount < 0 || amount > this.balance) {
			return false;
		} else {
			this.balance -= amount;
			return true;
		}
	}
	
	/*This will return a true or false - deposit amount cannot be negative. This also adds the deposit amount to Checking
	  Account Balance if true*/
	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			this.balance += amount;
			return true;
		}
	}
	
	//futureValue method calculates future value of Checking Account
	public double futureValue(int years) {
		return this.balance * Math.pow(1 + this.interestRate, years);
	}

	//toString method specifies the format for digits to the right of the decimal and the information to print
	public String toString() {
		NumberFormat defaultFormat = NumberFormat.getInstance();
		defaultFormat.setMinimumFractionDigits(2);
		
		return "Checking Account Balance: $" + defaultFormat.format(balance) + "\n" + "Checking Account Interest Rate: " + (this.interestRate)*100 + "%"
				+ "\n" + "Checking Account Balance in " + years + " years: $" + defaultFormat.format(futureValue(this.years));

	}
	
	//Creates CheckingAccount Object of the amount of $100
	public static void main(String[] args) {
		
		CheckingAccount checkingAccount = new CheckingAccount(100);
		System.out.println(checkingAccount);	
		
	}
}