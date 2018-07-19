package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractCategoria entity provides the base persistence definition of the Categoria entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractCategoria  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer idCategoria;
     private String descrizione;
     private Set assetVirtualesForIdTipologia = new HashSet(0);
     private Set assetFisicosForIdCategoria = new HashSet(0);
     private Set assetVirtualesForIdCategoria = new HashSet(0);
     private Set assetFisicosForIdMacroTipologia = new HashSet(0);
     private Set assetFisicosForIdSottoCategoria = new HashSet(0);
     private Set assetFisicosForIdTipologia = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractCategoria() {
    }

    
    /** full constructor */
    public AbstractCategoria(String descrizione, Set assetVirtualesForIdTipologia, Set assetFisicosForIdCategoria, Set assetVirtualesForIdCategoria, Set assetFisicosForIdMacroTipologia, Set assetFisicosForIdSottoCategoria, Set assetFisicosForIdTipologia) {
        this.descrizione = descrizione;
        this.assetVirtualesForIdTipologia = assetVirtualesForIdTipologia;
        this.assetFisicosForIdCategoria = assetFisicosForIdCategoria;
        this.assetVirtualesForIdCategoria = assetVirtualesForIdCategoria;
        this.assetFisicosForIdMacroTipologia = assetFisicosForIdMacroTipologia;
        this.assetFisicosForIdSottoCategoria = assetFisicosForIdSottoCategoria;
        this.assetFisicosForIdTipologia = assetFisicosForIdTipologia;
    }

   
    // Property accessors

    public Integer getIdCategoria() {
        return this.idCategoria;
    }
    
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public Set getAssetVirtualesForIdTipologia() {
        return this.assetVirtualesForIdTipologia;
    }
    
    public void setAssetVirtualesForIdTipologia(Set assetVirtualesForIdTipologia) {
        this.assetVirtualesForIdTipologia = assetVirtualesForIdTipologia;
    }

    public Set getAssetFisicosForIdCategoria() {
        return this.assetFisicosForIdCategoria;
    }
    
    public void setAssetFisicosForIdCategoria(Set assetFisicosForIdCategoria) {
        this.assetFisicosForIdCategoria = assetFisicosForIdCategoria;
    }

    public Set getAssetVirtualesForIdCategoria() {
        return this.assetVirtualesForIdCategoria;
    }
    
    public void setAssetVirtualesForIdCategoria(Set assetVirtualesForIdCategoria) {
        this.assetVirtualesForIdCategoria = assetVirtualesForIdCategoria;
    }

    public Set getAssetFisicosForIdMacroTipologia() {
        return this.assetFisicosForIdMacroTipologia;
    }
    
    public void setAssetFisicosForIdMacroTipologia(Set assetFisicosForIdMacroTipologia) {
        this.assetFisicosForIdMacroTipologia = assetFisicosForIdMacroTipologia;
    }

    public Set getAssetFisicosForIdSottoCategoria() {
        return this.assetFisicosForIdSottoCategoria;
    }
    
    public void setAssetFisicosForIdSottoCategoria(Set assetFisicosForIdSottoCategoria) {
        this.assetFisicosForIdSottoCategoria = assetFisicosForIdSottoCategoria;
    }

    public Set getAssetFisicosForIdTipologia() {
        return this.assetFisicosForIdTipologia;
    }
    
    public void setAssetFisicosForIdTipologia(Set assetFisicosForIdTipologia) {
        this.assetFisicosForIdTipologia = assetFisicosForIdTipologia;
    }
   








}