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
<div id="enter">
<sf:label path="">Enter Source:</sf:label>
<sf:input type="search" id="" placeholder="Enter from city"/>
<sf:label path="">Enter Destination:</sf:label>
<sf:input type="search" id="" placeholder="Enter to city"/>
<sf:label path="">Enter Date of Journey:</sf:label>
<sf:input type="date" id="" placeholder="dd-MM-yyy"/>
<br>
<sf:label path="">No.of passengers</sf:label>
<sf:select path="" id="">
<sf:options />
</sf:select>
</div>
<table>
<tr>
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
<sf:label>Book</sf:label>
<input type="submit" id=""/>
</td>
</tr>
</table>
</body>
</html>