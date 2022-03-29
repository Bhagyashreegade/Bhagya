package com.company;


public class BankAccount {

    private String accountHolderName;
    private long accountNumber;
    private double balance;

    public BankAccount(){                                                      //default Constructor

    }

    public BankAccount(String accountHolderName) {
        this ();   //calling a default constructor
        this.accountHolderName = accountHolderName;
    }

    //Calling a Constructor from a Constructor reduces the code repeatation

// chaining the constructor should be he very first line ---> THUMB RULE
    public BankAccount(String accountHolderName, long accountNumber) {

        this(accountHolderName); //calling the matching constructor
        this.accountNumber = accountNumber;
    }

    public BankAccount(String accountHolderName, long accountNumber, double balance) {
        this(accountHolderName, accountNumber);
        this.balance = balance;
    }
}

