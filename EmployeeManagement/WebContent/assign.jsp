<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assign here</title>
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
<h1 style="color:white"><u>ASSIGN PROEJECT TO EMPLOYEE HERE:</u> </h1>
<div class="center">
<form action="Assign">
<table>
<tr>
<td  style="color:white">Enter Eid</td><td>
<input type="number" id="eid" name="eid"required></td></tr>
<tr><td style="color:white">Enter Pid</td>
<td><input type="number" id="pid" name="pid"required></td></tr>
<tr><td style="color:white"></td><td><input type="submit" value="Assign">
</td></tr>
</table>
</form>
</div>
</body>
</html>