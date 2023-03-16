package org.tnsif.literals;

public class SwiftEngine implements IEngine {
	
	private String company;
	private double cost;

	public double cost() {
		return cost;

	}

	public String display() {
		return "Made in India";
	}
	
	//getters and setters 
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}
	
	
	//Dependency Injection using Constructor
	public SwiftEngine(String company, double cost) {
		super();
		this.company = company;
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Name of Company: "+ company +" Fuel: "+fuel;
	}
	
	

}
