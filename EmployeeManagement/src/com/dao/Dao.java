package com.dao;

import java.sql.ResultSet;

import com.entity.Employee;

public interface Dao {
	boolean createEmployee(Employee employee);
	Employee rettriveAllEmployee();
	boolean updateEmployee(Employee employee);
	boolean deleteEmployee(Employee employee);
	Employee rettriveEmployeeById(Employee employee);
	Employee sortEmployeeBySalary();;
	Employee Addproject(Employee employee);
	ResultSet   viewEmoloyee(Employee employee);
	Employee deleteproject(Employee employee);
	Employee updateProject(Employee employee);
	}
