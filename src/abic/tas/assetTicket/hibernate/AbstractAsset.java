package abic.tas.assetTicket.hibernate;



/**
 * AbstractAsset entity provides the base persistence definition of the Asset entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAsset  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idAsset;
     private AssetVirtuale assetVirtuale;
     private AssetFisico assetFisico;
     private Integer idTipoAsset;
     private String descrizione;


    // Constructors

    /** default constructor */
    public AbstractAsset() {
    }

	/** minimal constructor */
    public AbstractAsset(AssetVirtuale assetVirtuale, AssetFisico assetFisico, Integer idTipoAsset) {
        this.assetVirtuale = assetVirtuale;
        this.assetFisico = assetFisico;
        this.idTipoAsset = idTipoAsset;
    }
    
    /** full constructor */
    public AbstractAsset(AssetVirtuale assetVirtuale, AssetFisico assetFisico, Integer idTipoAsset, String descrizione) {
        this.assetVirtuale = assetVirtuale;
        this.assetFisico = assetFisico;
        this.idTipoAsset = idTipoAsset;
        this.descrizione = descrizione;
    }

   
    // Property accessors

    public Integer getIdAsset() {
        return this.idAsset;
    }
    
    public void setIdAsset(Integer idAsset) {
        this.idAsset = idAsset;
    }

    public AssetVirtuale getAssetVirtuale() {
        return this.assetVirtuale;
    }
    
    public void setAssetVirtuale(AssetVirtuale assetVirtuale) {
        this.assetVirtuale = assetVirtuale;
    }

    public AssetFisico getAssetFisico() {
        return this.assetFisico;
    }
    
    public void setAssetFisico(AssetFisico assetFisico) {
        this.assetFisico = assetFisico;
    }

    public Integer getIdTipoAsset() {
        return this.idTipoAsset;
    }
    
    public void setIdTipoAsset(Integer idTipoAsset) {
        this.idTipoAsset = idTipoAsset;
    }

    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
   








}