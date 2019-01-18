/*
 * Assign
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
 * Servlet implementation class Assign
 */
@WebServlet("/Assign")
public class Assign extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assign() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
     String eid1=request.getParameter("eid");
     String pid1=request.getParameter("pid");
     int eid=Integer.parseInt(eid1);
     int pid=Integer.parseInt(pid1);
     Employee e=new Employee();
     e.setId(eid);
     e.setPid(pid);
     DaoImpl as=new DaoImpl();
     as.assignProject(e);
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
