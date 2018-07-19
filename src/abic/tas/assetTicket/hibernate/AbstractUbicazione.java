package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractUbicazione entity provides the base persistence definition of the Ubicazione entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractUbicazione  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idUbicazione;
     private String descrizione;
     private Set assetFisicos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractUbicazione() {
    }

    
    /** full constructor */
    public AbstractUbicazione(String descrizione, Set assetFisicos) {
        this.descrizione = descrizione;
        this.assetFisicos = assetFisicos;
    }

   
    // Property accessors

    public Integer getIdUbicazione() {
        return this.idUbicazione;
    }
    
    public void setIdUbicazione(Integer idUbicazione) {
        this.idUbicazione = idUbicazione;
    }

    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Set getAssetFisicos() {
        return this.assetFisicos;
    }
    
    public void setAssetFisicos(Set assetFisicos) {
        this.assetFisicos = assetFisicos;
    }
   








}