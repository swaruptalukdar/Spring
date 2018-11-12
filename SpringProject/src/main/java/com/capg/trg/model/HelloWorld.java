package com.capg.trg.model;

import org.springframework.stereotype.Controller;

@Controller
public class HelloWorld 
{
	private String message;

	public HelloWorld() 
	{
		this.message="Good Morning!!";
		
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public void setup()
	{
		System.out.println("setup Method");
	}
	
	public void destroy()
	{
		System.out.println("destroy method");
	}
	
}
