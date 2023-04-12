package org.tnsif.usingautowireannotation;

public class Cell {
	
	private String company;
	private String size;
	
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	

	public Cell() {
		super();
		System.out.println("Default constructor for Cell");
	}
	public void power() {
		System.out.println("Company of cell: "+ company);
		System.out.println("Size of cell: "+ size);
	}
	

}
