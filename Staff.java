package com.onesoft.collections2;

public class Staff {
	private int id;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	private String name;
	private String gender;
	private int salary;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public Staff(int id,String name,String gender,int salary) {
		this.id=id;
		this.name=name;
		this.gender=gender;
		this.salary=salary;
	}
	@Override
	public String toString() {
		return "Staff [name=" + name + ", gender=" + gender + ", salary=" + salary + "]";
	}
	
		
	}


