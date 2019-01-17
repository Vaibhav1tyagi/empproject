<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Assign project</title>
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
<h1 style="color:white"><u> ADD  PROJECT HERE:</u></h1>
<div class="center">
<form action="Addproject">
<h1 style="color:white">Enter Project Id</h1>
<input type="number" name="pid" id="pid"required>
<h1 style="color:white">Enter Project Description</h1>
<input type="text" name="des" id="des"required><br><br>
<input type="submit" value="Assign">
</form>
</div>
</body>
</html>