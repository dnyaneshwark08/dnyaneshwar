<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert</title>
<style>

.head{
	display: flex;
	justify-content: center;
	
}

.head2{
	display: flex;
	justify-content: center;
	
}

</style>
</head>
<body>
<h1 class="head"> you are logged in successfully</h1>
<%
String userName=(String)session.getAttribute("name");
%> <h1 class="head2">Welcome <%=  userName%></h1> 


	<div>
<button  onclick="red"><a href="update">update</a></button>
<button><a href="index">logout</a></button>


</div>
</body>
</html>