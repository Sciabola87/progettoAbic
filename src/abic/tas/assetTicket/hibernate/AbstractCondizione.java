package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractCondizione entity provides the base persistence definition of the Condizione entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCondizione  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCondizione;
     private String descrizione;
     private Set dispositivos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractCondizione() {
    }

    
    /** full constructor */
    public AbstractCondizione(String descrizione, Set dispositivos) {
        this.descrizione = descrizione;
        this.dispositivos = dispositivos;
    }

   
    // Property accessors

    public Integer getIdCondizione() {
        return this.idCondizione;
    }
    
    public void setIdCondizione(Integer idCondizione) {
        this.idCondizione = idCondizione;
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
   








}