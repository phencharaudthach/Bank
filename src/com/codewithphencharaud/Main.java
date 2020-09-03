package com.codewithphencharaud;

import Bank.BankAccount;

public class Main {

    public static void main(String[] args) {
	BankAccount myAccount = new BankAccount("Citizen", "Phen", 500, "Checking");
        System.out.println(myAccount.getBankInfo());
    }
}
