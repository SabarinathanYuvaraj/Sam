<%@page import="org.jsp.emp.entity.Employee"%>
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
				<th>NAME</th>
				<th>SAL</th>
				<th>UPDATE</th>
				<th>DELETE</th>
			</tr>
		</thead>
		<tbody>
	<%List<Employee> userlist=(List<Employee>)request.getAttribute("EmployeeList"); 
	if(userlist!=null){
		
	for(Employee emp:userlist)
	{%>
	
		
			<tr>
				<td><%= emp.getEmpId() %></td>
				<td><%= emp.getEmpName() %></td>
				<td><%= emp.getEmpSal() %></td>
				<td><a href="Update?val=<%= emp.getEmpId() %>">update</a></td>
				<td><a href="Delete?id=<%= emp.getEmpId() %>">delete</a></td>
				
			</tr>
		
	<%} } %>
	</tbody>
		
	</table> 
</body>
</html>