package com.Q2;

public class BankingDemo {

	public static void main(String[] args) {
        Bank bank = new Bank();
        SavingAccount savings = new SavingAccount(5000);
        CurrentAccount current = new CurrentAccount(2000);

        bank.addAccount(savings);
        bank.addAccount(current);

        savings.deposite(1000);
        savings.withdraw(2000);
        current.withdraw(1500);

        bank.showAccounts();
    }
}
