package com.springcore.expressLang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {
	@Value("#{22+11}")
	private int Id;
	@Value("#{11+11}")
	private String Name;
	
	@Value("#{T(java.lang.Math).sqrt(144)}")
	private double z;
	@Value("#{T(java.lang.Math).E}")
	private double e;
	
	@Value("#{ new java.lang.String('Akshay pol ')}")
	private String myname;
	
	@Value("#{8>3}")
	private boolean status;
	
	
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getMyname() {
		return myname;
	}
	public void setMyname(String myname) {
		this.myname = myname;
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	
	public double getE() {
		return e;
	}
	public void setE(double e) {
		this.e = e;
	}
	
	
	public double getZ() {
		return z;
	}
	public void setZ(double z) {
		this.z = z;
	}
	@Override
	public String toString() {
		return "Person [Id=" + Id + ", Name=" + Name + ", z=" + z + ", e=" + e + ", myname=" + myname + ", status="
				+ status + "]";
	}
	
	
	

}
