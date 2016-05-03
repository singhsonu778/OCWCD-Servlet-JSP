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
		<mine:mySimpleTag names="${requestScope.names}">
			<p>${name}</p>
		</mine:mySimpleTag>
	</body>
</html>