package abic.tas.assetTicket.hibernate;

import java.sql.Timestamp;
import java.util.HashSet;
import java.util.Set;


/**
 * AbstractAssetVirtuale entity provides the base persistence definition of the AssetVirtuale entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractAssetVirtuale  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer idAssetVirtuale;
     private Categoria categoriaByIdCategoria;
     private Categoria categoriaByIdTipologia;
     private Stato stato;
     private String virtualCenter;
     private String hostFisico;
     private String hwAbic;
     private Integer payed;
     private Integer prezzo;
     private Integer idStato;
     private Integer cpu;
     private Integer ram;
     private String classe;
     private Integer idReferente;
     private String descrizione;
     private String marcketing;
     private String username;
     private String password;
     private String note;
     private Timestamp dataCreazione;
     private Timestamp dataFine;
     private Set assets = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractAssetVirtuale() {
    }

	/** minimal constructor */
    public AbstractAssetVirtuale(Categoria categoriaByIdCategoria, Categoria categoriaByIdTipologia, String virtualCenter, String hostFisico, String hwAbic, Integer idReferente, Timestamp dataCreazione, Timestamp dataFine) {
        this.categoriaByIdCategoria = categoriaByIdCategoria;
        this.categoriaByIdTipologia = categoriaByIdTipologia;
        this.virtualCenter = virtualCenter;
        this.hostFisico = hostFisico;
        this.hwAbic = hwAbic;
        this.idReferente = idReferente;
        this.dataCreazione = dataCreazione;
        this.dataFine = dataFine;
    }
    
    /** full constructor */
    public AbstractAssetVirtuale(Categoria categoriaByIdCategoria, Categoria categoriaByIdTipologia, Stato stato, String virtualCenter, String hostFisico, String hwAbic, Integer payed, Integer prezzo, Integer idStato, Integer cpu, Integer ram, String classe, Integer idReferente, String descrizione, String marcketing, String username, String password, String note, Timestamp dataCreazione, Timestamp dataFine, Set assets) {
        this.categoriaByIdCategoria = categoriaByIdCategoria;
        this.categoriaByIdTipologia = categoriaByIdTipologia;
        this.stato = stato;
        this.virtualCenter = virtualCenter;
        this.hostFisico = hostFisico;
        this.hwAbic = hwAbic;
        this.payed = payed;
        this.prezzo = prezzo;
        this.idStato = idStato;
        this.cpu = cpu;
        this.ram = ram;
        this.classe = classe;
        this.idReferente = idReferente;
        this.descrizione = descrizione;
        this.marcketing = marcketing;
        this.username = username;
        this.password = password;
        this.note = note;
        this.dataCreazione = dataCreazione;
        this.dataFine = dataFine;
        this.assets = assets;
    }

   
    // Property accessors

    public Integer getIdAssetVirtuale() {
        return this.idAssetVirtuale;
    }
    
    public void setIdAssetVirtuale(Integer idAssetVirtuale) {
        this.idAssetVirtuale = idAssetVirtuale;
    }

    public Categoria getCategoriaByIdCategoria() {
        return this.categoriaByIdCategoria;
    }
    
    public void setCategoriaByIdCategoria(Categoria categoriaByIdCategoria) {
        this.categoriaByIdCategoria = categoriaByIdCategoria;
    }

    public Categoria getCategoriaByIdTipologia() {
        return this.categoriaByIdTipologia;
    }
    
    public void setCategoriaByIdTipologia(Categoria categoriaByIdTipologia) {
        this.categoriaByIdTipologia = categoriaByIdTipologia;
    }

    public Stato getStato() {
        return this.stato;
    }
    
    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public String getVirtualCenter() {
        return this.virtualCenter;
    }
    
    public void setVirtualCenter(String virtualCenter) {
        this.virtualCenter = virtualCenter;
    }

    public String getHostFisico() {
        return this.hostFisico;
    }
    
    public void setHostFisico(String hostFisico) {
        this.hostFisico = hostFisico;
    }

    public String getHwAbic() {
        return this.hwAbic;
    }
    
    public void setHwAbic(String hwAbic) {
        this.hwAbic = hwAbic;
    }

    public Integer getPayed() {
        return this.payed;
    }
    
    public void setPayed(Integer payed) {
        this.payed = payed;
    }

    public Integer getPrezzo() {
        return this.prezzo;
    }
    
    public void setPrezzo(Integer prezzo) {
        this.prezzo = prezzo;
    }

    public Integer getIdStato() {
        return this.idStato;
    }
    
    public void setIdStato(Integer idStato) {
        this.idStato = idStato;
    }

    public Integer getCpu() {
        return this.cpu;
    }
    
    public void setCpu(Integer cpu) {
        this.cpu = cpu;
    }

    public Integer getRam() {
        return this.ram;
    }
    
    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public String getClasse() {
        return this.classe;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }

    public Integer getIdReferente() {
        return this.idReferente;
    }
    
    public void setIdReferente(Integer idReferente) {
        this.idReferente = idReferente;
    }

    public String getDescrizione() {
        return this.descrizione;
    }
    
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getMarcketing() {
        return this.marcketing;
    }
    
    public void setMarcketing(String marcketing) {
        this.marcketing = marcketing;
    }

    public String getUsername() {
        return this.username;
    }
    
    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public String getNote() {
        return this.note;
    }
    
    public void setNote(String note) {
        this.note = note;
    }

    public Timestamp getDataCreazione() {
        return this.dataCreazione;
    }
    
    public void setDataCreazione(Timestamp dataCreazione) {
        this.dataCreazione = dataCreazione;
    }

    public Timestamp getDataFine() {
        return this.dataFine;
    }
    
    public void setDataFine(Timestamp dataFine) {
        this.dataFine = dataFine;
    }

    public Set getAssets() {
        return this.assets;
    }
    
    public void setAssets(Set assets) {
        this.assets = assets;
    }
   








}