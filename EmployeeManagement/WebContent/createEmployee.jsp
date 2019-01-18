<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SignUp</title>
</head>
<body class="body1">
<style>
.body1{
background-image:url("images/1.jpg")
}
.center{
position:absolute;
 left:50px; topL:200px;
}
</style>
<h1 style="color:white"><u>ADD EMPLOYEE DETAILS HERE:</u> </h1>
<div class="center">
<form action="Create">
<table align="center">
<tr>
<td style="color:white">Enter Employee name</td><td>
<input type="text" id="name" name="name"required></td></tr>
<tr>
<td style="color:white">Enter Employee id</td><td>
<input type="number" id="eid" name="eid"required></td></tr>
<tr>
<td style="color:white">Enter Employee contact no</td><td>
<input type="number" id="contact" name="contact"required></td></tr>
<tr>
<td style="color:white">Enter Employee address</td><td>
<input type="text" id="address" name="address"required></td></tr>
<tr>
<td style="color:white">Enter Employee email</td><td>
<input type="email" id="mail" name="mail"required></td></tr>
<tr>
<tr>
<td style="color:white">Enter Employee Salary</td><td>
<input type="text" id="salary" name="salary"required></td></tr>
<tr>
<tr>
<td></td><td><input type="Submit" valyue="submit"></td></tr>
</table>
</form>
</div>
</body>
</html>