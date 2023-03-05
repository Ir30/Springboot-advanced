<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Products</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add Product"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					<th>Product Name</th>
					<th>Type</th>
					<th>Prize</th>
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempProduct" items="${products}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/product/showFormForUpdate">
						<c:param name="productId" value="${tempproduct.id}" />
					</c:url>					

					<!-- construct an "delete" link with customer id -->
					<c:url var="deleteLink" value="/product/delete">
						<c:param name="productId" value="${tempproduct.id}" />
					</c:url>					
					
					<tr>
						<td> ${tempproduct.productName} </td>
						<td> ${tempproduct.type} </td>
						<td> ${tempproduct.price} </td>
						
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">Update</a>
							|
							<a href="${deleteLink}"
							   onclick="if (!(confirm('Are you sure you want to delete this product?'))) return false">Delete</a>
						</td>
						
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









