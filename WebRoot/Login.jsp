<%@ page language="java" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%> 
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html"%>
 
 
 
<html:html> 
	<head>
		<title>JSP for LoginForm form</title>
	</head>
	<body>
	<div  align="center"><h2>LOGIN
	</h2></div>
	<div align="center">
	
		<html:form action="/login" >
		
			userName : <html:text property="userName"/><html:errors property="userName"/><br/>
			password : <html:password property="password"/><html:errors property="password"/><br/>
			<html:submit /><html:cancel/>
		</html:form>
		</div>
	</body>
</html:html>

