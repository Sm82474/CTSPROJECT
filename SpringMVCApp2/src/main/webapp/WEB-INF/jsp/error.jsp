<h1>Error Page</h1>
<%@page isErrorPage="true"%>

Following error
<%=exception.getMessage()%>
<% 
System.out.println(exception.getMessage()+" .....................");
%>