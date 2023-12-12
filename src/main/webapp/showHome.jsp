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
	List of all Homes and toys:
	<table>
		<c:forEach items="${requestScope.allHomes}" var="currenthome">
			<tr>
				<td>${currenthome.name}|</td>
				<td>${currenthome.location}</td>
				
			</tr>
			<c:forEach items="${currenthome.toys}" var="currenttoy">
					<tr>
						<td>${currenttoy.commonName}|</td>
						<td>${currenttoy.storeName}|</td>
						<td>${currenttoy.size}</td>
					</tr>
				</c:forEach>
		</c:forEach>
	</table>
	<br />
	<a href="index.jsp">Home</a>

</body>
</html>