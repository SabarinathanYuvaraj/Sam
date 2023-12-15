<%@page import="org.jsp.emp.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%Employee employee=(Employee)request.getAttribute("Employee"); %>

	<form action="/update">
		<label for="id">Id:</label>
		<input id="id" type="text" value="<%=  employee.getEmpId()%>>" readonly="readonly"/>
		<label for="id">Id:</label>
		<input id="id" type="text" value="<%= employee.getEmpName() %>>" />
		<label for="id">Id:</label>
		<input id="id" type="text" value="<%=  employee.getEmpSal()%>" />
			<input type="submit" value="update"/>
	</form>
</body>
</html>