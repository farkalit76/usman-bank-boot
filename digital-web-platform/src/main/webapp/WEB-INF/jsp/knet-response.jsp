 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>KNet Response</title>
    <link href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css"  rel="stylesheet">
     <link href="../css/custom.css"   rel="stylesheet">
</head>
<body>
	<%@include file="header.jsp" %>
	<div class="container" align="center">
		<c:choose>
			<c:when  test ="${status.success}">
				<h2><font color="green" >Successfully Completed</font></h2> 
			</c:when>
		    <c:otherwise >
				<h2><font color="red" >Failed</font></h2> 
			</c:otherwise>
		</c:choose>
		<table class="table" >
	        <tbody>
	            <tr>
		            <th scope="row">Transaction Date:</th>
		            <td>${response.knetInitDate}</td>
	            </tr>
	            <tr>
		            <th scope="row">Track ID:</th>
		            <td>${response.bbynTrackId}</td>
	            </tr>
	            <tr>
		            <th scope="row">KNET Payment ID:</th>
		            <td>${response.knetPaymentId}</td>
	            </tr>
	            <tr>
		            <th scope="row">KNET Response ID:</th>
		            <td>${response.knetResponse}</td>
	            </tr>
	            <tr>
		            <th scope="row">KNET Reference ID:</th>
		            <td>${response.knetRefId}</td>
	            </tr>
	            <tr>
		            <th scope="row">Amount in KWD:</th>
		            <td>${response.amountInKwd}</td>
	            </tr>
	        </tbody>
        </table>   
         
	    <div align="center">
	    	<button id="close"  class="btn btn-primary btn-sm" value="close" onclick="window.close()">CLOSE</button>&nbsp;
	    </div>
	     <script src="../webjars/jquery/1.9.1/jquery.min.js"></script>
	    <script src="../webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
	    <script src="../js/custom.js"></script>
    </div>
</body>
</html>