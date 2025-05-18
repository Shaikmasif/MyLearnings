<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="<c:url value="/resources/css/styles.css" />" rel="stylesheet"/>
</head>
<body>
<h1>HomePage</h1>
<% String name = (String)request.getAttribute("Name");
	List<String> marks = (List)request.getAttribute("marks");
%>
<h2>My Name is ${Name }</h2>
<c:forEach var="item" items="${marks }">
 <h1>${item}</h1>
 <h1><c:out value="${item }"></c:out></h1>
</c:forEach>
<img src="<c:url value="/resources/images/th.jpg"/>" alt="image">
</body>
</html>