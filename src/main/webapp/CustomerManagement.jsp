<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Management</title>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/boot strap.min.css" integrity="sha384- ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
<div class="row">
	<div class="container">
		<h3 class="text-center">List of Products</h3>
		<hr>
		<div class="container text-left">
			<!-- Add new product button redirects to the register.jsp page -->
			<a href="<%=request.getContextPath()%>/productregister.jsp" class="btn btn- success">Add New Product</a>
	</div>
	<br>
	<!-- Create a table to list out all current products information -->
	<table class="table">
		<thead>
			<tr>
				<th>ProductName</th>
				<th>Description</th>
				<th>Location</th>
				<th>SellerName</th>
				<th>Actions</th>
 			</tr>
		</thead>
 
		<!-- Pass in the list of products receive via the Servletâ€™s response to a loop -->
		<tbody>
			<c:forEach var="product" items="${listProducts}">
				<!-- For each product in the database, display their information accordingly -->
				<tr>
 					<td>
						 <c:out value="${product.productName}"/>
					</td>
					<td>
						 <c:out value="${product.description}"/>
					</td>
					<td>
						 <c:out value="${product.location}"/>
					</td>
					<td>
						 <c:out value="${product.sellerName}"/>
					</td>

					<!-- For each product in the database, Edit/Delete buttons which invokes the edit/delete functions -->
					<td>
						<a href="edit?productName=<c:out value='${product.productName}' />">Edit</a> &nbsp;&nbsp;&nbsp;&nbsp;
						<a href="delete?productName=<c:out value='${product.productName}' />">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	</div>
</div>

</body>
</html>
