<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>

<html>
<head>
	<title>Register for the application</title>
	<link rel='stylesheet' href='<c:url value="/resources/css/style.css" />' type='text/css' media='all' /> 
</head>
<body>
	<h2>Self Registration</h2>	
	<br>
	<br>
	<form name="userRegisterForm" action="register.do" method="POST">
		Full Name: <input type="text" name="name" value="SID">

		<br>
		<br>
		<br>
		TimeStamp: <input type="text" name="timestamp" value="2015-08-09 14:20:29">
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>