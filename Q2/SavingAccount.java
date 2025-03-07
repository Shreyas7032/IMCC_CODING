package com.Q2;

public class SavingAccount implements Account {
	private double balance;
	private double intrestRate=9.0;
	
	

	public SavingAccount(double balance) {
		this.balance = balance;
	}

	@Override
	public void deposite(double amount) {
		balance+=amount;
		System.out.println("Deposited Amount is:"+amount+" New Balanace is:"+balance);
	}

	@Override
	public void withdraw(double amount) {
		if(balance>amount)
		{
			balance-=amount;
			System.out.println("Succesfully withdrawn amount :"+amount+" Your Balance is:"+balance);
		}
		else
		{
			System.out.println("Your Balance is:"+balance+" You cannot be Withdrawn!!");
		}
		
	}

	@Override
	public double calculateIntrest() {
		
		return balance*intrestRate/100;
	}

	@Override
	public void viewBalance() {
		System.out.println("Your Current Balance is:"+balance);
		
	}

}
