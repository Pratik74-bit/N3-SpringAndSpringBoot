package org.tnsif.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String Home()
	{
		System.out.println("Code to demonstrate on Simple " + "web application");
		return "home.jsp";
	}

}
