package com.interface1;

public class PremiumStall implements Stall {
	String StallName;
	int cost;
	String ownerName;
	int projector;
	public PremiumStall()
	{
		
	}
	public PremiumStall(String stallName, int cost, String ownerName, int projector) {
		super();
		StallName = stallName;
		this.cost = cost;
		this.ownerName = ownerName;
		this.projector = projector;
	}
	public String getStallName() {
		return StallName;
	}
	public void setStallName(String stallName) {
		StallName = stallName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getProjector() {
		return projector;
	}
	public void setProjector(int projector) {
		this.projector = projector;
	}
	public void display() {
		System.out.println("Stall Name:"+StallName);
		System.out.println("Cost:"+cost);
		System.out.println("Owner Name:"+ownerName);
		System.out.println("Projector:"+projector);
	}

}
