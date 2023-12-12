<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Toys</title>
</head>
<body>
	List of all toys:
	<table>
		<c:forEach items="${requestScope.allToys}" var="currentoy">
			<tr>
				<td>${currentoy.commonName}|</td>
				<td>${currentoy.storeName}|</td>
				<td>${currentoy.size}|</td>
				<td>${currentoy.home.name}</td>
			</tr>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>