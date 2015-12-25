<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogOut Page</title>
<script>
	function formSubmit() {

		document.getElementById("logoutForm").submit();

	}
</script>

</head>
<body>

	<form action="${pageContext.request.contextPath}/loggedout" method="get"
		id="logoutForm">

		<input type="hidden" name="${_csrf.parameterName}"
			value="${_csrf.token}" />

		<p>

			<a href="javascript:formSubmit()"> Logout</a>

		</p>

	</form>
</body>
</html>