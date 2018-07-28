package com.learning.SpringAnnotation.Model;

import org.springframework.beans.factory.annotation.Autowired;

public class EmployeeModel {

	// Attributes
	private int eId;
	private String eName;
	private int eSalary;
	private int eAge;
	
	@Autowired
	AdressModel adress;
	
	
	// Default Constructor
	public EmployeeModel() {
//		this.adress= new AdressModel();
//		this.adress.setCity("Kurnool");
//		this.adress.setCountry("Candadaq");
	}

	// Parameterized Constructor
	public EmployeeModel(int eId, String eName, int eSalary, int eAge,AdressModel adress) {
		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
		this.eAge = eAge;
		this.adress=adress;
	}

	public AdressModel getAdress() {
		return adress;
	}

	
	// Getter and Setter methods
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public int geteSalary() {
		return eSalary;
	}

	public void seteSalary(int eSalary) {
		this.eSalary = eSalary;
	}

	public int geteAge() {
		return eAge;
	}

	public void seteAge(int eAge) {
		this.eAge = eAge;
	}

	@Override
	public String toString() {
		return "EmployeeModel [eId=" + eId + ", eName=" + eName + ", eSalary=" + eSalary + ", eAge=" + eAge
				+ ", adress=" + adress + "]";
	}

}
