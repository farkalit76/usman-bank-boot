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
     <script>
		function rejectPayment()
		{
			location.href='/hello'
		}	
	</script>
</head>
<body>
	<%@include file="header.jsp" %>
	<form id="payForm">
		<input type="hidden" id="bbynPaymentId" value="${response.bbynPaymentId}" /> 
		<input type="hidden" id="bbynTrackId" value="${response.bbynTrackId}" /> 
		<input type="hidden" id="cif" value="${response.cif}" /> 
		<input type="hidden" id="custId" value="${response.custId}" /> 
		<input type="hidden" id="amountInKwd" value="${response.amountInKwd}" /> 
		<input type="hidden" id="fromAccount" value="${response.fromAccount}" /> 
		<input type="hidden" id="toAccount" value="${response.toAccount}" /> 
		<input type="hidden" id="stage" value="${response.stage}" /> 
		<input type="hidden" id="status" value="${response.status}" /> 
		<input type="hidden" id="bbynRefId" value="${response.bbynRefId}" />
		<input type="hidden" id="transferTypeId" value="${response.transferTypeId}" />
		<input type="hidden" id="isSmsSent" value="${response.isSmsSent}" />
		<input type="hidden" id="comment" value="${response.comment}" />
		<input type="hidden" id="tokenReq" value="${response.tokenReq}" /> 
	</form>
	<div class="container" align="center">
		<h3 style="background:red; color:#ffffff; width:65%;">Transaction Details</h3>
		 <table class="table" >
	        <tbody>
	            <tr>
		            <th scope="row">Payee Name:</th>
		            <td>${response.cif}</td>
	            </tr>
	            <tr>
		            <th scope="row">Amount:</th>
		            <td>${response.amountInKwd} (KWD)</td>
	            </tr>
	            <tr>
		            <th scope="row">Comment:</th>
		            <td>${response.comment}</td>
	            </tr>
	        </tbody>
        </table>   
	    <div align="center">
	        <button class="btn btn-primary btn-sm" id="confirmPayment"  name="confirmPayment" value="JSON.stringify(${response})" type="button">Confirm</button>&nbsp;
	        <button class="btn btn-primary btn-sm" id="rejectPayment"  name="rejectPayment" onclick="rejectPayment()" type="button">Reject</button>
	    </div>
	</div>
    <script src="../webjars/jquery/1.9.1/jquery.min.js"></script>
    <script src="../webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
    <script src="../js/custom.js"></script>
        
</body>
</html>