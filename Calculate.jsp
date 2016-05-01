<%@ page errorPage="errorPages/ArithmeticError.jsp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		
		<c:set var="a" value="${param.a}"/>
		<c:set var="b" value="${param.b}"/>
		${param.a} mod ${param.b} is ${a mod b}
	
	</body>
</html>