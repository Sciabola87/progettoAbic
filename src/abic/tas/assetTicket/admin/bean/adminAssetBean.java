package abic.tas.assetTicket.admin.bean;

import java.util.List;

import javax.persistence.Entity;

import abic.tas.assetTicket.hibernate.CategoriaDAO;
import abic.tas.assetTicket.hibernate.ModelloDAO;
import abic.tas.assetTicket.hibernate.PosizioneDAO;
import abic.tas.assetTicket.hibernate.StatoDAO;
import abic.tas.assetTicket.hibernate.TipoUtilizzoDAO;
import abic.tas.assetTicket.hibernate.UbicazioneDAO;



@Entity
public class adminAssetBean{

	private List<String> categoria;
	
	private List<String> posizione;
	
	private List<String> stato;
	
	private List<String> utilizzo;
	
	private List<String> ubicazione;
	
	private List<String> modello;
	
	
	@SuppressWarnings("unchecked")
	public List<String> getStato() {
		StatoDAO stat = new StatoDAO(); 
		stato = stat.findAll() ;
		return stato;
	}

	public void setStato(List<String> stato) {
		this.stato = stato;
	}
	@SuppressWarnings("unchecked")
	public List<String> getPosizione() {
		PosizioneDAO pos = new PosizioneDAO();
		posizione = pos.findAll();
		return posizione;
	}

	public void setPosizione(List<String> posizione) {
		this.posizione = posizione;
	}
	@SuppressWarnings("unchecked")
	public List<String> getCategoria() {
				
		CategoriaDAO cat= new CategoriaDAO();	
		categoria =  cat.findAll();
		return categoria;
	}

	public void setCategoria(List<String> categoria) {
		this.categoria = categoria;
	}
	@SuppressWarnings("unchecked")
	public List<String> getUtilizzo() {
		
		TipoUtilizzoDAO tipoUtilizzo= new TipoUtilizzoDAO();
		utilizzo= tipoUtilizzo.findAll();
		
		return utilizzo;
	}

	public void setUtilizzo(List<String> utilizzo) {
		this.utilizzo = utilizzo;
	}
	@SuppressWarnings("unchecked")
	public List<String> getUbicazione() {
		
		UbicazioneDAO ubic= new UbicazioneDAO();
		ubicazione = ubic.findAll();
		
		return ubicazione;
	}

	public void setUbicazione(List<String> ubicazione) {
		this.ubicazione = ubicazione;
	}

	@SuppressWarnings("unchecked")
	public List<String> getModello() {
		
		ModelloDAO model = new ModelloDAO();
		modello = model.findAll();
		return modello;
	}

	public void setModello(List<String> modello) {
		this.modello = modello;
	}
}
