package com.mutualfund;

public class AxisBank implements MutualFund {
	int amt,years;
	public AxisBank(int amt, int years) {
		super();
		this.amt = amt;
		this.years = years;
	}

	public int getAmt() {
		return amt;
	}
	public void setAmt(int amt) {
		this.amt = amt;
	}
	public int getYears() {
		return years;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	public void duration()
	{
		return;
	}
	public void amounts() {
		System.out.println(amt*56/100*years );
	}

}
