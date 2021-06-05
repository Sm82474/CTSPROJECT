<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Confirmation Details</h3>
<table>
<tr>
<td>
<sf:label path="">Flight No : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
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
</table>
<br>
<h3>Your Details</h3>
<table>
<tr>
<td>
<sf:label path="">Name: </sf:label>
</td>
<td>
<sf:input path="" id="" />
</td>
<td>
<sf:label path="">Mobile No : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label path="">E-Mail id : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:label path="">Address: </sf:label>
</td>
<td>
<sf:input type="textarea" path="" id=""/>
</td>
<td>
</tr>
<tr>
<td>
<sf:label path="">Final Amount : </sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
</tr>
</table>
<br>
<table>
<tr>
<td>
<sf:label>Card Number</sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label>Card Holder name</sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label>Expiry Month</sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label>Expiry Year</sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label>CVV Number</sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""/>
</td>
</tr>
<tr>
<td>
<sf:label>Mobile Number</sf:label>
</td>
<td>
<sf:input path="" id=""/>
</td>
<td>
<sf:errors path="" id=""/>
</td>
</tr>
<tr>
<td>
<input type="submit" value="Pay & Book" name="">
</td>
<td>
<input type="reset" value="Cancel Payment" name="">
</td>
</tr>
</table>
</body>
</html>