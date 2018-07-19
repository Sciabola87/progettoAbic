package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Marca entity. @author MyEclipse Persistence Tools
 */
public class Marca extends AbstractMarca implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Marca() {
    }

    
    /** full constructor */
    public Marca(String descrizione, Set dispositivos) {
        super(descrizione, dispositivos);        
    }
   
}
