package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class coke implements InitializingBean , DisposableBean {
	
	private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public coke() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "coke [price=" + price + "]";
	}

	
	//this is init method after property set 
	public void afterPropertiesSet() throws Exception {
		
		System.out.println("taking coke ");
		// TODO Auto-generated method stub
		
	}

	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		
		System.out.println(" after drinking put bottle ");
		
	}
	
	

}
