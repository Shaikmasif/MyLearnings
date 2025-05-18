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
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js" integrity="sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.min.js" integrity="sha384-VQqxDN0EQCkWoxt/0vsQvZswzTHUVOImccYmSyhJTp7kGtPed0Qcx8rK9h9YEgx+" crossorigin="anonymous"></script>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-SgOJa3DmI69IUzQ2PVdRZhwQ+dy64/BUtbMJw1MZ8t5HZApcHrRKUc4W0kG879m7" crossorigin="anonymous">
  	<link href="<c:url value="/resources/css/style.css"/>" rel="stylesheet"/>
  </head>
  <body>
    <div class="container mt-5" style="width:40%">
    <h1>EDIT PRODUCT</h1>
    <form action="${pageContext.request.contextPath }/editProduct" method="POST">
  <div class="mb-3">
  <label for="exampleInputProductName" class="form-label">Product ID</label>
    <input type="text" name="id" class="form-control" id="productName" aria-describedby="emailHelp" value="${product.id }" readonly="readonly">
  
    <label for="exampleInputProductName" class="form-label">Product Name</label>
    <input type="text" name="name" class="form-control" id="productName" aria-describedby="emailHelp" value="${product.name }">
  </div>
  <div class="mb-3">
    <label for="exampleInputProductDescription" class="form-label">Product Description</label>
    <input type="text" name="desc" class="form-control" id="productDescription" aria-describedby="emailHelp" value="${product.desc }"/>
  </div>	
  <div class="mb-3">
    <label for="exampleInputProductPrice" class="form-label">Product Price</label>
    <input type="text" name="price" class="form-control" id="productPrice" value="${product.price }">    
  </div>
<div class="container text-center">
  	<a href="${pageContext.request.contextPath }/" class="btn btn-primary">BACK</a>
    <button type="submit" class="btn btn-success" >EDIT</button>
  
  </div></form>
    </div>
    
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.5/dist/js/bootstrap.bundle.min.js" integrity="sha384-k6d4wzSIapyDyv1kpU366/PK5hCdSbCRGRCMv+eplOQJWyd1fbcAu9OCUj5zNLiq" crossorigin="anonymous"></script>
    
  </body>
</html>