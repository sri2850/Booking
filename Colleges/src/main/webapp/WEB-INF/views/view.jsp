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
	<div>
		<form action="getBranches" method="get">

			<h1>College registration</h1>
			<div class="form-group">
				<label for="collegeName"> Select College NAME :: </label> <select
					name="collegeId" id="collegeId">
					<c:forEach items="${collegesList}" var="college">
						<option value="${college.collegeId }">${college.collegeName }</option>
					</c:forEach>
				</select>
			</div>
			<br>
			<button type="submit">Get Branches</button>
		</form>
	</div>

	<form action="update">
		<table border="1">
			<tr>
				<th>Branch Id</th>
				<th>Branch Name</th>
				<th>total Strength</th>
				<th>HOD Name</th>
				<th>UPDATE</th>
			</tr>
			<c:forEach items="${branches}" var="brns">
				<tr>
					<td id="${college.collegeId }">${brns.branchId }</td>
					<td id="${college.collegeId }">${brns.branchName}</td>
					<td id="${college.collegeId }">${brns.totalStrength}</td>
					<td id="${college.collegeId }">${brns.hodName }</td>
					<%-- <td><a href="update/${brns.branchId }">Update</a></td> --%>
					<td>
						<button type="submit" value="${brns.branchId }" name="branchId">Update</button>
					</td>
				</tr>
			</c:forEach>
		</table>
	</form>
	<p>Total count: ${total}</p>
</body>
</html>
