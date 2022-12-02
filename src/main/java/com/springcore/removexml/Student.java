package com.springcore.removexml;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component("firstStudent")
public class Student {
	
	public void study() {
		System.out.println("student is reading book");
	}

}
