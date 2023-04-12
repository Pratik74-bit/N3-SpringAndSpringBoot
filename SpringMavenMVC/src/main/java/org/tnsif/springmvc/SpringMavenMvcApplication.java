package org.tnsif.springmvc;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringMavenMvcApplication {

		ConfigurableApplicationContext context = SpringApplication.run(SpringMavenMvcApplication.class,args);
		Scanner sc = new Scanner(System.in);
	
	//	int x = sc.nextInt();
	//	System.out.println(x);
		
	//	Employee e = context.getBean(Employee.class);
	//	e.setEmpid(45);
	//	e.setEmpname("Pratik");
	//	e.print();
		
		HomeController h = context.getBean(HomeController.class);
		h.Home();

}
