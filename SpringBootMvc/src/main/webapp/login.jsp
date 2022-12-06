<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

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
<h1 class="head">Login</h1>
	<%
	String msg = (String) request.getParameter("errormsg");
	if (msg != null) {
	%>
	<h4 class="head2"><%=msg%></h4>
	<%
	}
	%>

	<c:if test="${erormsg} ">
		<p class="error">${errormsg }</p>
	</c:if>

<div class="head3">
	 <form action="login" method="post">
	 
		<input name="userName" type="text" placeholder="userName"
			required="required"> <input name="password" type="password"
			placeholder="password" required="required"> <input
			type="submit">
	</form> 
	</div>
	
</body>
</html>