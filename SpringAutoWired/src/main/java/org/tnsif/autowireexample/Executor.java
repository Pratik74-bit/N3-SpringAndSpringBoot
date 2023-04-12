package org.tnsif.autowireexample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		
		ApplicationContext f = new ClassPathXmlApplicationContext("beans.xml");
		Person r = f.getBean("person",Person.class);
		r.accept();
		

	}

}
