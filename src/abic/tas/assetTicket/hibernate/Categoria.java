package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Categoria entity. @author MyEclipse Persistence Tools
 */
public class Categoria extends AbstractCategoria implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Categoria() {
    }

    
    /** full constructor */
    public Categoria(String descrizione, Set assetVirtualesForIdTipologia, Set assetFisicosForIdCategoria, Set assetVirtualesForIdCategoria, Set assetFisicosForIdMacroTipologia, Set assetFisicosForIdSottoCategoria, Set assetFisicosForIdTipologia) {
        super(descrizione, assetVirtualesForIdTipologia, assetFisicosForIdCategoria, assetVirtualesForIdCategoria, assetFisicosForIdMacroTipologia, assetFisicosForIdSottoCategoria, assetFisicosForIdTipologia);        
    }
   
}
