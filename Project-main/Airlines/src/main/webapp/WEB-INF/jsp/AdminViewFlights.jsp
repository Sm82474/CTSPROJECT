<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Flight Details</title>
</head>
<body>
<h3>Flight Details</h3>
<table>
<tr>
<td>
<sf:label path="">Select(All)</sf:label>
<sf:checkbox path=""/>
</td>
<td>
<sf:label path="">Flight No</sf:label>
</td>
<td>
<sf:label path="">Flight Name</sf:label>
</td>
<td>
<sf:label path="">Source</sf:label>
</td>
<td>
<sf:label path="">Destination</sf:label>
</td>
<td>
<sf:label path="">Date</sf:label>
</td>
<td>
<sf:label path="">Time</sf:label>
</td>
<td>
<sf:label path="">Duration</sf:label>
</td>
<td>
<sf:label>Price</sf:label>
</td>
<td>
<sf:label>Edit</sf:label>
<input type="submit" id=""/>
</td>
</tr>
</table>
<br>
<input type="button" value="New"/>
<input type="button" value="Delete"/>
<input type="button" value="Back"/>
</body>
</html>