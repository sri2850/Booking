<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Register college</title>
<meta charset="ISO-8859-1">
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>

<body>
	<div class="container">
		<form class="form" action="/collegeToDb" method="get"
			onsubmit="return validate()">
			<h1>College registration</h1>
			<div class="form-group">
				<label for="college Name">COLLEGE NAME :</label> <input type="text"
					class="form-control" id="collegeName"
					placeholder="enter college name" name="collegeName">
			</div>
			<br>
			<div class="form-group">
				<label for="collegeLocation">COLLEGE LOCATION :</label> <input
					type="text" class="form-control" id="collegeLocation"
					placeholder="enter college location" name="collegeLocation">
			</div>
			<br>
			<div class="form-group">
				<label for="number of branches">Number Of Branches :</label> <input
					type="number" class="form-control" id="noOfBranches"
					placeholder="enter the number of branches" name="noOfBranches">
			</div>
			<br>
			<button type="submit" class="btn">Register</button>
		</form>
	</div>

</body>
</html>