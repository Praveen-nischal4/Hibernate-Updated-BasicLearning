<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="seeep" method="get">
<table>
<tr> 
<td> Patient ID :</td>
<td> <input type="text" name="pid"/> </td>
</tr>
<tr> 
<td> Name : </td>
<td> <input type="text" name="pname"/> </td>
</tr>
<tr> 
<td>Email : </td>
<td> <input type="email" name="email"/></td>
</tr>
<tr> 
<td> Address :</td>
<td> <input type="text" name="address"/></td>
</tr>
<tr> 
<td> <input type="submit" value="ADD"/> </td>
</tr>
</table>
</form>
</body>
</html>