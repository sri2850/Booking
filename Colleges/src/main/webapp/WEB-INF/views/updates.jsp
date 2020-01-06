<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Internal info</title>
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
		<h1>Update count form</h1>
		<form action="updateCount" method="post">
			<div class="form-group">
				<label for=totalStrength>Total Strength:</label> <input type="tel"
					class="form-control" id="totalStrength"
					value="${branch.totalStrength}" name="totalStrength" required>
			</div>
			<br>
			<button class="btn btn-primary">update</button>
		</form>
	</div>
</body>
</html>