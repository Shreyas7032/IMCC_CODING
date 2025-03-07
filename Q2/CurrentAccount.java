package com.Q2;

public class CurrentAccount implements Account {

	private double balance;
    private double overdraftLimit = 1000;

    public CurrentAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposite(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance + overdraftLimit >= amount) {
            balance -= amount;
            System.out.println("Withdrawn " + amount + ". Remaining balance: " + balance);
        } else {
            System.out.println("Overdraft limit exceeded.");
        }
    }

    @Override
    public double calculateIntrest() {
        return 0; // Current accounts generally do not earn interest
    }

    @Override
    public void viewBalance() {
        System.out.println("Current Account Balance: " + balance);
    }
}
