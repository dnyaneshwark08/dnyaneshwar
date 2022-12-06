<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
.container {
	display: flex;
	justify-content: center;
	
}
.form-container{
  background-color: #f1f1f1;

  margin: 10px;
  padding: 20px;
  font-size: 30px;
  border-radius: 5px;
  }

 .reg{
 display: flex;
	justify-content: center;
  font: bold;
  font-size: 40px;
 }
 
</style>
<body>

	<h1 class="reg">REGISTER</h1>

	<div class="container">
		<div class="form-container">
			<form action="register" method="post">

				<input style="border-radius: 10px;"  name="userName" type="text" placeholder="Username"
					required="required"> <br> 
					<input style="border-radius: 10px;" name="password"
					type="password" placeholder="password" required="required">
				<br> 
				<input style="border-radius: 10px;" name="name" type="text" placeholder="name"
					required="required"> 
					<br> 
					<input style="border-radius: 10px;" name="email"
					type="email" placeholder="E-mail" required="required"> 
					<br>
				<input style="border-radius: 10px;" name="contact" type="number" placeholder="contact"
					required="required"> 
					<br> 
					<input style="border-radius: 10px;" name="address"
					type="text" placeholder="address" required="required"> 
					<br>
				<input style="border-radius: 10px;" type="submit">
			</form>
		</div>
	</div>


</body>
</html>