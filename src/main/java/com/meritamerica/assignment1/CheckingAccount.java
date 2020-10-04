package com.meritamerica.assignment1;
//CheckingAccount
//CheckingAccount(double openingBalance)
//double getBalance()
//double getInterestRate()
//boolean withdraw(double amount)
//boolean deposit(double amount)
//double futureValue(int years)
//String toString()

//Sample output:
//Checking Account Balance: $100
//Checking Account Interest Rate: 0.0001
//Checking Account Balance in 3 years: $100.03
//The formula for future value is FV = PV(1+i)n
//FV: future value
//PV: present value
//i: interest rate
//n: number of periods/years

import java.lang.Math;
import java.text.DecimalFormat;
import java.text.NumberFormat;

//Creates Checking Account Class and methods computing withdawals, deposits and future value calculated with interest
public class CheckingAccount {
	private double balance;
	private double interestRate;
	private int years;
	
	public CheckingAccount(){}
	public CheckingAccount(double openingBalance, int years) {
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
	  This also subtracts the withdraw amount from Checking Account Balance if true*/
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
//		NumberFormat defaultFormat = NumberFormat.getInstance();
//		defaultFormat.setMinimumFractionDigits(2);
		
		DecimalFormat df = new DecimalFormat("#.00"); 
		df.format(balance);
		return "Checking Account Balance: $" + df.format(balance) + "\n" + "Checking Account Interest Rate: " + (this.interestRate)*100 + "%"
				+ "\n" + "Checking Account Balance in " + years + " years: $" + df.format(futureValue(this.years));

	}
	
}