<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>usman Transfer</title>
    <link href="../webjars/bootstrap/3.3.6/css/bootstrap.min.css"  rel="stylesheet">
     <link href="../css/custom.css"   rel="stylesheet">
</head>
<script>
	function callHistory(){
		location.href='/knet/history'
	}

	function startPayment()
	{
		location.href='/knet/pay?env=DCP-USMAN&l=en&t=OHRUTDY5WStFQS91Z2s5dVVVOXMvQT09'
	}
</script>
<body>	
	<%@include file="header.jsp" %>
	<div class="container">
	    <h3 class="hello-title">usman Payment Dashboard</h3>
	    <button class="btn btn-primary btn-sm" onclick="callHistory()">Payment History</button>&nbsp;
	    <button class="btn btn-primary btn-sm" onclick="startPayment()">KNet Start Payment</button>
    </div>
</body>
</html>