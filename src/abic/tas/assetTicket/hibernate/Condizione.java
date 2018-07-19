package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Condizione entity. @author MyEclipse Persistence Tools
 */
public class Condizione extends AbstractCondizione implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Condizione() {
    }

    
    /** full constructor */
    public Condizione(String descrizione, Set dispositivos) {
        super(descrizione, dispositivos);        
    }
   
}
