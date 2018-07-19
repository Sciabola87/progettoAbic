package abic.tas.assetTicket.hibernate;

import java.util.HashSet;
import java.util.Set;


/**
 * AbstractDispositivo entity provides the base persistence definition of the Dispositivo entity. @author MyEclipse Persistence Tools
 */

public abstract class AbstractDispositivo  implements java.io.Serializable {


    // Fields    

     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
     private Condizione condizione;
     private Modello modello;
     private Marca marca;
     private Stato stato;
     private Integer idOld;
     private Integer seriale;
     private String etichetta;
     private Integer valoreListino;
     private Integer consumoNominale;
     private Integer consumoMisuratoKwatt;
     private Integer faciaConsumoOpex;
     private Integer opex;
     private Integer idIp;
     private String datiContrattuali;
     private String user;
     private String password;
     private Integer idServizio;
     private Boolean payed;
     private Boolean migrazione;
     private Boolean vnx;
     private String telecomAssetId;
     private Set assetFisicos = new HashSet(0);


    // Constructors

    /** default constructor */
    public AbstractDispositivo() {
    }

	/** minimal constructor */
    public AbstractDispositivo(Integer id, Condizione condizione, Modello modello, Marca marca, Stato stato, Integer seriale, String etichetta, Integer faciaConsumoOpex, Integer opex, Integer idIp, String datiContrattuali) {
        this.id = id;
        this.condizione = condizione;
        this.modello = modello;
        this.marca = marca;
        this.stato = stato;
        this.seriale = seriale;
        this.etichetta = etichetta;
        this.faciaConsumoOpex = faciaConsumoOpex;
        this.opex = opex;
        this.idIp = idIp;
        this.datiContrattuali = datiContrattuali;
    }
    
    /** full constructor */
    public AbstractDispositivo(Integer id, Condizione condizione, Modello modello, Marca marca, Stato stato, Integer idOld, Integer seriale, String etichetta, Integer valoreListino, Integer consumoNominale, Integer consumoMisuratoKwatt, Integer faciaConsumoOpex, Integer opex, Integer idIp, String datiContrattuali, String user, String password, Integer idServizio, Boolean payed, Boolean migrazione, Boolean vnx, String telecomAssetId, Set assetFisicos) {
        this.id = id;
        this.condizione = condizione;
        this.modello = modello;
        this.marca = marca;
        this.stato = stato;
        this.idOld = idOld;
        this.seriale = seriale;
        this.etichetta = etichetta;
        this.valoreListino = valoreListino;
        this.consumoNominale = consumoNominale;
        this.consumoMisuratoKwatt = consumoMisuratoKwatt;
        this.faciaConsumoOpex = faciaConsumoOpex;
        this.opex = opex;
        this.idIp = idIp;
        this.datiContrattuali = datiContrattuali;
        this.user = user;
        this.password = password;
        this.idServizio = idServizio;
        this.payed = payed;
        this.migrazione = migrazione;
        this.vnx = vnx;
        this.telecomAssetId = telecomAssetId;
        this.assetFisicos = assetFisicos;
    }

   
    // Property accessors

    public Integer getId() {
        return this.id;
    }
    
    public void setId(Integer id) {
        this.id = id;
    }

    public Condizione getCondizione() {
        return this.condizione;
    }
    
    public void setCondizione(Condizione condizione) {
        this.condizione = condizione;
    }

    public Modello getModello() {
        return this.modello;
    }
    
    public void setModello(Modello modello) {
        this.modello = modello;
    }

    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Stato getStato() {
        return this.stato;
    }
    
    public void setStato(Stato stato) {
        this.stato = stato;
    }

    public Integer getIdOld() {
        return this.idOld;
    }
    
    public void setIdOld(Integer idOld) {
        this.idOld = idOld;
    }

    public Integer getSeriale() {
        return this.seriale;
    }
    
    public void setSeriale(Integer seriale) {
        this.seriale = seriale;
    }

    public String getEtichetta() {
        return this.etichetta;
    }
    
    public void setEtichetta(String etichetta) {
        this.etichetta = etichetta;
    }

    public Integer getValoreListino() {
        return this.valoreListino;
    }
    
    public void setValoreListino(Integer valoreListino) {
        this.valoreListino = valoreListino;
    }

    public Integer getConsumoNominale() {
        return this.consumoNominale;
    }
    
    public void setConsumoNominale(Integer consumoNominale) {
        this.consumoNominale = consumoNominale;
    }

    public Integer getConsumoMisuratoKwatt() {
        return this.consumoMisuratoKwatt;
    }
    
    public void setConsumoMisuratoKwatt(Integer consumoMisuratoKwatt) {
        this.consumoMisuratoKwatt = consumoMisuratoKwatt;
    }

    public Integer getFaciaConsumoOpex() {
        return this.faciaConsumoOpex;
    }
    
    public void setFaciaConsumoOpex(Integer faciaConsumoOpex) {
        this.faciaConsumoOpex = faciaConsumoOpex;
    }

    public Integer getOpex() {
        return this.opex;
    }
    
    public void setOpex(Integer opex) {
        this.opex = opex;
    }

    public Integer getIdIp() {
        return this.idIp;
    }
    
    public void setIdIp(Integer idIp) {
        this.idIp = idIp;
    }

    public String getDatiContrattuali() {
        return this.datiContrattuali;
    }
    
    public void setDatiContrattuali(String datiContrattuali) {
        this.datiContrattuali = datiContrattuali;
    }

    public String getUser() {
        return this.user;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return this.password;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getIdServizio() {
        return this.idServizio;
    }
    
    public void setIdServizio(Integer idServizio) {
        this.idServizio = idServizio;
    }

    public Boolean getPayed() {
        return this.payed;
    }
    
    public void setPayed(Boolean payed) {
        this.payed = payed;
    }

    public Boolean getMigrazione() {
        return this.migrazione;
    }
    
    public void setMigrazione(Boolean migrazione) {
        this.migrazione = migrazione;
    }

    public Boolean getVnx() {
        return this.vnx;
    }
    
    public void setVnx(Boolean vnx) {
        this.vnx = vnx;
    }

    public String getTelecomAssetId() {
        return this.telecomAssetId;
    }
    
    public void setTelecomAssetId(String telecomAssetId) {
        this.telecomAssetId = telecomAssetId;
    }

    public Set getAssetFisicos() {
        return this.assetFisicos;
    }
    
    public void setAssetFisicos(Set assetFisicos) {
        this.assetFisicos = assetFisicos;
    }
   








}