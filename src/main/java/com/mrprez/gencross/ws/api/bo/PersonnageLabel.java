package com.mrprez.gencross.ws.api.bo;

public class PersonnageLabel {
	
	private final int id;
	
	private String name;

	
	
	public PersonnageLabel(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public PersonnageLabel(int id) {
		super();
		this.id = id;
	}

	@Override
	public int hashCode() {
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof PersonnageLabel){
			return ((PersonnageLabel)obj).id == id;
		}
		return false;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return id+" - "+name;
	}
	

}
