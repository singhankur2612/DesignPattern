package com.adapterdp;

public class EmplyeeDb implements Employee {
	public String id;
	public String name;
	public String email;
	
	
	public EmplyeeDb(String id, String name, String email) {
		this.id = id;
		this.name = name;
		this.email = email;
	}

	@Override
	public String getId() {
		return null;
	}

	@Override
	public String getName() {
		return null;
	}

	@Override
	public String getEmail() {
		return null;
	}

}
