 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="java.util.*" %>
 <%@ page import="com.usman.bank.models.KNetTransferDTO" %>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>KNet History</title>
    <link href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css"  rel="stylesheet">
    <link href="../css/custom.css"   rel="stylesheet">
</head>
<script>
	function closePage()
	{
		location.href='/default'
	}	
</script>
<body>
	<%@include file="header.jsp" %>
	<div class="container" align="center">
	    <h3 class="hello-title">KNet Payment History</h3>
	    <table class="table table-width">
	    <thead>
			<tr>
				<th scope="col">Pay ID</th>
				<th scope="col">Track ID</th>
				<th scope="col">Amount KWD</th>
				<th scope="col">Stage</th>
				<th scope="col">Status</th>
				<th scope="col">Pay Response</th>
				<th scope="col">Init Date</th>
			</tr>
		  </thead>
		  <c:forEach items="${data}" var="item">
		    <tr>
		      <td><c:out value="${item.bbynPaymentId}" /></td>
		      <td><c:out value="${item.bbynTrackId}" /></td>
		      <td><c:out value="${item.amountInKwd}" /></td>
		      <td><c:out value="${item.stage}" /></td>
		      <td><c:out value="${item.status}" /></td>
		      <td><c:out value="${item.knetResponse}" /></td>
		      <td><c:out value="${item.knetInitDate}" /></td>
		    </tr>
		  </c:forEach>
		</table>
		<p></p>
		 <div align="center">
	    	<button id="close"  class="btn btn-primary btn-sm" value="close" onclick="closePage()">BACK</button>&nbsp;
	    </div>
    </div>
</body>
</html>