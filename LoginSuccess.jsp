<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		<%
			String userName = null;
			Cookie[] cookies = request.getCookies();
			if (cookies != null) {
				for (Cookie cookie : cookies) {
					if (cookie.getName().equals("user"))
						userName = cookie.getValue();
				}
			}
			if (userName == null)
				response.sendRedirect("login.html");
		%>
		<h3>Hi <%=userName%>, Login successful.</h3>
		<form action="logout" method="POST">
			<input type="submit" value="Logout">
		</form>
	</body>
</html>