<!Doctype html>
<html>
	<head>
		<link rel="stylesheet" href="style.css"/>
		<title>Login Page</title>
	</head>
	
	<body>
		<div id="main_div">
			<form action="loginHandler" method="post">
				<label for="username">E - mail *</label>
				<br>
				<input type="email" placeholder=" simplilearn@gmail.com" name="email" required />
				<br>
				<label for="password">Password *</label>
				<br>
				<input type="password" placeholder=" simplilearn123" name="password" required />
				<br>
				<input type="submit" value="Login" id="login"/>
			</form>
		</div>
	</body>
</html>