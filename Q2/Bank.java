package com.Q2;

import java.util.ArrayList;
import java.util.List;

class Bank {
    private List<Account> accounts = new ArrayList<>();

    public void addAccount(Account account) {
        accounts.add(account);
    }
    
    public void showAccounts() {
        for (Account acc : accounts) {
            acc.viewBalance();
        }
    }
}
