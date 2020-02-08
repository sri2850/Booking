$(document).ready(function() {
	$("#u").hide();
	$("#a").hide();
	$("#userName").blur(function() {

		let userName = $("#userName").val().length;
		if (userName < 5) {
			$("#u").html("name should be more than 5");
			$("#u").show();
			return false;
		} else {
			$("#u").hide();
			return true;
		}
	});

	$("#userAge").blur(function() {
		let userAge = $("#userAge").val();
		console.log(userAge);
		if (userAge < 18) {
			$("#a").html("age should be more than 18");
			$("#a").show();
			return false;
		} else {
			$("#a").hide();
			return true;
		}
	});

	$('#forms').validate({
		rules : {
			fromPlace : {
				required : true,
				lettersonly : true,
				minlength : 5,
				maxlength : 15
			},
			toPlace : {
				required : true,
				lettersonly : true,
				minlength : 5,
				maxlength : 15
			},
			doj : {
				required : true,
			},
			distance : {
				required : true,
				number : true,
				minvalue : 200
			}
		}
	});

});