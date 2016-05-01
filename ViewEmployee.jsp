<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
	
		<!-- set value in bean -->
		<jsp:useBean id="person" type="com.sonu.domain.Person"
			class="com.sonu.domain.Employee" scope="request" />
	
		<c:set target="${person}" property="id" value="${param.id}" />
		<c:set target="${person}" property="name" value="${param.name}" />
		<c:set target="${person}" property="job" value="${param.job}" />
	
		<!-- get value from bean -->
		Employee details :<br /> 
		Id : <c:out value="${person.id}" /><br /> 
		Name : <c:out value="${person.name}" /><br /> 
		Job : <c:out value="${person.job}" /><br />
	
	</body>
</html>