package com.meritamerica.assignment1;
//Create the following classes with the following methods:

import java.text.DecimalFormat;

//AccountHolder
//AccountHolder() - default constructor
//AccountHolder(String firstName, String middleName, String lastName, String ssn, double checkingAccountOpeningBalance, double savingsAccountOpeningBalance)
//String getFirstName()
//void setFirstName(String firstName)
//String getMiddleName()
//void setMiddleName(String middleName)
//String getLastName()
//void setLastName(String lastName)
//String getSSN()
//void setSSN(String ssn)
//CheckingAccount getCheckingAccount()
//SavingsAccount getSavingsAccount()
//String toString()

//Sample output:
//Name: John James Doe
//SSN: 123-45-6789
//Checking Account Balance: $100
//Checking Account Interest Rate: 0.0001
//Checking Account Balance in 3 years: $100.03
//Savings Account Balance: $1000
//Savings Account Interest Rate: 0.01
//Savings Account Balance in 3 years: $1030.03

public class AccountHolder {

	private String firstName;
	private String middleName;
	private String lastName;
	private String ssn;
	private double checkingAccountOpeningBalance;
	private double savingsAccountOpeningBalance;
	
	/* test without default constructor below to see impact on program */
	public AccountHolder() {
	}

	public AccountHolder(String firstName, String middleName, String lastName, String ssn,
			double checkingAccountOpeningBalance, double savingsAccountOpeningBalance) {
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.ssn = ssn;
		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
	}
// getting the savings account class and returning an object 
	public SavingsAccount getSavingsAccount() {
		 SavingsAccount savings = new SavingsAccount(savingsAccountOpeningBalance);
		 return savings;
	}
	
	public CheckingAccount getCheckingAccount() {
		CheckingAccount checking = new CheckingAccount(checkingAccountOpeningBalance,0);
		 return checking;
	}
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getSsn() {
		return ssn;
	}

	public void setSsn(String ssn) {
		this.ssn = ssn;
	}

	public double getCheckingAccountOpeningBalance() {
		return checkingAccountOpeningBalance;
	}

//	public void setCheckingAccountOpeningBalance(double checkingAccountOpeningBalance) {
//		this.checkingAccountOpeningBalance = checkingAccountOpeningBalance;
//	}

	public double getSavingsAccountOpeningBalance() {
		return savingsAccountOpeningBalance;
	}

//	public void setSavingsAccountOpeningBalance(double savingsAccountOpeningBalance) {
//		this.savingsAccountOpeningBalance = savingsAccountOpeningBalance;
//	}

//TBD variable from checking/saving account 

	public String accountHolderToString() {
		DecimalFormat df = new DecimalFormat("#.00");
		
		CheckingAccount checkingAccountForUse = new CheckingAccount();
		checkingAccountForUse.futureValue(3);
		
		String checkingAccount3Years = df.format((this.checkingAccountOpeningBalance + ((this.checkingAccountOpeningBalance * 0.0001) * 3) ) );
		String savingsAccount3Years = df.format((this.savingsAccountOpeningBalance + ((this.savingsAccountOpeningBalance * 0.01) * 3) ) );
		
		String accountInformation= "Name: " + firstName + " " + middleName + " " + lastName + "\n" 
			+ "SSN: " + ssn + "\n"
			+"Checking Account Balance: " + df.format(checkingAccountOpeningBalance) + "\n"
			+"Checking Account Interest Rate: 0.0001" + "\n"
			+"Checking Account Balance in 3 years: " + checkingAccount3Years + "\n"
			+"Savings Account Balance: " + savingsAccountOpeningBalance + "\n"
			+"Savings Account Interest Rate: 0.01" + "\n"
			+"Savings Account Balance in 3 years: " + savingsAccount3Years + "\n";
		return accountInformation;
	}
}