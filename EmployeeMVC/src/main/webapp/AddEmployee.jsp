<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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