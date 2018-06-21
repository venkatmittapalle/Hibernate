<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ page isELIgnored="false" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>List</h1>

	<table class="table table-striped">
		<caption>Cart List</caption>
		<thead>
			<th>Item Name</th>
			<th>Item Price</th>
			<th>Add</th>
			<th></th>
		</thead>
		<tbody>
					<c:forEach items="${cartlist}" var="cartitem">
				<tr>
					<td>${cartitem.item}</td>
					<td>${cartitem.price}</td>
					<td >  <a href ="cart?item=${cartitem.item}&price=${cartitem.price}">Add</a>  </td>
		<!-- 	<td>
			<a href="cart?item=${item }&price=${price }">Buy Item</a>
			</td> -->
					<!-- <td >  <a href ="name=${cartitem.item}">Add</a>  </td>  -->
					
					
				</tr>
						</c:forEach>
	<!-- 					<tr>
			
			<td>&nbsp;&nbsp;
			<a class="btn btn-danger"
					href="cart">Buy Item</a>
			</td>
			
			</tr> -->

		</tbody>
	</table>
</body>
</html>