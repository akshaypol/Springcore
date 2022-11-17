package com.springcore.springcore;

public class Student {
	
	private int StudId;
	private String StudName;
	private String StudentAddress;
	public int getStudId() {
		return StudId;
	}
	public void setStudId(int studId) {
		System.out.println("setting Student ID");
		StudId = studId;
	}
	public String getStudName() {
		return StudName;
	}
	public void setStudName(String studName) {
		StudName = studName;
	}
	public String getStudentAddress() {
		return StudentAddress;
	}
	public void setStudentAddress(String studentAddress) {
		StudentAddress = studentAddress;
	}
	public Student(int studId, String studName, String studentAddress) {
		super();
		StudId = studId;
		StudName = studName;
		StudentAddress = studentAddress;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [StudId=" + StudId + ", StudName=" + StudName + ", StudentAddress=" + StudentAddress + "]";
	}
	
	
	
	

}
