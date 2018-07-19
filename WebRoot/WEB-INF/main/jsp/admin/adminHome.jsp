<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>adminHome.jsp</title>

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
        <html:link action="adminTicketHome">Ticket</html:link> |
        <html:link action="adminAssetHome"> Asset</html:link> |
        <html:link action="adminProgettiHome">Project</html:link> |
        <html:link action="adminServiziHome">Service</html:link> |
        <html:link action="adminFatturazioneHome">Fatturazione</html:link> |
        <html:link action="adminmenu" property="adminUser">Users</html:link> |
        <html:link action="adminmenu" property="adminMenu">Logout</html:link>
  </div>
    <p>Lista dei asset che sono presenti nel nostro database
      <table border="1">
       	<tr>
       		<td>Ubicazione
       		<td>Posizione
       		<td>Owner
       		<td>Riferimento
       		<td>Tipo Utilizzo
       		<td>Utilizzo
       		<td>Categoria
       		<td>macro tipologia
       		<td>tipologia
       		<td>Sotto categoria
       		 		
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
       	<tr>
       	
      </table>
     informanzioni sul dispositivo 
      <table border="1">
      <tr>
      	<td>stato
       	<td>marca
       	<td>id_old
       	<td>Modello
       	<td>ID
       	<td>Seriale
       	<td>etichetta
       	<td>valore listino
       	<td>IP
       	<td>dati_contrattuali
       	<td>ON/OFF
       	<td>Username
       	<td>Password
       	<td>Servizio
       	<td>Payed
       	<td>Migrazione
       	<td>VNX
       	<td>Telecom Asset ID
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
       		<td>
       </tr>  
      </table>
      consumi del dispositivo
      <table border="1">
      	<tr>
      		<td>Consumo Nominale
       		<td>consumo misurato Kwatt
       		<td>Fascia Consumo Opex
       		<td>OPEX
      	</tr>
      	<tr>
      		<td>
      		<td>
      		<td>
      		<td>
      </table>

  </body>
</html:html>
