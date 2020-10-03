package com.meritamerica.assignment1;
//Create the following classes with the following methods:

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
	
	String firstName;
	String middleName;
	String lastName;
	String ssn;
	double checkingAccountOpeningBalance;
	double savingsAccountOpeningBalance;
	
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
	public String toString() {
		String TBD = "tbd";
		String test= "Name: " + firstName + " " + middleName + " " + lastName + "\n" 
			+ "SSN: " + ssn + "\n"
			+"Checking Account Balance: " + checkingAccountOpeningBalance + "\n"
			+"Checking Account Interest Rate: 0.0001" + "\n"
			+"Checking Account Balance in 3 years: " + TBD + "\n"
			+"Savings Account Balance: " + savingsAccountOpeningBalance + "\n"
			+"Savings Account Interest Rate:  + 0.01" + "\n"
			+"Savings Account Balance in 3 years: " + TBD + "\n";
		return test;
	
	}
}