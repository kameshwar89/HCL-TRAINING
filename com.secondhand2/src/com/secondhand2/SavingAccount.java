package com.secondhand2;
public class SavingAccount extends Account{
	protected double minimumBalance;
	public SavingAccount(String accountNumber, double balance, String accountHolderName, double minimumBalance) {
		super(accountNumber, balance, accountHolderName);
		this.minimumBalance = minimumBalance;
	}
	public double getMinimumBalance() {
		return minimumBalance;
	}
	public void setMinimumBalance(double minimumBalance) {
		this.minimumBalance = minimumBalance;
	}
	
	
	
	
	

}
