package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Stato entity. @author MyEclipse Persistence Tools
 */
public class Stato extends AbstractStato implements java.io.Serializable {

    // Constructors

    /**
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Stato() {
    }

    
    /** full constructor */
    public Stato(String descrizione, Set dispositivos, Set assetVirtuales) {
        super(descrizione, dispositivos, assetVirtuales);        
    }
   
}
