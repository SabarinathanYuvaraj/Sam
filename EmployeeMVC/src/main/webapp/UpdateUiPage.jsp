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
			</tr>
		</thead>
		<form action="UpdateById" id="form-1">
		<tbody>
			
			
	<%List<Employee> userlist=(List<Employee>)request.getAttribute("EmployeeList"); 
	if(userlist!=null){%>
		
	<%for(Employee emp:userlist)
	{%>
	
		
			<tr>
				<td> <input value="<%= emp.getEmpId() %>" type="text" readonly="readonly" name="id"> </td>
				<td> <input value="<%= emp.getEmpName() %>" type="text" name="name" ></td>
				<td><input value="<%= emp.getEmpSal() %>" type="text" name="sal" ></td>
			</tr>
		
	<% } %>
	<h1>hii</h1>
		
	<%} %>
	
	</tbody>
		<input type="submit" value="update" id="button-1"/>
	</form>
	</table> 
</body>
</html>