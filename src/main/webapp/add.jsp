<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add a Toy</title>
</head>
<body>
<form action="addToy" method="post">
		Toy Name:<input
			type="text" name="toyName" size="25"/> 
			
		Common Name: <input
			type="text" name="commonName" size="25"/> 
		
		Store Name: <input
			type="text" name="storeName" size="25"/> 
			
		Home Name: <input
		type="text" name="homeName" size="25"/> 
		
		Size : <input
			type="text" name="size" size="25"> 
		<input type="submit"value="Submit" />
	</form>
</body>
</html>