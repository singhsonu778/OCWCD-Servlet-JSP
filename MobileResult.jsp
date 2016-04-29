<%@ page import="java.util.*"%>
<html>
	<head>
		<title>Mobile App</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		<h1>Mobile Selection Advice From JSP</h1>
		<%
			List<String> list = (List<String>) request.getAttribute("list");
			for (String li : list) {
				out.print("<br/>try: " + li);
			}
			out.println("<br/><br/>Admin Name : " + request.getAttribute("name"));
			out.println("<br/>Email add : " + request.getAttribute("email"));
			out.println("<br/>App Name : " + request.getAttribute("app"));
			out.println("<br/>Mobile os: " + application.getAttribute("mobile"));
		%>
	</body>
</html>