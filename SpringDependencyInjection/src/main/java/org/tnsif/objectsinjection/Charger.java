package org.tnsif.objectsinjection;

public class Charger {
	
	//private data members
	private String brand;
	private int voltage;
	private String type;
	
	//DI using setters
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setVoltage(int voltage) {
		this.voltage = voltage;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public void power() {
		System.out.println("Details related to Charger:");
		System.out.println("Charger Brand=" + brand + " voltage=" + voltage + " type=" + type);
	}
	
	
	
	

}
