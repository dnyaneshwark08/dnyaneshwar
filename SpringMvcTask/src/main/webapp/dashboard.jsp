<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color:purple">
<h1> you are logged in successfully</h1>
<%
String username=(String)session.getAttribute("email");
%> <h1>Welcome <%=  username%></h1> 
</body>
</html>