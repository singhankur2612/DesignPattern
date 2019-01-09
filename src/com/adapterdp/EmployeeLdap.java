package com.adapterdp;

public class EmployeeLdap {
	public String no;
	public String naam;
	public String enrol;
	public EmployeeLdap(String no, String naam, String enrol) {
		this.no = no;
		this.naam = naam;
		this.enrol = enrol;
	}
	
	
	public String getNo() {
		return no;
	}
	public String getNaam() {
		return naam;
	}
	public String getEnrol() {
		return enrol;
	}
	
	
	
}
