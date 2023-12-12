<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Toy</title>
</head>
<body>


	<form action="updateToy" method="post">
		New Common Name: <input type="text" name="commonName" size="25" />
		New Store Name: <input type="text" name="storeName" size="25" /> 
		New Average Size: <input type="text" name="size" size="25" />
		New Home Name: <input type="text" name="homeName" size="25" />
		Enter the current Toy name: <input type="text" name="oldName"
			size="25"> <input type="submit" value="Update" />
	</form>
</body>
</html>