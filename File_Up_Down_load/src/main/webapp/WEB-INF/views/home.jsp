<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>
<%= session.getAttribute("id") %>
<c:if test="${sessionScope.id != null}">
	<form action="logout" method="post">
		<input type="submit" value="logout"/>
	</form>
</c:if>
<form action="login" method="post">
	<input type="text" name="id"></input>
	<input type="text" name="password"></input>
	<input type="submit" value="login"/>
</form>
</body>
</html>
