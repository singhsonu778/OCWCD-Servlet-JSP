<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="mine" uri="customTags" %>
<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		<c:set var="userName" value="Sonu"/>
		Dice value is ${mine:rollIt()}<br/>	
		<mine:advice user="${userName}" />	
	</body>
</html>