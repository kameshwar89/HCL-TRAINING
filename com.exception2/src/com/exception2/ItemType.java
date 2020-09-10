package com.exception2;
public class ItemType {
	String name;
	float deposit,costPerDay;
	public ItemType() {
		
	}
	public ItemType(String name, float deposit, float costPerDay) {
		super();
		this.name = name;
		this.deposit = deposit;
		this.costPerDay = costPerDay;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getDeposit() {
		return deposit;
	}
	public void setDeposit(float deposit) {
		this.deposit = deposit;
	}
	public float getCostPerDay() {
		return costPerDay;
	}
	public void setCostPerDay(float costPerDay) {
		this.costPerDay = costPerDay;
	}
	public void display() {
		try {
			System.out.println("The details of the item type are:");
			System.out.println(" name:"+name);
			System.out.println(" deposit"+deposit);
			System.out.println("cost per day:"+costPerDay);
		}
		catch(NumberFormatException nfe)
		{
			nfe.getMessage();
		}
	}
	
	
	

}
