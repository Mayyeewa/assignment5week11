package com.MeritBankApp.models;

import javax.validation.constraints.NotNull;



public class CDAccount {
	static int nextId = 1;
	long accountNumber;
	@NotNull(message = "no balance found")
	double balance;
	@NotNull(message = "no interest rate found")
	double interestRate;
	@NotNull(message = "no term found")
	int term;
	long openedOn;
	
	public CDAccount() {
		this.interestRate = 0;
		this.term = 0;
		this.balance = 0;
		this.accountNumber = nextId++;
		this.openedOn = 0;
	}

	public long getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public long getOpenedOn() {
		return openedOn;
	}

	public void setOpenedOn(long openedOn) {
		this.openedOn = openedOn;
	}
	
	
	
	
}