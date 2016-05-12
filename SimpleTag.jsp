<%@ taglib prefix="mine" uri="simpleTags" %>
<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		<%
			String[] names = {"Sonu", "Gaurav", "Madhuri"};
			request.setAttribute("names", names);
		%>
		<p>Before throwing an exception</p>
		<mine:mySimpleTag names="${requestScope.names}">
			<p>${name}</p>
		</mine:mySimpleTag>
		<p>After throwing an exception which will not get printed</p>
	</body>
</html>