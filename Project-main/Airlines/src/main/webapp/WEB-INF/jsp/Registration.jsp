<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<table>
<tr>
<td>
<sf:label path="">First Name* </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">LastName* </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Email Id* </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Password* </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Confirm Password* </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="SIGN UP" name="">
</td>
<td>
<input type="reset" value="RESET" name="">
</td>
</tr>
</table>

</body>
</html>