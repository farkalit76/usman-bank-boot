//alert("I'm active custom js");

$(document).ready(function() {
		//alert('ajax ready..');	
		$('#confirmPayment').click(function() {
			//alert('button clicked..');
			$.ajax({
				type: "POST",
				contentType : "application/json",
			    url: "http://10.7.91.40:7500/knet/confirm",
			    data: JSON.stringify({
			    	"bbynPaymentId": $('#bbynPaymentId').val(),
			        "bbynTrackId": $('#bbynTrackId').val(),
			        "cif": $('#cif').val(),
			        "custId": $('#custId').val(),
			        "amountInKwd": $('#amountInKwd').val(),
			        "fromAccount": $('#fromAccount').val(),
		            "toAccount": $('#toAccount').val(),
		            "stage": $('#stage').val(),
		            "status": $('#status').val(),
		            "bbynRefId": $('#bbynRefId').val(),
		            "transferTypeId": $('#transferTypeId').val(),
		            "isSmsSent": $('#isSmsSent').val(),
		            "comment": $('#comment').val(),
		            "tokenReq": $('#tokenReq').val()
			    }),

			    "success": function(data) {
			        console.log("start payment successful");
					//console.log(data);
				    document.open();
				    document.write(data);
				    //document.write(JSON.stringify( data ));
				    document.close()
			    },
			    "error": function(errorData) {
			        console.log("start payment ajax error")
			        console.log(errorData)
			    }
			});
			
		});
	});