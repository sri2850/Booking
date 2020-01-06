<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Branch registration</title>
<meta charset="ISO-8859-1">
</head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<body>
	<div class=container>
		<form class="form" action="branchToDb" method="post"
			onsubmit="return validate()">
			<h1>Branch registration</h1>
			<div class="form-group">
				<label for="collegeName">College NAME :: </label> <select
					id="collegeId" name="collegeId">
					<c:forEach items="${collegesList}" var="college">
						<option value="${college.collegeId }">${college.collegeName }</option>
					</c:forEach>
				</select>
			</div>
			<br>
			<div class="form-group">
				<label for="branchName">BRANCH NAME:</label> <input type="text"
					class="form-control" id="branchName" placeholder="enter branchName"
					name="branchName">
			</div>
			<br>
			<div class="form-group">
				<label for="brancg strength">Number Of students in a branch
					:</label> <input type="number" class="form-control" id="totalStrength"
					placeholder="enter the number of students in a branch"
					name="totalStrength">
			</div>
			<br>
			<div class="form-group">
				<label for="hodName">HOD NAME:</label> <input type="text"
					class="form-control" id="hodName" placeholder="enter HOD Name"
					name="hodName">
			</div>
			<br>
			<button type="submit" class="btn">Register Branch</button>
		</form>

	</div>

</body>

</html>