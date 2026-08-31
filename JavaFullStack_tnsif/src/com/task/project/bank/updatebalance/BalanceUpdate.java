package com.task.project.bank.updatebalance;

import com.task.project.bank.account.*;
public class BalanceUpdate {
	
	public static void showBalance(Account account) {
        System.out.println("Name: " + account.name);
        System.out.println("Balance: " + account.balance);
    }

}
