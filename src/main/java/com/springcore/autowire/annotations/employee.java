package com.springcore.autowire.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class employee {
	@Autowired
	@Qualifier("address2")
	private Address address;
//	@Qualifier Name of bean goes to specific bean 


	public Address getAddress() {
		return address;
	}
	
	public void setAddress(Address address) {
		this.address = address;
	}

	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
//	@Autowired
	public employee(Address address) {
		super();
		this.address = address;
		System.out.println("inside const");
	}

	@Override
	public String toString() {
		return "employee [address=" + address + "]";
	}


	

}
