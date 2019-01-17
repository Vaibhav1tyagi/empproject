<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Delete Employee record </title>
</head>
<body class="body1">
<style>
.body1{
background-image:url("images/1.jpg")
}
.center{
position:absolute;
 left:100px; topL:200px;
}
</style>
<h1 style="color:white"><u>DELETE EMPLOYEE DETAILS HERE:</u></h1>
<div class="center">
<form action="Delete">
<h1 style="color:white">Enter Employee ID</h1>
<input type="number" name="eid" id="eid"required>
<input type="submit" value="delete">
</form>
</div>
</body>
</html>