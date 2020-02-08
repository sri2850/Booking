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
	background-image: url('resources/images/four.jpg');
}
</style>
<link href="resources/css/custom.css" rel="stylesheet">
<meta name="viewport" content="width=device-width, initial-scale=1">

<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css"
	rel="stylesheet">
<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<script src="https://code.jquery.com/jquery-1.11.1.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.7.2.min.js"></script>
<script type="text/javascript"
	src="http://code.jquery.com/ui/1.10.4/jquery-ui.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery-validate/1.19.1/additional-methods.min.js"
	integrity="sha256-vb+6VObiUIaoRuSusdLRWtXs/ewuz62LgVXg2f1ZXGo="
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/jquery.validate.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/jquery.validation/1.16.0/additional-methods.min.js"></script>

<script src="resources/js/validate.js"></script>

</head>
<body>
	<div class="container">
		<h1>Book your ticket</h1>
		<p>Please fill in this form to book your tickets.</p>
		<hr>
		<div class="contain">
			<form class="forms" id="forms" action="booking" method="post">

				<div class="form-group">
					<label for="userName">FULL NAME :: </label> <select
						class="form-control" id="userId" name="userId">
						<option value="some">select the users</option>
						<c:forEach items="${users}" var="user">

							<option value="${user.userId }">${user.userName }</option>
						</c:forEach>
					</select>
				</div>
				<br>
				<div class="form-group">
					<label for="fromPlace"><b>FROM</b></label> <input
						class="form-control" type="text"
						placeholder="Enter your from place" name="fromPlace"
						id="fromPlace" required>
				</div>
				<br>
				<div class="form-group">
					<label for="toPlace"><b>TO</b></label> <input class="form-control"
						type="text" placeholder="Enter your to place" name="toPlace"
						id="toPlace" required>
				</div>
				<br>
				<div class="form-group">
					<label for="doj"><b>Date of journey</b></label> <input
						class="form-control" type="date"
						placeholder="Enter your date of journey" name="doj" id="doj"
						required>
				</div>
				<br>
				<div class="form-group">
					<label for="distance"><b>DISTANCE</b></label> <input
						class="form-control" type="tel" placeholder="Distance"
						name="distance" id="distance" required>
				</div>
				<br>
				<div class="form-group">
					<label for="foodPreference"><b>foodPreference</b></label><br>
					<input type="radio" name="foodPreference" value="Vegeterian"
						id="Vegeterian"> Vegeterian <br> <input type="radio"
						name="foodPreference" value="Non-veg" id="Non-veg">
					non-veg
				</div>
				<br>
				<div class="form-group">
					<label for="travellingWith"><b>travellingWith</b></label><br>
					<input type="checkbox" name="travellingWith" value="VISA"
						id="travellingWith" onclick="onlyOne(this)">visa<br>
					<input type="checkbox" name="travellingWith" value="PASSPORT"
						id="travellingWith" onclick="onlyOne(this)">passport
				</div>
				<br>
				<button type="submit" class="registerbtn">Register</button>


			</form>
		</div>
		<hr>
	</div>

</body>
<script type="text/javascript">
	
</script>
</html>
