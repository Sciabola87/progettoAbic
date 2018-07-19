<%@ page language="java" pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://struts.apache.org/tags-bean" prefix="bean" %>
<%@ taglib uri="http://struts.apache.org/tags-html" prefix="html" %>
<%@ taglib uri="http://struts.apache.org/tags-logic" prefix="logic" %>
<%@ taglib uri="http://struts.apache.org/tags-tiles" prefix="tiles" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/xml"  prefix="x"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html:html>
  <head>
    
    <title>Creare nuovo Asset</title>


  </head>
    <body>
    
    <jsp:useBean id="caricaAsset" class="abic.tas.assetTicket.admin.bean.adminAssetBean"   scope="session" />

    
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

    <p align="center">Inserimento di un nuovo asset nella nostra tabella <br>
   <html:form action="/inserisciAsset">

    <table>
    	<tr>
    		<td>
    			<div>
    				<p align="center">
    					Inserimento informazioni relative all'asset</p>
    					<table>
    						<tr>
    							<td>Tipo Asset
    							<td>
    							
    						</tr>
    						<tr>
    							<td>Ubicazione
    							<td>
    								
									<html:select name="caricaAsset" property="ubicazione" value="${caricaAsset.ubicazione}">
										<html:option value=""></html:option>
   										<c:forEach var="ubicazione" items="${caricaAsset.ubicazione}">
											<html:option value="${ubicazione.idUbicazione}">${ubicazione.descrizione}</html:option>
										</c:forEach>
									</html:select>
								<td>Inserimento nuova Ubicazione <html:button property="ubicazione_asset">Ubicazione</html:button>
    						</tr>
    						<tr>
    							<td>Posizione
    							<td>
    								
    								<html:select name="caricaAsset" property="posizione" value="${caricaAsset.posizione}">
    									<html:option value=""></html:option>
   										<c:forEach var="posizione" items="${caricaAsset.posizione}">
										<html:option value="${posizione.idPosizione}">${posizione.descrizione}</html:option>
										</c:forEach>
									</html:select>
								<td>Inserimento nuova Posizione <html:button property="posizione">Posizione</html:button>
    						</tr>
    					</table>		
    			</div>
    		</td>
    		<tr>
    			<p align="center"> informazione sulla utilizzo del dispositivo</p>
    				<table width="300" height="200">
   						<tr>
   							<td width="200" >Tipo Utilizzo
   							<td width="200" >
   								<html:select name="caricaAsset" property="utilizzo" value="${caricaAsset.utilizzo}">
   									<html:option value=""></html:option>
	   								<c:forEach var="utilizzo" items="${caricaAsset.utilizzo}">
										<html:option value="${utilizzo.idTipoUtilizzo}">${utilizzo.descrizione}</html:option>
									</c:forEach>
								</html:select>
							<td width="500" >Inserimento nuova Tipo Utilizzo <html:button property="tipoUtilizzo">Tipo Utilizzo</html:button>
   						</tr>
   						<tr>
   							<td>Utilizzo
   							<td>
   								<html:select name="caricaAsset" property="utilizzo" value="${caricaAsset.utilizzo}">
   									<html:option value=""></html:option>
	   								<c:forEach var="utilizzo" items="${caricaAsset.utilizzo}">
										<html:option value="${utilizzo.idTipoUtilizzo}">${utilizzo.descrizione}</html:option>
									</c:forEach>
								</html:select>
   							
   						</tr>
   						<tr>
   							<td>Categoria
   							<td>
   								<html:select name="caricaAsset" property="categoria" value="${caricaAsset.categoria}"> 
   									<html:option value=""></html:option>
	   								<c:forEach var="categoria" items="${caricaAsset.categoria}">
										<html:option value="${categoria.idCategoria}">${categoria.descrizione}</html:option>
									</c:forEach>
								</html:select>
   						</tr>
   						<tr>
   							<td>macro tipologia
   							
   							<td>
   								<html:select name="caricaAsset" property="macrotipologia" value="${caricaAsset.categoria}">
   									<html:option value=""></html:option>
	   								<c:forEach var="categoria" items="${caricaAsset.categoria}">
										<html:option value="${categoria.idCategoria}">${categoria.descrizione}</html:option>
									</c:forEach>
								</html:select>
   						</tr>
   						<tr>
   							<td>tipologia
   							<td>
   								<html:select name="caricaAsset" property="tipologia" value="${caricaAsset.categoria}">
   									<html:option value=""></html:option>
	   								<c:forEach var="categoria" items="${caricaAsset.categoria}">
										<html:option value="${categoria.idCategoria}">${categoria.descrizione}</html:option>
									</c:forEach>
								</html:select>
   						</tr>
   						<tr>
   							<td>Sotto categoria
   							<td>
   								
   								<html:select name="caricaAsset" property="categoria" value="${caricaAsset.categoria}">
   									<html:option value=""></html:option>
	   								<c:forEach var="categoria" items="${caricaAsset.categoria}">
										<html:option value="${categoria.idCategoria}">${categoria.descrizione}</html:option>
									</c:forEach>
								</html:select>
								
   						</tr>
   						<tr>
   							<td >Inserimento nuova Categoria/Tipologia <html:button property="categoriaTipologia">Categoria/Tipologia</html:button>
   						</tr>
    				</table>					
			</tr>
    </table>
  	<table>
    	<tr>
    			<p align="center" > Informazione sul Dispositivo </p>
    				<table>
    					<tr>
    						<td>stato
    						<td>
    							
								<html:select name="caricaAsset" property="stato" value="${caricaAsset.stato}">
									<html:option value=""></html:option>
   									<c:forEach var="stato" items="${caricaAsset.stato}">
										<html:option value="${stato.idStato}">${stato.descrizione}</html:option>
									</c:forEach>
								</html:select>
								
								<td width="500">Inserimento nuova Stato <html:button property="stato" onclick="">Stato</html:button>
    					</tr>
    					<tr>
    						<td width="200">marca</td>
    					<td width="200"><html:text property="marca"/><html:errors property="marca"/><br/></td>
    					</tr>
    					<tr>
    						<td >id_old
    						<td><html:text property="id_old"/><html:errors property="id_old"/><br/>
    					</tr>
    					<tr>
    						<td>Modello
    						<td>
    						<html:select name="caricaAsset" property="modello" value="${caricaAsset.modello}">
    							<html:option value=""></html:option>
   									<c:forEach var="modello" items="${caricaAsset.modello}">
										<html:option value="${modello.idModello}">${modello.descrizione}</html:option>
									</c:forEach>
								</html:select>
    					</tr>
    					<tr>
    						<td>ID
    						<td><html:text property="id"/><html:errors property="id"/><br/>
    					</tr>
    					<tr>
    						<td>Seriale
    						<td><html:text property="seriale"/><html:errors property="seriale"/><br/>
    					</tr>
    					<tr>
    						<td>etichetta
    						<td><html:text property="etichetta"/><html:errors property="etichetta"/><br/>
    					</tr> 
    					<tr>
    						<td>valore listino
    						<td><html:text property="valore_listino"/><html:errors property="valore_listino"/><br/>
    					</tr>  
    			</table> 
    		</tr>
    		<tr>
    				<p> consumi Dispositivo</p>
    					<table>
    						<tr> 
    							<td>Consumo Nominale
    							<td><html:text property="consumo_nominale"/><html:errors property="consumo_nominale"/><br/>
    						</tr>
    						<tr> 
    							<td>consumo misurato Kwatt
    							<td><html:text property="consumo_misurato"/><html:errors property="consumo_misurato"/><br/>
    						</tr>
    						<tr> 
    							<td>Fascia Consumo Opex
    							<td><html:text property="fascia_consumo_opex"/><html:errors property="fascia_consumo_opex"/><br/>
    						</tr>
    						<tr> 
    							<td>OPEX
    							<td><html:text property="opex"/><html:errors property="opex"/><br/>
    						</tr>
    					</table>
    		</tr>	
    		<tr>
    			<p> Dati Generali</p>
    				<table>
    					<tr>
    						<td>IP
    						<td><html:text property="ip"/><html:errors property="ip"/><br/>
    					</tr>
    					<tr>
    						<td>dati_contrattuali
    						<td><html:textarea property="dati_contrattuali"/><html:errors property="dati_contrattuali"/><br/>
    					</tr>
    					<tr>
    						<td>ON/OFF
    						<td>ON<html:radio property="on_off" value="on"/><html:errors property="on_off"/>
    						OFF<html:radio property="on_off" value="off"/><html:errors property="on_off"/>
    					</tr>
    					<tr>
    						<td>Username
    						<td><html:text property="username"/><html:errors property="username"/><br/>
    					</tr>
    					<tr>
    						<td>Password
    						<td><html:text property="password"/><html:errors property="password"/><br/>
    					</tr>
    					
    					<tr>
    						<td>Servizio
    						<td><html:text property="servizio"/><html:errors property="servizio"/><br/>
    					</tr>	
    					<tr>
    						<td>Payed
    						<td><html:text property="payed"/><html:errors property="payed"/><br/>
    					</tr>
    					<tr>
    						<td>Migrazione
    						<td><html:text property="migrazione"/><html:errors property="migrazione"/><br/>
    					</tr>
    					<tr>
    						<td>VNX
    						<td><html:text property="vnx"/><html:errors property="vnx"/><br/>
    					</tr>
    					<tr>
    						<td>Telecom Asset ID
    						<td><html:text property="telecom_asset_id"/><html:errors property="telecom_asset_id"/><br/>
    					</tr>
    				</table>
    		</tr>
    							
  </table>
  <html:submit /><html:cancel/>
  </html:form> 
  </body>
</html:html>
