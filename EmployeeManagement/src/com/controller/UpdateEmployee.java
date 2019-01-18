/*
 * UpdateEmployee
 * 
 * Version 1.0
 *
 * 18-Jan-2019
 * 
 * Copyright notice
 */
package com.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoImpl;
import com.entity.Employee;

/**
 * Servlet implementation class UpdateEmployee
 */
@WebServlet("/UpdateEmployee")
public class UpdateEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String eids=request.getParameter("eid");
		String address=request.getParameter("address");
		String contacts=request.getParameter("contact");
		String salarys=request.getParameter("salary");
		String mail=request.getParameter("mail");
		int eid=Integer.parseInt(eids);
		int salary=Integer.parseInt(salarys);
		Employee e=new Employee();
		e.setAddress(address);
		e.setName(name);
		e.setId(eid);
		e.setSalary(salary);
		e.setEmail(mail);;
		e.setContact(contacts);
		DaoImpl ud=new DaoImpl();
		ud.updateEmployee(e);
		request.getRequestDispatcher("index.html").include(request,response);
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
