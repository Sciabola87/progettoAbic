package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * AssetFisico entity. @author MyEclipse Persistence Tools
 */
public class AssetFisico extends AbstractAssetFisico implements java.io.Serializable {

    // Constructors

    /** default constructor */
    public AssetFisico() {
    }

	/** minimal constructor */
    public AssetFisico(Categoria categoriaByIdMacroTipologia, Categoria categoriaByIdTipologia, Dispositivo dispositivo, String proprieta, Integer idOwner, Integer idRiferimento, String utilizzoProgetto) {
        super(categoriaByIdMacroTipologia, categoriaByIdTipologia, dispositivo, proprieta, idOwner, idRiferimento, utilizzoProgetto);        
    }
    
    /** full constructor */
    public AssetFisico(Ubicazione ubicazione, TipoUtilizzo tipoUtilizzo, Categoria categoriaByIdSottoCategoria, Categoria categoriaByIdMacroTipologia, Categoria categoriaByIdCategoria, Posizione posizione, Categoria categoriaByIdTipologia, Dispositivo dispositivo, String proprieta, Integer idOwner, Integer idRiferimento, String utilizzoProgetto, Set assets) {
        super(ubicazione, tipoUtilizzo, categoriaByIdSottoCategoria, categoriaByIdMacroTipologia, categoriaByIdCategoria, posizione, categoriaByIdTipologia, dispositivo, proprieta, idOwner, idRiferimento, utilizzoProgetto, assets);        
    }
   
}
