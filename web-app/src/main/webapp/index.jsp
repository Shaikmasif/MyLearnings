<%@page import="java.util.Date"%>
<%@page import="javax.xml.crypto.Data"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is a Testing Project</h1>
	<p>testing project</p>
	<%=new Date().toLocaleString()%>
	<br>
	<a href="login">Login Servlet</a>
</body>
</html>