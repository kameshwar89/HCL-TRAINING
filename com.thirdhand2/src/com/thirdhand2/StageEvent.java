package com.thirdhand2;

public class StageEvent extends Event {
	int noOfShows,noOfSeatsPerShow;
	
	
	public StageEvent(String name, String detail, String ownerName, int noOfShows, int noOfSeatsPerShow) {
		super(name, detail, ownerName);
		this.noOfShows = noOfShows;
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}


	public int getNoOfShows() {
		return noOfShows;
	}

	public void setNoOfShows(int noOfShows) {
		this.noOfShows = noOfShows;
	}

	public int getNoOfSeatsPerShow() {
		return noOfSeatsPerShow;
	}

	public void setNoOfSeatsPerShow(int noOfSeatsPerShow) {
		this.noOfSeatsPerShow = noOfSeatsPerShow;
	}
	public double projectedRevenue(int noOfStall , int noOfSeatsPerShow) {
		return 50*noOfStall*noOfSeatsPerShow;
	}
	

}
