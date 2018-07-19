package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractStato entity provides the base persistence definition of the Stato entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractStato  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idStato;
     private String descrizione;
     private Set dispositivos = new HashSet(0);
     private Set assetVirtuales = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractStato() {
    }

    
    /** full constructor */
    public AbstractStato(String descrizione, Set dispositivos, Set assetVirtuales) {
        this.descrizione = descrizione;
        this.dispositivos = dispositivos;
        this.assetVirtuales = assetVirtuales;
    }

   
    // Property accessors

    public Integer getIdStato() {
        return this.idStato;
    }
    
    public void setIdStato(Integer idStato) {
        this.idStato = idStato;
    }

    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Set getDispositivos() {
        return this.dispositivos;
    }
    
    public void setDispositivos(Set dispositivos) {
        this.dispositivos = dispositivos;
    }

    public Set getAssetVirtuales() {
        return this.assetVirtuales;
    }
    
    public void setAssetVirtuales(Set assetVirtuales) {
        this.assetVirtuales = assetVirtuales;
    }
   








}