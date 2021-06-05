<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Passenger Details</title>
</head>
<body>
<h3>PASENGER DETAILS</h3>
<table>
<tr>
<td>
<sf:label path="">Mobile No.* : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""></sf:errors>
</td>
</tr>
<tr>
<td>
<sf:label path="">E-Mail id.* : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""></sf:errors>
</td>
</tr>
<tr>
<td>
<sf:label path="">Gender: </sf:label>
</td>
<td>
<sf:select path="">
<sf:options />
</sf:select>
</td>
</tr>
<tr>
<td>
<sf:label path="">Name: </sf:label>
</td>
<td>
<sf:input path="" id="" />
</td>
<td>
<sf:errors path="" id=""></sf:errors>
</td>
</tr>
<tr>
<td>
<sf:label path="">Age: </sf:label>
</td>
<td>
<sf:input type="number" path="" id=""/>
</td>
<td>
<sf:errors path="" id=""></sf:errors>
</td>
</tr>
<tr>
<td>
<sf:label path="">Address: </sf:label>
</td>
<td>
<sf:input type="textarea" path="" id=""/>
</td>
<td>
<sf:errors path="" id=""></sf:errors>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Proceed" name="">
</td>
</tr>
</table>
</body>
</html>