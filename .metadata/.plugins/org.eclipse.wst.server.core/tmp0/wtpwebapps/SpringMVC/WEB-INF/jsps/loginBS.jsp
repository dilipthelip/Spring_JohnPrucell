<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html ng-app="validation">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.css" />
<script src="https://code.angularjs.org/1.3.0-rc.2/angular.js"></script>
<script src="https://code.angularjs.org/1.3.0-rc.2/angular-messages.js"></script>
</head>
<body class="container"
	ng-controller="RegistrationController as registration">
	<h1>Register!</h1>
	<h3>{{ registration.message }}</h3>

	<form name="registrationForm">

		<div class="form-group">
			<label>User Name</label> <input type="text" name="username"
				class="form-control" ng-model="registration.user.username" required />
			<div ng-messages="registrationForm.username.$error"
				ng-messages-include="messages.html"></div>
		</div>

	</form>


</body>
</html>