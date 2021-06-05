<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Adding Flights</title>
</head>
<body>
<h3>Adding Flights</h3>
<table>
<tr>
<td>
<sf:label path="">Flight No : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Flight Name : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">From City: </sf:label>
</td>
<td>
<sf:input path=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">To City: </sf:label>
</td>
<td>
<sf:input path="" id="" />
</td>
</tr>
<tr>
<td>
<sf:label path="">Date: </sf:label>
</td>
<td>
<sf:input type="date" path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Time: </sf:label>
</td>
<td>
<sf:input type="time" path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Travel Duration: </sf:label>
</td>
<td>
<sf:input type="" path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">Price: </sf:label>
</td>
<td>
<sf:input type="number" path="" id=""/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Save" name="">
</td>
<td>
<input type="reset" value="Clear" name="">
</td>
</tr>
</table>
</body>
</html>