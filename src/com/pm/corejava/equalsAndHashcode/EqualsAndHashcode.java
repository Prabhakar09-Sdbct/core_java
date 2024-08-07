package com.pm.corejava.equalsAndHashcode;

public class EqualsAndHashcode {
	
	private Integer id;
	private String name;
	
	
	public EqualsAndHashcode() {
		// TODO Auto-generated constructor stub
	}


	public EqualsAndHashcode(Integer id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		EqualsAndHashcode e = (EqualsAndHashcode) obj;
		
		return this.id.equals(e.id) && this.name.equals(e.name);
		
	}

	@Override
	public int hashCode() {
		
		String value = this.id + this.name;
		return value.hashCode();
	}

	@Override
	public String toString() {
		return "[id=" + id + ", name=" + name + "]";
	}
	
}
