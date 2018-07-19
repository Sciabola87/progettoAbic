package abic.tas.assetTicket.hibernate;

import java.util.Set;


/**
 * Dispositivo entity. @author MyEclipse Persistence Tools
 */
public class Dispositivo extends AbstractDispositivo implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/** default constructor */
    public Dispositivo() {
    }

	/** minimal constructor */
    public Dispositivo(Integer id, Condizione condizione, Modello modello, Marca marca, Stato stato, Integer seriale, String etichetta, Integer faciaConsumoOpex, Integer opex, Integer idIp, String datiContrattuali) {
        super(id, condizione, modello, marca, stato, seriale, etichetta, faciaConsumoOpex, opex, idIp, datiContrattuali);        
    }
    
    /** full constructor */
    public Dispositivo(Integer id, Condizione condizione, Modello modello, Marca marca, Stato stato, Integer idOld, Integer seriale, String etichetta, Integer valoreListino, Integer consumoNominale, Integer consumoMisuratoKwatt, Integer faciaConsumoOpex, Integer opex, Integer idIp, String datiContrattuali, String user, String password, Integer idServizio, Boolean payed, Boolean migrazione, Boolean vnx, String telecomAssetId, Set assetFisicos) {
        super(id, condizione, modello, marca, stato, idOld, seriale, etichetta, valoreListino, consumoNominale, consumoMisuratoKwatt, faciaConsumoOpex, opex, idIp, datiContrattuali, user, password, idServizio, payed, migrazione, vnx, telecomAssetId, assetFisicos);        
    }
   
}
