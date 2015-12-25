<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath }/static/css/main.css"
	rel="stylesheet" type="text/css">
	
	
<title>Create New Account</title>
</head>

<body>
 <fmt:message key="Passwords.match" />
	<sf:form action="${pageContext.request.contextPath}/createAccount"
		method="post" commandName="user">
		<h2>Create New Account</h2>
		<table class="formTable">
			<tr>
				<td class="label">User Name : <sf:input path="userName"
						type="text" class="control" /><br />
					<div class="error">
						<sf:errors path="userName"></sf:errors>
					</div>
				</td>
			</tr>
			<tr>
				<td class="label">Email : <sf:input type="text" class="control"
						path="email" /><br />
					<div class="error">
						<sf:errors path="email"></sf:errors>
					</div></td>
			</tr>
			<tr>
				<td class="label">Password : <sf:input type="text"
						class="control" path="password" /><br />
					<div class="error">
						<sf:errors path="password">

						</sf:errors>
					</div></td>
			</tr>
			<tr>
				<td class="label">Confirm Password : <input type="text"
					class="control" name="confirmpass" /><br />
				</td>
			</tr>
			<tr>
				<td class="label"><sf:input path="" type="submit"
						class="control" value="Create Account" /></td>
			</tr>
		</table>
		<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />
	</sf:form>
</body>

</html>