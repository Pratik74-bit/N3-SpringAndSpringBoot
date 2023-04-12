package org.tnsif.autowireexample;

public class Person {
	Passport p1;
	
//	public void setP1(Passport p1) {
//		this.p1 = p1;
//	}

	public void accept() {
		p1.info();
	}

	public Person(Passport p1) {
		super();
		System.out.println("Autowire using constructor");
		this.p1 = p1;
	}
	
	
	
}
