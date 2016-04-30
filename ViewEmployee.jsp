<html>
	<head>
		<title>OCWCD</title>
		<link href="favicon.ico" rel="icon" type="image/x-icon" />
	</head>
	<body>
		
		<!-- set value in bean -->
		<jsp:useBean id="person" type="com.sonu.domain.Person" 
					 class="com.sonu.domain.Employee" scope="request"/>
		<jsp:setProperty property="*" name="person"/>			 
		
		<!-- get value from bean -->
		Employee details :<br/>
		Id : ${person.id}<br/>
		Name : ${person.name}<br/>
		Job : ${person.job}<br/>
		
		<br/>Displaying parameters values using EL : <br/>
		${param.id}, ${param.name}, ${param.job}, ${header.host}, ${initParam.email}
		
	</body>
</html>