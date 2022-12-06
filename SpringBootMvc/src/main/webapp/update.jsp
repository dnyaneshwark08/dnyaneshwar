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

</style>

</head>
<body>
<div class="head">
<form class="update-form" action="update" method="post" >
	   
	   <br>
	   <br>
		<input autofocus="autofocus" name="userName" type="text" placeholder="Username" required="required"> 
		<br>
		<br>
		<input name="email" type="email" placeholder="E-mail">
		<br>
		<br>
		<input name="contact" type="text" placeholder="contact">
		<br>
		<br>
		<input name="address" type="text" placeholder="address"> 
		<br>
		<br>
		<button  type="submit">submit</button>
	</form>
	</div>
</body>
</html>