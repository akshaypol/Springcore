package com.springcore.constructor_injection;

public class person {
	
	private String name;
	private int id ;
	private Certificate c;
	
	
	public person(String name, int id , Certificate c ) {
		this.name = name;
		this.id = id;
		this.c= c;
	}


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name+"--"+this.id+"{"+this.c.name+"}";
	}
	
	
	

}
