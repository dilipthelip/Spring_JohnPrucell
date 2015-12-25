<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>Login Page</title>
<link href="${pageContext.request.contextPath }/static/css/main.css"
	rel="stylesheet" type="text/css">

</head>
<body onload='document.f.username.focus();'>
	<h3>Login with Username and Password New page</h3>

	<c:if test="${param.error != null }">

		<p class="error">Login failed. UserName/Password is incorrect.</p>
<%-- 		<c:out value="${param.error }"></c:out>
 --%>		
	</c:if>
	<form name='f' action='${pageContext.request.contextPath }/login'
		method='POST'>
		<table class="formTable">
			<tr>
				<td>User:</td>
				<td><input type='text' name='username' value=''></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type='password' name='password' /></td>
			</tr>
			<tr>
				<td>Rememebr Me:</td>
				<td><input type="checkbox" name='remember-me'  checked="checked"/></td>
			</tr>
			<tr>
				<td colspan='2'><input name="submit" type="submit"
					value="Login" /></td>
			</tr>
			<input type="hidden" name="${_csrf.parameterName}"
				value="${_csrf.token}" />

			
		</table>
		
		<a
				href='<c:url value="/newAccount"></c:url>' >
				Create Account </a>
	</form>
</body>
</html>