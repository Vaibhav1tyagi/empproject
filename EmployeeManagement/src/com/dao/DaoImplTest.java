package com.dao;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.entity.Employee;

class DaoImplTest extends DaoImpl {

	@Test
	void testCreateEmployee() {
	Employee e=new Employee();
	DaoImpl im=new DaoImpl();
	e.setId(700);
	e.setName("vaibhav");
	e.setContact("983734280");
	e.setEmail("xyz@gmail.com");
	e.setAddress("muradnagar");
	e.setSalary(9000);
	
	boolean value=im.createEmployee(e);
	assertTrue(value);
	}
	/*
  	@Test
 
 
	void testUpdateEmployee() {
  		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setPid(489);
		e.setDes("vaibhav");
		Object i=im.AddProject(e);
		assertEquals(null,i);
		}
  */		

	@Test
	void testDeleteEmployee() {
		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setId(2);
	
		boolean value=im.deleteEmployee(e);
		assertTrue(value);
		}

	@Test
	void testAddProject() {
		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setPid(600);
		e.setDes("vaibhavyhh");
		Object i=im.AddProject(e);
		assertEquals(null,i);
		}
	@Test
	void testUpdateProject() {
		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setPid(50);
		e.setDes("hhjghjgkg");
		Object i1=im.updateProject(e);
		assertEquals(null,i1);
		}

	@Test
	void testAssignProject() {
		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setPid(465);
		e.setId(45);
		Object i2=im.assignProject(e);
		assertEquals(null,i2);
		}
	
/*
	@Test
	void testShowDetails() {
		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setPid(489);
		e.setDes("vaibhav");
		Object i=im.AddProject(e);
		assertEquals(null,i);
		}
	

	@Test
	void testSortRecord() {
		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setPid(489);
		e.setDes("vaibhav");
		Object i=im.AddProject(e);
		assertEquals(null,i);
		}
	

	@Test
	void testEmployeeOnProject() {
		Employee e=new Employee();
		DaoImpl im=new DaoImpl();
		e.setPid(489);
		e.setDes("vaibhav");
		Object i=im.AddProject(e);
		assertEquals(null,i);
		}*/
	}
