<%-- <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <script>
        function updateAction() {
            var name = document.getElementById("eName").value;
            
            var sal = document.getElementById("eSal").value;

            
            var id = document.getElementById("eId").value;
            console.log(id+name+sal);
            var form = document.getElementById("empForm");
            form.action = "add/" +id+ "/" +name+ "/" +sal;
            
        }
    </script>
</head>
<body>
	<table>
		<form action="add" onsubmit="updateAction()" id="empForm" method="get">
			<tr>
				<td><label for="name">Emp name</label>
				<td />
				<td><input type="text" name="name" id="eName">
				<td />
			<tr />
			<tr>
				<td><label for="sal">EmpSal</label>
				<td />
				<td><input type="number" name="sal" id="eSal">
				<td />
			<tr />
			<tr>
				<td><label for="quantity">EmpId</label>
				<td />
				<td><input type="number" name="id id="eId">
				<td />
			<tr />
			<tr>
				<td><label for=""></label>
				<td />
				<td><input type="submit" value="submit">
				<td />
			<tr />

		</form>
	</table>
</body>
</html> --%>



<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Insert title here</title>
  <script>
        function updateAction() {
            var name = document.getElementById("eName").value;
            var sal = document.getElementById("eSal").value;
            var id = document.getElementById("eId").value;
            console.log(id + name + sal);
            var form = document.getElementById("empForm");
            form.action = "add/" + id + "/" + name + "/" + sal;
        }
    </script> 
</head>
<body>
    <table>
        <form action="add" method="post" >
            <tr>
                <td><label for="name">Emp name</label></td>
                <td><input type="text" name="name" id="eName"></td>
            </tr>
            <tr>
                <td><label for="sal">EmpSal</label></td>
                <td><input type="number" name="sal" id="eSal"></td>
            </tr>
            <tr>
                <td><label for="id">EmpId</label></td>
                <td><input type="number" name="id" id="eId"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="submit"></td>
            </tr>
        </form>
    </table>
</body>
</html>
