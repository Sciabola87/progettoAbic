<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html lang="true">
  <head>
    <html:base />
    
    <title>newAsset.jsp</title>

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
    <p align="center">Inserimento di un nuovo asset nella nostra tabella <br>
    
    <table>
    	<tr>
    		<td>
    			<div>
    				<p align="center">
    					Inserimento informazioni relative all'asset</p>
    					<table width="200" height="200">
    						<tr>
    							<td width="200" >Proprietà
    							<td width="200" ><html:text property="proprieta_asset"/><html:errors property="proprieta_asset"/><br/>
    						</tr>
    						<tr>
    							<td>Ubicazione
    							<td><html:text property="ubicazione_asset"/><html:errors property="ubicazione_aasset"/><br/>
    						</tr>
    						<tr>
    							<td>Posizione
    							<td><html:text property="posizione_asset"/><html:errors property="posizione_asset"/><br/>
    						</tr>
    					</table>		
    			</div>
    		</td>
    		<td>
    			<p align="center"> informazione sulla utilizzo del dispositivo</p>
    				<table width="300" height="200">
   						<tr>
   							<td width="200" >Tipo Utilizzo
   							<td width="200" ><html:text property="tipo_utilizzo_asset"/><html:errors property="tipo_utilizzo_asset"/><br/>
   						</tr>
   						<tr>
   							<td>Utilizzo
   							<td><html:text property="utilizzo_asset"/><html:errors property="utilizzo_asset"/><br/>
   						</tr>
   						<tr>
   							<td>Categoria
   							<td><html:text property="categoria_asset"/><html:errors property="categoria_asset"/><br/>
   						</tr>
   						<tr>
   							<td>macro tipologia
   							<td><html:text property="macro_tipologia_asset"/><html:errors property="macro_tipologia_asset"/><br/>
   						</tr>
   						<tr>
   							<td>tipologia
   							<td><html:text property="tipologia_asset"/><html:errors property="tipologia_asset"/><br/>
   						</tr>
   						<tr>
   							<td>Sotto categoria
   							<td><html:text property="sotto_categoria_asset"/><html:errors property="sotto_categoria_asset"/><br/>
   						</tr>
    				</table>					
			</td>
    	</tr>
    </table>
  	<table>
    	<tr>
    			<p align="center" > Informazione sul Dispositivo </p>
    				<table>
    					<tr>
    						<td>stato
    						<td><html:text property="stato_asset"/><html:errors property="stato_asset"/><br/></td>
    					</tr>
    					<tr>
    						<td width="200">marca</td>
    					<td width="200"><html:text property="marca_asset"/><html:errors property="marca_asset"/><br/></td>
    					</tr>
    					<tr>
    						<td >id_old
    						<td><html:text property="id_old_asset"/><html:errors property="id_old_asset"/><br/>
    					</tr>
    					<tr>
    						<td>Modello
    						<td><html:text property="modello_asset"/><html:errors property="modello_asset"/><br/>
    					</tr>
    					<tr>
    						<td>ID
    						<td><html:text property="id_asset"/><html:errors property="id_asset"/><br/>
    					</tr>
    					<tr>
    						<td>Seriale
    						<td><html:text property="seriale_asset"/><html:errors property="seriale_asset"/><br/>
    					</tr>
    					<tr>
    						<td>etichetta
    						<td><html:text property="etichetta_asset"/><html:errors property="etichetta_asset"/><br/>
    					</tr>   
    			</table> 
    		</tr>
    		<tr>
    				<p> consumi Dispositivo</p>
    					<table>
    						<tr> 
    							<td>
    							<td>
    					</table>
    		</tr>				
  </table>
  </body>
</html:html>
