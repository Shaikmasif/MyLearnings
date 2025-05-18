<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>You're registered with us</h1>
<h2>${student.username }</h2>
<h2>${student.email }</h2>
<h2>${student.password }</h2>
<form action="register">
<button type="submit">GO TO REGISTER</button></form>
</body>
<script type="text/javascript"></script>
</html>