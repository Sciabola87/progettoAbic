package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractMarca entity provides the base persistence definition of the Marca entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractMarca  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idMarca;
     private String descrizione;
     private Set dispositivos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractMarca() {
    }

    
    /** full constructor */
    public AbstractMarca(String descrizione, Set dispositivos) {
        this.descrizione = descrizione;
        this.dispositivos = dispositivos;
    }

   
    // Property accessors

    public Integer getIdMarca() {
        return this.idMarca;
    }
    
    public void setIdMarca(Integer idMarca) {
        this.idMarca = idMarca;
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