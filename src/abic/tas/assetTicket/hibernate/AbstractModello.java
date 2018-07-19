package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractModello entity provides the base persistence definition of the Modello entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractModello  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idModello;
     private String descrizione;
     private Set dispositivos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractModello() {
    }

    
    /** full constructor */
    public AbstractModello(String descrizione, Set dispositivos) {
        this.descrizione = descrizione;
        this.dispositivos = dispositivos;
    }

   
    // Property accessors

    public Integer getIdModello() {
        return this.idModello;
    }
    
    public void setIdModello(Integer idModello) {
        this.idModello = idModello;
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