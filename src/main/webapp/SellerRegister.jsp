<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="ProductRegisterServlet" method="post">
      ProductName:<input type="text" name="productName">
      Description:<input type="text" name="description">
      Location:<input type="text" name="location">
      SellerName:<select name="sellerName">
      	<option>John</option>
      	<option>Susan</option>
      	<option>David</option>
      	</select>
      	<input type="submit" value="Product Registeration">
</form>
</body>
</html>