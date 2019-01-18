<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.io.*"%>
    <%@ page import="java.util.*"%>
    <%@ page import="java.util.ArrayList"%> 
    <%@ page import="com.entity.*"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
</head>
<body>
<%
ArrayList<Employee> list=(ArrayList<Employee>)request.getAttribute("list");
Employee p=null;
out.println("<h1>Employee Details Are:</h1>");
for (int i = 0; i < list.size(); i++) {
	p=list.get(i);
	out.println("id : "+ p.getId()+"<br>");
	out.println("Name : "+ p.getName()+"<br>");
	out.println("Email Id : "+ p.getEmail()+"<br>");
	out.println("Contact No : "+ p.getContact()+"<br>");
	out.println("Address"+p.getAddress());
}
%>
<a href="index.html">CLICK HERE FOR HOMEPAGE</a>
</body>
</html>