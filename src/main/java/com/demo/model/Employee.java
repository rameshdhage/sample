package com.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Employee {
	
	
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	  private  int id;
	
	  private  String fName;
	  
	  private String lName;
	  
	  private  String city;
	  
	  private double salary;

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", fName=" + fName + ", lName=" + lName + ", city=" + city + ", salary=" + salary
				+ "]";
	}

	public Employee(int id, String fName, String lName, String city, double salary) {
		super();
		this.id = id;
		this.fName = fName;
		this.lName = lName;
		this.city = city;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
}