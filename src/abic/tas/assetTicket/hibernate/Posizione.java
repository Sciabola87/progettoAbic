package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Posizione entity. @author MyEclipse Persistence Tools
 */
public class Posizione extends AbstractPosizione implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Posizione() {
    }

    
    /** full constructor */
    public Posizione(String descrizione, Set assetFisicos) {
        super(descrizione, assetFisicos);        
    }
   
}
