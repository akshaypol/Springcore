package com.springcore.autowire;

public class employee {
	
	private Address address;

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
