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
<!-- 
	<p> ${key1}  </p>
	<p> ${key2}  </p>
 -->
			<table class="table table-striped">
		<caption>Cart List</caption>
		<thead>
			<th>Item Name</th>
			<th>Item Price</th>
			<th>Add</th>
			<th></th>
		</thead>
		<tbody>
					
				<tr>
					<td>${key1}</td>
					<td>${key2}</td>
					<td >  <a href ="logout.jsp">Place-Order</a>  </td>
					</tr>
	<a href="shoppinglist">Go-Back-to-Shopping</a>				

</body>
</html>