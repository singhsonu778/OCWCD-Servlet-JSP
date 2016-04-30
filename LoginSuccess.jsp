<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		<%
			String user = null;
			if (session.getAttribute("user") == null) {
				response.sendRedirect("login.html");
			} else
				user = (String) session.getAttribute("user");
		%>
		<h3>Hi <%=user%>, Login successful.</h3>
		<form action="logout" method="POST">
			<input type="submit" value="Logout">
		</form>
	</body>
</html>