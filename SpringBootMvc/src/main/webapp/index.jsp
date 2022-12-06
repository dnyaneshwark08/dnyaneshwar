<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Index Page</title>
<style>

.head{
	display: flex;
	justify-content: center;
	
}
.head2{
	display: flex;
	justify-content: center;
	
}
.head3{
	display: flex;
	justify-content: center;
	
}
</style>


</head>
<body>
<h1 class="head">welcome</h1>

<%
	String message = (String) request.getParameter("message");
	if (message != null) {
	%>
	<h4 class="head2"><%= message%></h4>
	<%
	}
	%>


<div class="head3">
<button ><a  href="login">login</a></button>
<button><a  href="register">register</a></button> 
</div>
</body>
</html>