<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
 <html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
  <script>
        function updateAction() {
            var id = document.getElementById("idInput").value;
            var name = document.getElementById("nameInput").value;
            var form = document.getElementById("testForm");
            form.action = "Testing/" +id+"/"+name;
            
        }
    </script>
</head>
<body>
	
	 <form id="testForm" action="Testing" method="post" >
        <label>ID:</label>
        <input type="text" id="idInput" name="id" required><br>
         <label>name:</label>
        <input type="text" id="nameInput" name="name" required><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>