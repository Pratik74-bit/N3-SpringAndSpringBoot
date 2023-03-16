package org.tnsif.objectsinjection;

public class CellPhone {
	
	//2. DependencyInjection in the form of objects
	Charger charger;

	public void setCharger(Charger charger) 
	{
		this.charger = charger;
	}
	
	//injecting the object of the Charger class
	public void accept() 
	{
		charger.power();
	}
	

}
