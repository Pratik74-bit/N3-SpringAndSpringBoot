package org.tnsif.usingautowireannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Executor {

	public static void main(String[] args) {
		
		ApplicationContext f = new ClassPathXmlApplicationContext("web.xml");
		Remote r = f.getBean("remote",Remote.class);
		r.remote();
	}

}
