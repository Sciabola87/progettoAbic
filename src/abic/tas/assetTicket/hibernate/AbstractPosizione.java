package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractPosizione entity provides the base persistence definition of the Posizione entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractPosizione  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idPosizione;
     private String descrizione;
     private Set assetFisicos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractPosizione() {
    }

    
    /** full constructor */
    public AbstractPosizione(String descrizione, Set assetFisicos) {
        this.descrizione = descrizione;
        this.assetFisicos = assetFisicos;
    }

   
    // Property accessors

    public Integer getIdPosizione() {
        return this.idPosizione;
    }
    
    public void setIdPosizione(Integer idPosizione) {
        this.idPosizione = idPosizione;
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