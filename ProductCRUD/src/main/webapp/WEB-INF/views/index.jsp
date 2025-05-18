<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!doctype html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Bootstrap demo</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.7.2/css/all.min.css" integrity="sha512-Evv84Mr4kqVGRNSgIGL/F/aIDqQb7xQ2vcrdIwxfjThSH8CSR7PBEakCr51Ck+w+/U6swU2Im1vVX0SVk9ABhg==" crossorigin="anonymous" referrerpolicy="no-referrer" />
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.min.js" integrity="sha384-VQqxDN0EQCkWoxt/0vsQvZswzTHUVOImccYmSyhJTp7kGtPed0Qcx8rK9h9YEgx+" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
  	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"/>
	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"/>  
  </head>
  <body>
    
    
    <div class="container mt-5 text-center" style="width:40%">
    <h1>Products List</h1>
    <table class="table">
    	<thead class="thead-dark">
    		<tr>
    		<th scope="col">Sl.No</th>
    		<th scope="col">Name</th>
    		<th scope="col">Description</th>
    		<th scope="col">Price</th></tr>
    		
    	</thead>
    	<tbody>
    	<c:forEach var="item" items="${products}">
    		<tr>
    		<th scope="row">PRODUCT	${item.id }</th>
    		<td>${item.name }</td>
    		<td>${item.desc }</td>
    		<td class="font-weight-bold">&#x20B9; ${item.price }<td><a href="deleteProduct/${item.id }"><i class="fa fa-trash text-danger"></i></a></td>
    		<td><a href="edit-product/${item.id }"><i class="fa-solid fa-pen-to-square"></i></a></td>
    		</td>
    		</tr>
    	</c:forEach>
    	</tbody>
    </table>
    <a class="btn btn-success" href="${pageContext.request.contextPath }/add-product">ADD PRODUCT</a>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js" integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq" crossorigin="anonymous"></script>
    
  </body>
</html>