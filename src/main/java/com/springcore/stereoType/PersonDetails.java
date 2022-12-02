package com.springcore.stereoType;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//change scope using @scope anotation protoype (with compoent anotation only)s

@Component("Ob")
@Scope("prototype")
public class PersonDetails {
	@Value("akshay")
	private String name;
	@Value("123")
	private int id ;
	
	@Value("#{FrendList}")
	private List<String> friendsList;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public List<String> getFriendsList() {
		return friendsList;
	}
	public void setFriendsList(List<String> friendsList) {
		this.friendsList = friendsList;
	}
	@Override
	public String toString() {
		return "PersonDetails [name=" + name + ", id=" + id + ", friendsList=" + friendsList + "]";
	}
	
	
	

	
	
	
	

}
