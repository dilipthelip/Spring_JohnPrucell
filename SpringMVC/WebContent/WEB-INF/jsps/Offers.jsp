<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Offers</title>
</head>
<body>
	<h1>Below are the currently available offers</h1>
	<table>
			<thead>
				<tr>
					<td>ID</td>
					<td>name</td>
					<td>email</td>
					<td>Text</td>

				</tr>
			</thead>
	<c:forEach var="offer" items="${offers}">

		
			<tr>
				<td>${offer.id}<br />
				</td>
				<td> ${offer.name}<br />
				</td>
				<td> ${offer.email}<br />
				</td>
				<td> ${offer.text}<br />
				</td>
			</tr>
		
	</c:forEach>
	</table>
	
	<a href="${pageContext.request.contextPath}/"> Home page</a>

</body>
</html>