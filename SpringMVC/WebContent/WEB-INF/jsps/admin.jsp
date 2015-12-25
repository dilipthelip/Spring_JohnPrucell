<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Users</title>
</head>
<body>

<body>
	<h1> Below are the Available users </h1>
	<table>
			<thead>
				<tr>
					<td>UserName</td>
					<td>Email</td>
					<td>Authority</td>
					<td>Enabled</td>
				</tr>
			</thead>
	<c:forEach var="user" items="${users}">

		
			<tr>
				<td>${user.userName}<br />
				</td>
				<td> ${user.email}<br />
				</td>
				<td> ${user.authority}<br />
				</td>
				<td> ${user.enabled}<br />
				</td>
			</tr>
		
	</c:forEach>
	</table>
	
	<a href="${pageContext.request.contextPath}/"> Home page</a>

</body>
</body>
</html>