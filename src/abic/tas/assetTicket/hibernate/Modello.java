package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Modello entity. @author MyEclipse Persistence Tools
 */
public class Modello extends AbstractModello implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Modello() {
    }

    
    /** full constructor */
    public Modello(String descrizione, Set dispositivos) {
        super(descrizione, dispositivos);        
    }
   
}
