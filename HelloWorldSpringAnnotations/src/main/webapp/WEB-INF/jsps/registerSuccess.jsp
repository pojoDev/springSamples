<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
	<title>Register for the application</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>Self Registration Success!!!</h2>	
	<br>
	<br>
	${msg}
	<br>
	<br>
	<form name="userRegisterForm" action="register.do" method="POST">
		Full Name: ${userRegisterForm.name}
		<br>
		<br>
		TimeStamp: ${userRegisterForm.timestamp}
	</form>
	
</body>
</html>