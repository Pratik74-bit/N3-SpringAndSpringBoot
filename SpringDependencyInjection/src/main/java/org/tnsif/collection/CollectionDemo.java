package org.tnsif.collection;

import java.util.List;
import java.util.Set;

//program to demonstrate the DI in the form of collections
public class CollectionDemo {
	
	private List<String>contactNo;
	private Set<String>books;
	
	//DI using setters
	public void setContactNo(List<String> contactNo) {
		this.contactNo = contactNo;
	}
	public void setBooks(Set<String> books) {
		this.books = books;
	}
	
	public void display() {
		System.out.println("List of contact no:");
		for (String contact: contactNo) {
			System.out.println(contact);
		}
		
		System.out.println();//line break
		
		System.out.println("Set of books:");
		for (String book: books) {
			System.out.println(book);
		}
	}
	
	

}
