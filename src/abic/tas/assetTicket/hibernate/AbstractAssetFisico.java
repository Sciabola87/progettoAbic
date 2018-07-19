package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractAssetFisico entity provides the base persistence definition of the AssetFisico entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAssetFisico  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idAssetFisico;
     private Ubicazione ubicazione;
     private TipoUtilizzo tipoUtilizzo;
     private Categoria categoriaByIdSottoCategoria;
     private Categoria categoriaByIdMacroTipologia;
     private Categoria categoriaByIdCategoria;
     private Posizione posizione;
     private Categoria categoriaByIdTipologia;
     private Dispositivo dispositivo;
     private String proprieta;
     private Integer idOwner;
     private Integer idRiferimento;
     private String utilizzoProgetto;
     private Set assets = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractAssetFisico() {
    }

	/** minimal constructor */
    public AbstractAssetFisico(Categoria categoriaByIdMacroTipologia, Categoria categoriaByIdTipologia, Dispositivo dispositivo, String proprieta, Integer idOwner, Integer idRiferimento, String utilizzoProgetto) {
        this.categoriaByIdMacroTipologia = categoriaByIdMacroTipologia;
        this.categoriaByIdTipologia = categoriaByIdTipologia;
        this.dispositivo = dispositivo;
        this.proprieta = proprieta;
        this.idOwner = idOwner;
        this.idRiferimento = idRiferimento;
        this.utilizzoProgetto = utilizzoProgetto;
    }
    
    /** full constructor */
    public AbstractAssetFisico(Ubicazione ubicazione, TipoUtilizzo tipoUtilizzo, Categoria categoriaByIdSottoCategoria, Categoria categoriaByIdMacroTipologia, Categoria categoriaByIdCategoria, Posizione posizione, Categoria categoriaByIdTipologia, Dispositivo dispositivo, String proprieta, Integer idOwner, Integer idRiferimento, String utilizzoProgetto, Set assets) {
        this.ubicazione = ubicazione;
        this.tipoUtilizzo = tipoUtilizzo;
        this.categoriaByIdSottoCategoria = categoriaByIdSottoCategoria;
        this.categoriaByIdMacroTipologia = categoriaByIdMacroTipologia;
        this.categoriaByIdCategoria = categoriaByIdCategoria;
        this.posizione = posizione;
        this.categoriaByIdTipologia = categoriaByIdTipologia;
        this.dispositivo = dispositivo;
        this.proprieta = proprieta;
        this.idOwner = idOwner;
        this.idRiferimento = idRiferimento;
        this.utilizzoProgetto = utilizzoProgetto;
        this.assets = assets;
    }

   
    // Property accessors

    public Integer getIdAssetFisico() {
        return this.idAssetFisico;
    }
    
    public void setIdAssetFisico(Integer idAssetFisico) {
        this.idAssetFisico = idAssetFisico;
    }

    public Ubicazione getUbicazione() {
        return this.ubicazione;
    }
    
    public void setUbicazione(Ubicazione ubicazione) {
        this.ubicazione = ubicazione;
    }

    public TipoUtilizzo getTipoUtilizzo() {
        return this.tipoUtilizzo;
    }
    
    public void setTipoUtilizzo(TipoUtilizzo tipoUtilizzo) {
        this.tipoUtilizzo = tipoUtilizzo;
    }

    public Categoria getCategoriaByIdSottoCategoria() {
        return this.categoriaByIdSottoCategoria;
    }
    
    public void setCategoriaByIdSottoCategoria(Categoria categoriaByIdSottoCategoria) {
        this.categoriaByIdSottoCategoria = categoriaByIdSottoCategoria;
    }

    public Categoria getCategoriaByIdMacroTipologia() {
        return this.categoriaByIdMacroTipologia;
    }
    
    public void setCategoriaByIdMacroTipologia(Categoria categoriaByIdMacroTipologia) {
        this.categoriaByIdMacroTipologia = categoriaByIdMacroTipologia;
    }

    public Categoria getCategoriaByIdCategoria() {
        return this.categoriaByIdCategoria;
    }
    
    public void setCategoriaByIdCategoria(Categoria categoriaByIdCategoria) {
        this.categoriaByIdCategoria = categoriaByIdCategoria;
    }

    public Posizione getPosizione() {
        return this.posizione;
    }
    
    public void setPosizione(Posizione posizione) {
        this.posizione = posizione;
    }

    public Categoria getCategoriaByIdTipologia() {
        return this.categoriaByIdTipologia;
    }
    
    public void setCategoriaByIdTipologia(Categoria categoriaByIdTipologia) {
        this.categoriaByIdTipologia = categoriaByIdTipologia;
    }

    public Dispositivo getDispositivo() {
        return this.dispositivo;
    }
    
    public void setDispositivo(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getProprieta() {
        return this.proprieta;
    }
    
    public void setProprieta(String proprieta) {
        this.proprieta = proprieta;
    }

    public Integer getIdOwner() {
        return this.idOwner;
    }
    
    public void setIdOwner(Integer idOwner) {
        this.idOwner = idOwner;
    }

    public Integer getIdRiferimento() {
        return this.idRiferimento;
    }
    
    public void setIdRiferimento(Integer idRiferimento) {
        this.idRiferimento = idRiferimento;
    }

    public String getUtilizzoProgetto() {
        return this.utilizzoProgetto;
    }
    
    public void setUtilizzoProgetto(String utilizzoProgetto) {
        this.utilizzoProgetto = utilizzoProgetto;
    }

    public Set getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set assets) {
        this.assets = assets;
    }
   








}