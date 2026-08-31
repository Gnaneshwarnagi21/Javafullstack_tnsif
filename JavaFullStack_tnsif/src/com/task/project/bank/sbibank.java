package com.task.project.bank;

import com.task.project.bank.account.*;
import com.task.project.bank.deposit.*;
import com.task.project.bank.updatebalance.*;
import com.task.project.bank.withdraw.*;
import java.util.*;

public class sbibank {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		 
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
 
        System.out.print("Enter starting balance: ");
        double balance = sc.nextDouble();
 
        Account account = new Account(name, balance);
 
        int choice = 0;
 
        while (choice != 4) {
 
            System.out.println("\n1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
 
            if (choice == 1) {
                System.out.print("Enter amount to deposit: ");
                double amount = sc.nextDouble();
                Deposit.makeDeposit(account, amount);
 
            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ");
                double amount = sc.nextDouble();
                Withdraw.makeWithdraw(account, amount);
 
            } else if (choice == 3) {
                BalanceUpdate.showBalance(account);
 
            } else if (choice == 4) {
                System.out.println("Thank You for Visiting");
 
            } else {
                System.out.println("Wrong choice!");
            }
        }
 
        sc.close();
    }

	}

