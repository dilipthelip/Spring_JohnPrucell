<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>


<%-- <sql:query var="rs" dataSource="jdbc/springDB">
select * from offers
</sql:query> --%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<form action="">
<sec:authorize access="!isAuthenticated()">
<p>   <a href = "${pageContext.request.contextPath}/customlogin"> Log In  </a></p>
</sec:authorize>
<p>	  <a href = "${pageContext.request.contextPath}/offers"> List of Offers   </a></p>
<p>   <a href = "${pageContext.request.contextPath}/createOffers"> Create Offer  </a></p>
<p>   <a href = "${pageContext.request.contextPath}/newAccount"> Create a New Account  </a></p>
<p>   <a href = "${pageContext.request.contextPath}/logout"> Log Out  </a></p>
<sec:authorize access="hasRole('ADMIN')">
<p>   <a href = "${pageContext.request.contextPath}/admin"> Admin  </a></p>
</sec:authorize>
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
</form> 



</body>
</html>