/*
 * Employee
 * 
 * Version 1.0
 *
 * 18-Jan-2019
 * 
 * Copyright notice
 */
package com.entity;

public class Employee 
{
	private int id; //Employee id 
	private String name;//Employee name	
	private String address;//Employee address
	private String email;//Employee email
	private String contact;//Employee contact
	private int pid;//Employee Project Id
	private String des;//Employee Description
	private int salary;//Employee salary
	
	public int getPid() {                                
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getDes() {
		return des;
	}
	public void setDes(String des) {
		this.des = des;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}	
}
