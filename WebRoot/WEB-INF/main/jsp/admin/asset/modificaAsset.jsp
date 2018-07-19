<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>modificaAsset.jsp</title>

	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <div align="right">
        <html:link action="adminHome" >Home</html:link>|
        <html:link action="adminCreaAsset">Crea Asset</html:link> |
        <html:link action="adminModificaAsset">Modifica Asset</html:link> |
        <html:link action="adminVisualizzaAsset">Visualizza Asset</html:link> |
        <html:link action="adminCancellaAsset">Cancella Asset</html:link> |
        <html:link action="">Logout</html:link>
  </div>
     MODIFICA<br>
  </body>
</html:html>
