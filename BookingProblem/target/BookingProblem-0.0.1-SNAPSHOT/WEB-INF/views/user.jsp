<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>User Registration</title>
<meta charset="utf-8">
<style type="text/css">
body {
	background-image: url('resources/images/third.jpg');
}
</style>
<link href="resources/css/custom.css" rel="stylesheet">

<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<script src="resources/js/validate.js"></script>
</head>
<body>
	<form class="form" action="userToDb" method="post">

		<div class="container">
			<h1>Register</h1>
			<p>Please fill in this form to register.</p>
			<hr>

			<div class="form-group">
				<label for="Full name"><b>Full Name</b></label> <input
					class="form-control" type="text" placeholder="Enter your full name"
					name="userName" id="userName" required>
				<p id="u"></p>
				<br>
			</div>
			<div class="form-group">
				<label for="age"><b>Age</b></label> <input class="form-control"
					type="tel" placeholder="Enter your age" name="userAge" id="userAge"
					required>
				<p id="a"></p>
			</div>
			<hr>
			<p>
				By creating an account you agree to our <a href="#">Terms and
					Privacy</a>.
			</p>
			<button type="submit" class="registerbtn">Register</button>
		</div>

		<div class="container signin">
			<p>
				Already have an account? <a href="#">Sign in</a>.
			</p>
		</div>
	</form>
</body>
</html>