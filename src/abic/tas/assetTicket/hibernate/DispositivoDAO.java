package abic.tas.assetTicket.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Dispositivo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.Dispositivo
  * @author MyEclipse Persistence Tools 
 */
public class DispositivoDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(DispositivoDAO.class);
		//property constants
	public static final String ID_OLD = "idOld";
	public static final String SERIALE = "seriale";
	public static final String ETICHETTA = "etichetta";
	public static final String VALORE_LISTINO = "valoreListino";
	public static final String CONSUMO_NOMINALE = "consumoNominale";
	public static final String CONSUMO_MISURATO_KWATT = "consumoMisuratoKwatt";
	public static final String FACIA_CONSUMO_OPEX = "faciaConsumoOpex";
	public static final String OPEX = "opex";
	public static final String ID_IP = "idIp";
	public static final String DATI_CONTRATTUALI = "datiContrattuali";
	public static final String USER = "user";
	public static final String PASSWORD = "password";
	public static final String ID_SERVIZIO = "idServizio";
	public static final String PAYED = "payed";
	public static final String MIGRAZIONE = "migrazione";
	public static final String VNX = "vnx";
	public static final String TELECOM_ASSET_ID = "telecomAssetId";



    
    public void save(Dispositivo transientInstance) {
        log.debug("saving Dispositivo instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Dispositivo persistentInstance) {
        log.debug("deleting Dispositivo instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Dispositivo findById( java.lang.Integer id) {
        log.debug("getting Dispositivo instance with id: " + id);
        try {
            Dispositivo instance = (Dispositivo) getSession()
                    .get("abic.tas.assetTicket.hibernate.Dispositivo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Dispositivo instance) {
        log.debug("finding Dispositivo instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.Dispositivo")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    public List findByProperty(String propertyName, Object value) {
      log.debug("finding Dispositivo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Dispositivo as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByIdOld(Object idOld
	) {
		return findByProperty(ID_OLD, idOld
		);
	}
	
	public List findBySeriale(Object seriale
	) {
		return findByProperty(SERIALE, seriale
		);
	}
	
	public List findByEtichetta(Object etichetta
	) {
		return findByProperty(ETICHETTA, etichetta
		);
	}
	
	public List findByValoreListino(Object valoreListino
	) {
		return findByProperty(VALORE_LISTINO, valoreListino
		);
	}
	
	public List findByConsumoNominale(Object consumoNominale
	) {
		return findByProperty(CONSUMO_NOMINALE, consumoNominale
		);
	}
	
	public List findByConsumoMisuratoKwatt(Object consumoMisuratoKwatt
	) {
		return findByProperty(CONSUMO_MISURATO_KWATT, consumoMisuratoKwatt
		);
	}
	
	public List findByFaciaConsumoOpex(Object faciaConsumoOpex
	) {
		return findByProperty(FACIA_CONSUMO_OPEX, faciaConsumoOpex
		);
	}
	
	public List findByOpex(Object opex
	) {
		return findByProperty(OPEX, opex
		);
	}
	
	public List findByIdIp(Object idIp
	) {
		return findByProperty(ID_IP, idIp
		);
	}
	
	public List findByDatiContrattuali(Object datiContrattuali
	) {
		return findByProperty(DATI_CONTRATTUALI, datiContrattuali
		);
	}
	
	public List findByUser(Object user
	) {
		return findByProperty(USER, user
		);
	}
	
	public List findByPassword(Object password
	) {
		return findByProperty(PASSWORD, password
		);
	}
	
	public List findByIdServizio(Object idServizio
	) {
		return findByProperty(ID_SERVIZIO, idServizio
		);
	}
	
	public List findByPayed(Object payed
	) {
		return findByProperty(PAYED, payed
		);
	}
	
	public List findByMigrazione(Object migrazione
	) {
		return findByProperty(MIGRAZIONE, migrazione
		);
	}
	
	public List findByVnx(Object vnx
	) {
		return findByProperty(VNX, vnx
		);
	}
	
	public List findByTelecomAssetId(Object telecomAssetId
	) {
		return findByProperty(TELECOM_ASSET_ID, telecomAssetId
		);
	}
	

	public List findAll() {
		log.debug("finding all Dispositivo instances");
		try {
			String queryString = "from Dispositivo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Dispositivo merge(Dispositivo detachedInstance) {
        log.debug("merging Dispositivo instance");
        try {
            Dispositivo result = (Dispositivo) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Dispositivo instance) {
        log.debug("attaching dirty Dispositivo instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Dispositivo instance) {
        log.debug("attaching clean Dispositivo instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}