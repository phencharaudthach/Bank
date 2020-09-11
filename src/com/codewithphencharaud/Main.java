package com.codewithphencharaud;

import Bank.BankAccount;
import Bank.CreditAccount;
import Bank.SavingsAccount;
import Bank.DebitCard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
    BankAccount myAccount = new BankAccount("Citizen", "Phen", 500, "Checking");
	CreditAccount myCredit = new CreditAccount("CitizenOne", "Phen", 100, 900, 25);
        SavingsAccount mySavings = new SavingsAccount("Discover", "Phen", 10000, 5 );
	    SavingsAccount savings2 = new SavingsAccount("Citizen", "Vee", 25000, 2);
        //        System.out.println(myAccount.getBankInfo());
        myCredit.creditUsed(200);
        myCredit.payCredit();
        System.out.println(myCredit.getBankInfo());
        mySavings.applyInterest();
        System.out.println(mySavings.getBankInfo());
        DebitCard myCard = new DebitCard(
                "1234 1234 1234 1122",
                "1234",
                "223",
                "Phen",
                myAccount,
                new ArrayList <SavingsAccount>(Arrays.asList(mySavings, savings2))
        );

        System.out.println(myAccount.getBankInfo());
        System.out.println(myCard.charge(100, "4561") ? "Approved" : "Declined");
        System.out.println(myAccount.getBankInfo());
        System.out.println(myCard.charge(350, "7894") ? "Approved" : "Declined");
        System.out.println(myAccount.getBankInfo());
    }
}
