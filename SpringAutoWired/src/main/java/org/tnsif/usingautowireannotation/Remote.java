package org.tnsif.usingautowireannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Remote {
	
	Cell cell;
	
	//DI using setters
	/*To achieve attiring using setters , use @Autowired annotation*/
	@Autowired
	/*When you have created multiple bean then if you want to access 
	particular one then use @Qualifier annotation*/
	
	//@Qualifier("c1")
	public void setCell(Cell cell) {
		this.cell = cell;
	}
	
	public Remote() {
		System.out.println("Default constructor for Remote");
	}

	public void remote() {
		cell.power();
	}

}
