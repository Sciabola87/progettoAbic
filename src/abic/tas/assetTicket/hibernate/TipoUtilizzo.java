package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * TipoUtilizzo entity. @author MyEclipse Persistence Tools
 */
public class TipoUtilizzo extends AbstractTipoUtilizzo implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public TipoUtilizzo() {
    }

    
    /** full constructor */
    public TipoUtilizzo(String descrizione, Set assetFisicos) {
        super(descrizione, assetFisicos);        
    }
   
}
