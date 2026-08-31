package com.task.project.bank.withdraw;

import com.task.project.bank.account.*;

public class Withdraw {
	
	 public static void makeWithdraw(Account account, double amount) {
		 
	        if (amount > account.balance) {
	            System.out.println("Not enough balance!");
	        } else {
	            account.balance = account.balance - amount;
	            System.out.println("Withdrawn: " + amount);
	            System.out.println("New Balance: " + account.balance);
	        }
	    }

}
