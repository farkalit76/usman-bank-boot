 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <%@ page import="java.util.*" %>
 <%@ page import="com.usman.bank.models.KNetTransferDTO" %>
 
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Start Payment</title>
     <link href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css"  rel="stylesheet">
     <link href="../css/custom.css"   rel="stylesheet">
</head>
<script>

</script>
<body>
	<%@include file="header.jsp" %>
	<div class="container">
		<h2 class="hello-title">KNet Confirm Payment..</h2>
	  	<script>
			window.open("${response.knetPaymentUrl}", "_self");
		</script>	
	</div>
    <script src="../webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="../webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="../js/custom.js"></script>
        
</body>
</html>