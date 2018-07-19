package abic.tas.assetTicket.hibernate;

import java.sql.Timestamp;
import java.util.Set;


/**
 * AssetVirtuale entity. @author MyEclipse Persistence Tools
 */
public class AssetVirtuale extends AbstractAssetVirtuale implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
    public AssetVirtuale() {
    }

	/** minimal constructor */
    public AssetVirtuale(Categoria categoriaByIdCategoria, Categoria categoriaByIdTipologia, String virtualCenter, String hostFisico, String hwAbic, Integer idReferente, Timestamp dataCreazione, Timestamp dataFine) {
        super(categoriaByIdCategoria, categoriaByIdTipologia, virtualCenter, hostFisico, hwAbic, idReferente, dataCreazione, dataFine);        
    }
    
    /** full constructor */
    public AssetVirtuale(Categoria categoriaByIdCategoria, Categoria categoriaByIdTipologia, Stato stato, String virtualCenter, String hostFisico, String hwAbic, Integer payed, Integer prezzo, Integer idStato, Integer cpu, Integer ram, String classe, Integer idReferente, String descrizione, String marcketing, String username, String password, String note, Timestamp dataCreazione, Timestamp dataFine, Set assets) {
        super(categoriaByIdCategoria, categoriaByIdTipologia, stato, virtualCenter, hostFisico, hwAbic, payed, prezzo, idStato, cpu, ram, classe, idReferente, descrizione, marcketing, username, password, note, dataCreazione, dataFine, assets);        
    }
   
}
