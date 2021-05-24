<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<style>
@import url("../CSS/style1.css");
</style>

<form:form modelAttribute="product" action="shoppingAction">

	<h1>Shopping</h1>

	<form:label path="prdId">Enter Id</form:label>
	<form:input path="prdId"/>
	<form:errors path="prdId"/>
<br>
	<form:label path="prdName">Enter Name</form:label>
	<form:input path="prdName"/>
	<form:errors path="prdName"/>
<br>
	<form:label path="cost">Enter Cost</form:label>
	<form:input path="cost"/>
	<form:errors path="cost"/>
	<br>
	<input type="submit" value="Add Product" name="operation"><br><br>
	<input type="submit" value="ShowAll Product" name="operation">
	
	<br>
	<br>
	
	<input type="submit" value="Search Product" name="operation1">
	








</form:form>