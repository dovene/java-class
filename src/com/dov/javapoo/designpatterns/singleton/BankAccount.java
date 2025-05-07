package com.dov.javapoo.designpatterns.singleton;

public class BankAccount {
    private int accountNumber;
    private double balance;

    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        MessageLogger.getInstance().addLog("Dépôt de " + amount + " sur le compte " + accountNumber);
    }

    public void withdraw(double amount) {
        balance -= amount;
        MessageLogger.getInstance().addLog("Retrait de " + amount + " du compte " + accountNumber);
    }

}

