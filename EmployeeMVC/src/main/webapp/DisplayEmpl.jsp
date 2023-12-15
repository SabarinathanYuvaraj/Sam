<%@page import="org.jsp.emp.entity.Employee"%>
<%@page import="java.util.ArrayList"%>

<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table id="table-1" border="2px">
		<thead>
			<tr>
				<th>ID</th>
				<th>USERNAME</th>
				<th>EMAIL</th>
			</tr>
		</thead>
		<tbody>
	<%List<Employee> empList=(List<Employee>)request.getAttribute("Employee"); 
	if(empList!=null){
		
	for(Employee emp:empList)
	{%>
	
		
			<tr>
				<td><%= emp.getEmpId() %></td>
				<td><%= emp.getEmpName() %></td>
				<td><%= emp.getEmpSal() %></td>
			</tr>
		
	<%} } %>
	</tbody>
		
	</table> 
	
	
	
</body>
</html>