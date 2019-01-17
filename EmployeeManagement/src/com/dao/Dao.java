package com.dao;

import java.sql.ResultSet;
import java.util.List;

import com.entity.Employee;

public interface Dao {
	boolean createEmployee(Employee employee);
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(Employee employee);
	Employee AddProject(Employee employee);
	Employee updateProject(Employee employee);
	Employee assignProject(Employee employee);
	List <Employee> showDetails(Employee employee);
	List<Employee>sortRecord();
	//List<Employee>countEmpOnProject(Employee employee);
	}
