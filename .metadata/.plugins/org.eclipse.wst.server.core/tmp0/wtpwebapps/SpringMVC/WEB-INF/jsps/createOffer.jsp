<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="${pageContext.request.contextPath }/static/css/main.css" rel="stylesheet" type="text/css">
<title>New Offer</title>
</head>

<body>
	<sf:form action="${pageContext.request.contextPath}/doCreate"
		method="post" commandName="offer">

		<table class="formTable">
			<tr>
				<td class="label">Name : <sf:input path="name" type="text" class="control"  /><br/>
				<sf:errors path="name" cssClass="error"></sf:errors>
				
				</td>
			</tr>
			<tr>
				<td class="label">Email : <sf:input type="text" class="control" path="email" /><br/>
				<sf:errors path="email" cssClass="error"></sf:errors></td>
			</tr>
			<tr>
				<td class="label">Offer : <sf:textarea rows="5" cols="20" class="control"
						path="text"/> <br/>
				<sf:errors path="text" cssClass="error"></sf:errors>
			</tr>
			<tr>
				<td class="label"><sf:input path="" type="submit" class="control" value="Create Ad" /></td>
			</tr>
		</table>
		
		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />
		
	</sf:form>
</body>

</html>