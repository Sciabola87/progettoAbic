package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Ubicazione entity. @author MyEclipse Persistence Tools
 */
public class Ubicazione extends AbstractUbicazione implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Ubicazione() {
    }

    
    /** full constructor */
    public Ubicazione(String descrizione, Set assetFisicos) {
        super(descrizione, assetFisicos);        
    }
   
}
