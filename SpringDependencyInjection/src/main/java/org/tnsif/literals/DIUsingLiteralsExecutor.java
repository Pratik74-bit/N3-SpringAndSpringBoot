package org.tnsif.literals;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIUsingLiteralsExecutor {

	public static void main(String[] args) {
		
		BeanFactory f = new ClassPathXmlApplicationContext("beans.xml");
		
		SwiftEngine e = f.getBean("car",SwiftEngine.class);
		
		System.out.println(e);
		System.out.println(e.cost());
		System.out.println(e.display());
		
		SwiftEngine t = f.getBean("thar",SwiftEngine.class);
		
		System.out.println(t);
		System.out.println(t.cost());
		System.out.println(t.display());
		
	}

}
