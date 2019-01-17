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
@WebServlet("/Addproject")
public class Addproject extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Addproject() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid1=request.getParameter("pid");
		int pid=Integer.parseInt(pid1);
		String des=request.getParameter("des");
		Employee e=new Employee();
		e.setPid(pid);
		e.setDes(des);
		DaoImpl in=new DaoImpl();
		in.AddProject(e);
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
