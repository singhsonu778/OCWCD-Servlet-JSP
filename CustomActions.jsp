<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		<h1>
			Hello <c:out value="${requestScope.name}" />.
		</h1>
		<c:forEach var="li" items="${list}"  varStatus="counter" >
			<p>${counter.count}. ${li}</p>
		</c:forEach>
	</body>
</html>