package com.dao;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.entity.Employee;

public interface Dao {
	boolean createEmployee(Employee employee); 		//Function for Adding a Employee
	boolean updateEmployee(Employee employee);			//Function for updating Employee record
	boolean deleteEmployee(Employee employee);		//Function for delete a Employee Record
	Employee AddProject(Employee employee);			//Function for Adding a Project 
	Employee updateProject(Employee employee);		//Function for updateProject details 
	Employee assignProject(Employee employee);		//Function for Assigning project to a Employee
	List <Employee> showDetails(Employee employee);	//Function for showing   Employee details
	List<Employee>sortRecord();  				     //Function for Sort  Employee record according to salary
	 ArrayList<Employee> employeeOnProject(Employee e);			//Function for Adding a Employee to a Project
	}
