<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
	<title>Spring 4 MVC Hello World Example with Maven Eclipse</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>Hello World, Spring MVC</h2>

	<p>Welcome, ${name}</p>
	
	<br>
	<br>
	<a href="register.do"> Register</a>
	
</body>
</html>