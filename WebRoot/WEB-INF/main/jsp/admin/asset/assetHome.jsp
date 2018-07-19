<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>assetHome.jsp</title>

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
    informazioni sui asset che sono presenti nel sistema
    
    <div align="center">
    	ASSET FISICI
    </div>
    <table border="1">
    	<tr>
    		<td>
    		<td>
    	</tr>
    </table>
    <br>
    <br>
    <br>
    
    <div align="center">
    	ASSET VIRTUALI
    </div>
    <br>
    <br>
    <table border="1">
    	<tr>
    		<td>Virtual Center
    		<td>Host Fisico
    		<td>HW ABIC
    		<td>Virtual Machine
    		<td>Category
    		<td>Payed
    		<td>Prezzo
    		<td>Stato
    		<td>CPU
    		<td>RAM (MB)
    		<td>STORAGE (GB)
    		<td>Classe
    		<td>Referente
    		<td>Tipologia
    		<td>Descrizione
    		<td>Marketing
    		<td>Stato (ON/OFF)
    		<td>Username
    		<td>Password
    		<td>Note
    		<td>Dta Creazione
    	</tr>
    	<tr>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>		
    </table>
    <br>
    <br>
    <br>
    
    <div align="center">
    	ASSET VIRTUALE POMEZIA
    </div>
    <br>
    <br>
    <table>
    	<tr>
    		<td>Ubicazione
    		<td>IP
    		<td>Etichetta
    		<td>ID Telecom
    		<td>Seriale
    		<td>Modello
    		<td>Owner
    		<td>Utilizzo
    		<td>Note
    	</tr>
    	<tr>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    		<td>
    </table>
  </body>
</html:html>
