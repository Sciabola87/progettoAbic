package abic.tas.assetTicket.hibernate;



/**
 * Asset entity. @author MyEclipse Persistence Tools
 */
public class Asset extends AbstractAsset implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
    public Asset() {
    }

	/** minimal constructor */
    public Asset(AssetVirtuale assetVirtuale, AssetFisico assetFisico, Integer idTipoAsset) {
        super(assetVirtuale, assetFisico, idTipoAsset);        
    }
    
    /** full constructor */
    public Asset(AssetVirtuale assetVirtuale, AssetFisico assetFisico, Integer idTipoAsset, String descrizione) {
        super(assetVirtuale, assetFisico, idTipoAsset, descrizione);        
    }
   
}
