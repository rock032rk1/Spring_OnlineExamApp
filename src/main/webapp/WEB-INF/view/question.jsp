<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
	
	 <!--  <script type="text/javascript" src="/OnlineExamApplicationApp/resources/js/add.js"></script> --> 
	 <!--  <script type="text/javascript" src="resources/js/timer.js"></script>  -->

</head>
<body>

  <script type="text/javascript">
           $(document).ready(function(){
        	
        		   var java=$('#jv').text();
        		   var sub=$('#sb').text();
        		   
        		  
        			   
        			   if(java==""){
        				   
        				   $('#pagi').hide();
            			   $('#pagi1').hide();
            			   $('#pagi2').hide();
        			   }
        		   
        		   if(sub!=""){
        			   $('#sb').click(function(){
        				   $('#quelist').show();
        			   });
        		   }
        		 
           });
  </script>
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
				<li class="nav-item active"><a class="nav-link" href="/OnlineExamApplicationApp/index">Home
						<span class="sr-only">(current)</span>
				</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Login</a></li>
				<li class="nav-item"><a class="nav-link" href="#">Question</a></li>
			</ul>

			<form class="form-inline my-2 my-lg-0">
				<input class="form-control mr-sm-2" type="search"
					placeholder="Search" aria-label="Search">
				<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
			</form>
		</div>
	</nav>

	<div class="container">
		<div class="row">
			<div class="col-sm-3">
				<table>
				 <form action="selectcourse" post="post">
				   <thead>
						<tr>
							<th>Course List</th>
							<th><select name="coursename">
									<option>---Select Course---</option>
									<c:forEach var="cr" items="${clist }">

										<option value="${cr.coursename }" id="jv">${cr.coursename }</option>

									</c:forEach>
							</select></th>
						</tr>
					</thead>
					<button type="submit" class="btn btn-primary" id="sb">Submit</button>
				 </form>	
				</table>
			</div>
			<div class="col-sm-9" id="quelist">
			 <div id="countdown" style="margin-top:50px;"></div>
              <p id="note" style="text-align:center;"></p>
			  <table class="table table-hover">
			    <c:forEach var="stu" items="${obj }">
			    <tr>
			      <th>Question:</th>
			      <th>${stu[0] }</th>
			    </tr>
			    <tr>
			      <th>Option 1</th>
			      <th><input type="radio" name="correctopt" value="">${stu[1] }</th>
			    </tr>
			    <tr>
			      <th>Option 2</th>
			      <th><input type="radio" name="correctopt" value="">${stu[2] }</th>
			    </tr>
			   </c:forEach>  
			  </table>
			   <br/>    
   <a id="pagi" href="/OnlineExamApplicationApp/question1/1">1</a>     
   <a id="pagi1" href="/OnlineExamApplicationApp/question1/2">2</a>     
   <a id="pagi2" href="/OnlineExamApplicationApp/question1/3">3</a>    
			</div>
		</div>
	</div>

</body>
</html>