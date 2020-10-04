package com.meritamerica.assignment1;
import java.lang.Math;

import java.lang.Math;

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

	public boolean withdraw(double amount) {
		if (amount < 0 || amount > this.balance) {
			return false;
		} else {
			this.balance -= amount;
			return true;
		}
	}

	public boolean deposit(double amount) {
		if (amount < 0) {
			return false;
		} else {
			this.balance += amount;
			return true;
		}
	}

	public double futureValue(int years) {
		return this.balance * Math.pow(1 + this.interestRate, years);
	}

	public String toString() {
		return "Savings Account Balance: " + balance + "Savings Account Interest Rate: " + this.interestRate
				+ "Savings Account Balance in" + years + "years:" + futureValue(this.years);

	}

}