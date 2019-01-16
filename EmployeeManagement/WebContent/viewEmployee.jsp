<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.sql.ResultSet" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>ViewRecord</title>
</head>
<body>
<%
ResultSet resultset=(ResultSet)request.getAttribute("rs");
while(resultset.next())
{
%>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>Address</th>
<th>Email ID</th>
<th>ContactNo</th>
</tr>
<tr>
<td><%=resultset.getString("id") %></td>
<td><%=resultset.getString("name") %></td>
<td><%=resultset.getString("addresss") %></td>
<td><%=resultset.getString("email") %></td>
<td><%=resultset.getString("contact") %></td>
</tr>
</table>
<%
}
%>
</body>
</html>