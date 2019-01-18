/*
 * FindEmployee
 * 
 * Version 1.0
 *
 * 18-Jan-2019
 * 
 * Copyright notice
 */
package com.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dao.DaoImpl;
import com.entity.Employee;

/**
 * Servlet implementation class FindEmployee
 */
@WebServlet("/FindEmployee")
public class FindEmployee extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FindEmployee() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String pid1=request.getParameter("pid");
		int pid=Integer.parseInt(pid1);
		Employee e=new Employee();
		e.setPid(pid);
		DaoImpl im=new DaoImpl();
		 List<Employee> list=im.employeeOnProject(e);
		 request.setAttribute("list", list);
		 request.getRequestDispatcher("findEmployeeView.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
