package com.meritamerica.assignment1;

/*    
 * 4. MeritAmericaBankApp
        1. public static void main(String[] args)
            1. Instantiate an account holder with a checkings 
            	balance of $100 and a savings balance of $1000
            2. Display the account holder’s toString() output
            3. Deposit $500 into the checking account
            4. Withdraw $800 from the savings account
            5. Display the checking account toString() output
            6. Display the savings account toString() output
            7. Instantiate another account holder with a checkings 
            	balance of $200 and a savings balance of $500
            8. Deposit -$500 into the checking account
            9. Withdraw $600 from the savings account
	Display the second account holder’s toString() output*/


public class MeritAmericaBankApp {
	
	public static void main(String[] args) {
	       AccountHolder accountHolder = new AccountHolder(
	           	"Joe",
	           	"Moe",
	           	"Doe",
	           	"123456789",
	           	100.0,
	           	1000.0);
	       System.out.println(accountHolder.accountHolderToString());
	}
	
}