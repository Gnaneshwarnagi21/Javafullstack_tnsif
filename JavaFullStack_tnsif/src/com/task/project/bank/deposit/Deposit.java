package com.task.project.bank.deposit;

import com.task.project.bank.account.*;

public class Deposit {
	public static void makeDeposit(Account account, double amount) {
        account.balance = account.balance + amount;
        System.out.println("Amount Deposited: " + amount);
        System.out.println("New updated Balance: " + account.balance);

}
}
