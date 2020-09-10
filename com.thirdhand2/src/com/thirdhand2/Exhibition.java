package com.thirdhand2;

public class Exhibition extends Event {
	int noOfStall;

	public Exhibition(String name, String detail, String ownerName, int noOfStall) {
		super(name, detail, ownerName);
		this.noOfStall = noOfStall;
	}
    
	public int getNoOfStall() {
		return noOfStall;
	}

	public void setNoOfStall(int noOfStall) {
		this.noOfStall = noOfStall;
	}
	public double projectedRevenue(int noOfStall) {
		return 10000*noOfStall;
	}
}
