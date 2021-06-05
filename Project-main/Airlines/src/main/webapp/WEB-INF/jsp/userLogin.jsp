<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Login</title>
</head>
<body>
<table>
<tr>
<td>
<sf:label path="">Login Id : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Password : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="SIGN IN" name="">
</td>
</tr>
<tr>
<td>
<input type="submit" value="CREATE NEW ACCOUNT" name="">
</td>
</tr>
</table>
</body>
</html>