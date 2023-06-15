<html>
<head>
<title>Login Page</title>
</head>
<body>
	<%-- Welcome to Login Page ${name}! --%>
	<!-- here it is mapped to url input what we give by using ModelMap.put  -->
	<div class="container">
		<h1>Login</h1>
		<pre>${errorMessage}</pre>
		<form method="post">
			Name :<input type="text" placeholder="Enter Username" name="name">
			Password :<input type="password" placeholder="Enter Password"
				name="password">
			<button type="submit">Login</button>
		</form>
	</div>

</body>
</html>