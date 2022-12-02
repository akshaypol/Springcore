package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class person {
	
	private List<String> friendsList;
	private Map<String ,Integer> fees;
	private Properties props;

	public List<String> getFriendsList() {
		return friendsList;
	}

	public void setFriendsList(List<String> friendsList) {
		this.friendsList = friendsList;
	}

	public Properties getProps() {
		return props;
	}

	public void setProps(Properties props) {
		this.props = props;
	}

	public person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Map<String, Integer> getFees() {
		return fees;
	}

	public void setFees(Map<String, Integer> fees) {
		this.fees = fees;
	}

	@Override
	public String toString() {
		return "person [friendsList=" + friendsList + ", fees=" + fees + ", props=" + props + "]";
	}

	
	
	
	
	

}
