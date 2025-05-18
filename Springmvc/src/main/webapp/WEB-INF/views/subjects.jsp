<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>I'm Subjects.jsp</h1>
<h1>subjects = ${subjects }</h1>
<c:forEach var="item" items="${subjects }">
<h2>${item }</h2>
<h3><c:out value="${item }"></c:out></h3>
<h4>${time }</h4>
</c:forEach>
</body>
</html>