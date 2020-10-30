<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>

</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
		<a class="navbar-brand" href="#" style="color: red">Tutorial</a>

		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">

			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="quest">Question</a></li>
			</ul>

			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<table class="table table-hover">
		<thead>
			<form action="saveCourse" method="post">
				<tr>
					<th>Course-Name:</th>
					<th><input type="text" class="form-control" name="coursename"></th>
				</tr>
				<tr>
					<th></th>
					<th><input type="submit" value="Save Course"></th>
				</tr>
			</form>
		</thead>
	</table>
	<table>
		<thead>
			<tr>
				<th>Course List</th>
				<th><select>
						<option>---Select Course---</option>
						<c:forEach var="cr" items="${clist }">

							<option value="coursename">${cr.coursename }</option>

						</c:forEach>
				</select></th>
			</tr>
		</thead>
	</table>

	<table class="table table-hover">
		<thead>
			<form action="saveQuestion" method="post">
				<tr>
					<th></th>
					<th><select name="coursename">
							<option>---Select Course---</option>
							<c:forEach var="cr" items="${clist }">

								<option value="${cr.coursename }">${cr.coursename }</option>

							</c:forEach>
					</select></th>
				</tr>
				<tr>
					<th></th>
					<th><input type="hidden" name="id"></th>
				</tr>
				<tr>
					<th>Question:</th>
					<th><input type="text" class="form-control" name="questionname"></th>
				</tr>
				<tr>
					<th>Option 1:</th>
					<th><input type="text" class="form-control" name="answerlist"></th>
				</tr>
				<tr>
					<th>Option 2:</th>
					<th><input type="text" class="form-control" name="answerlist1"></th>
				</tr>
				<tr>
					<th>Correct Option:</th>
					<th><input type="text" class="form-control" name="correctopt"></th>
				</tr>
				<tr>
					<th></th>
					<th><input type="submit" value="Save Question"></th>
				</tr>
			</form>
		</thead>
	</table>
	<table>
</body>
</html>