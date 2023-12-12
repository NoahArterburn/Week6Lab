<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toy Library</title>
</head>
<body>

	<h1>Toy Library</h1>
	<form action="showToy" method="get">
		<input type="submit" value="Show Toys" />
	</form>
	<a href="update.jsp">Update Toys</a>
	<a href="delete.jsp">Delete Toys</a>
	<a href="add.jsp">Add Toys</a>
	<form action="showHome" method="get">
		<input type="submit" value="Show Homes" />
	</form>
	<a href="updateHome.jsp">Update Home</a>
	<a href="deleteHome.jsp">Delete Home</a>
	<a href="addHome.jsp">Add Home</a>

</body>
</html>