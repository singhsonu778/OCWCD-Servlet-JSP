<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		
		<!-- set value in bean -->
		<jsp:useBean id="person" type="com.sonu.domain.Person" 
					 class="com.sonu.domain.Employee" scope="request"/>
		<jsp:setProperty property="id" value="<%= request.getParameter(\"id\") %>" name="person"/>
		<jsp:setProperty property="name" value="<%= request.getParameter(\"name\") %>" name="person"/>
		<jsp:setProperty property="job" value="<%= request.getParameter(\"job\") %>" name="person"/>				 
		
		<!-- get value from bean -->
		Employee details :<br/>
		Id : <jsp:getProperty property="id" name="person"/><br/>
		Name : <jsp:getProperty property="name" name="person"/><br/>
		Job : <jsp:getProperty property="job" name="person"/><br/>
		
	</body>
</html>