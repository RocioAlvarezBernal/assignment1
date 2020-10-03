package com.meritamerica.assignment1;

import java.lang.Math;

import java.text.NumberFormat;

//Creates Savings Account Class and methods computing withdawals, deposits and future value calculated with interest
public class SavingsAccount {
	private double balance;
	private double interestRate;
	private int years;

	SavingsAccount(double openingBalance) {
		super();
		this.balance = openingBalance;
		this.interestRate = 1.0 / 100.0;
		this.years = 3;

	}

	public double getBalance() {
		return this.balance;
	}

	public double getInterestRate() {
		return this.interestRate;
	}

	/*This will return a true or false - withdraw amount cannot be negative or more than is in Savings Account Balance.
	  This also subtracts the withdraw amount from Savings Account Balance if true*/
	public boolean withdraw(double amount) {
		if (amount < 0 || amount > this.balance) {
			return false;
		} else {
			this.balance -= amount;
			return true;
		}
	}

	/*This will return a true or false - deposit amount cannot be negative. This also adds the deposit amount to Savings
	  Account Balance if true*/
	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			this.balance += amount;
			return true;
		}
	}

	//futureValue method calculates future value of Savings Account
	public double futureValue(int years) {
		return this.balance * Math.pow(1 + this.interestRate, years);
	}

	//toString method specifies the format for decimal places and what we information to print
	public String toString() {
		NumberFormat defaultFormat = NumberFormat.getInstance();
		defaultFormat.setMinimumFractionDigits(2);
		
		return "Savings Account Balance: $" + defaultFormat.format(balance) + "\n" + "Savings Account Interest Rate: " + (this.interestRate)*100 + "%" +
				"\n" + "Savings Account Balance in " + years + " years: $" + defaultFormat.format(futureValue(this.years));

	}
	
	//Creates SavingsAccount Object of the amount of $1,000
	public static void main(String[] args) {
		
		SavingsAccount savingsAccount = new SavingsAccount(1000);
		System.out.println(savingsAccount);
		
	}

}