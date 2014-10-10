package com.example.exp01;


public class FactoryWorker implements Worker {
	
	private String id;
	private String name;
	
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	public String getId() {
		// TODO Auto-generated method stub
		return id;
	}

	public void setId(String id) {
		// TODO Auto-generated method stub
		this.id = id;
	}
	
	public String getReport()
	{
		return getId() + " " + getName();
	}
}
