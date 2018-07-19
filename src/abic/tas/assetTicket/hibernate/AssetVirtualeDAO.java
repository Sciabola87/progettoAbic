package abic.tas.assetTicket.hibernate;

import java.sql.Timestamp;
import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for AssetVirtuale entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.AssetVirtuale
  * @author MyEclipse Persistence Tools 
 */
public class AssetVirtualeDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(AssetVirtualeDAO.class);
		//property constants
	public static final String VIRTUAL_CENTER = "virtualCenter";
	public static final String HOST_FISICO = "hostFisico";
	public static final String HW_ABIC = "hwAbic";
	public static final String PAYED = "payed";
	public static final String PREZZO = "prezzo";
	public static final String ID_STATO = "idStato";
	public static final String CPU = "cpu";
	public static final String RAM = "ram";
	public static final String CLASSE = "classe";
	public static final String ID_REFERENTE = "idReferente";
	public static final String DESCRIZIONE = "descrizione";
	public static final String MARCKETING = "marcketing";
	public static final String USERNAME = "username";
	public static final String PASSWORD = "password";
	public static final String NOTE = "note";



    
    public void save(AssetVirtuale transientInstance) {
        log.debug("saving AssetVirtuale instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(AssetVirtuale persistentInstance) {
        log.debug("deleting AssetVirtuale instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public AssetVirtuale findById( java.lang.Integer id) {
        log.debug("getting AssetVirtuale instance with id: " + id);
        try {
            AssetVirtuale instance = (AssetVirtuale) getSession()
                    .get("abic.tas.assetTicket.hibernate.AssetVirtuale", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(AssetVirtuale instance) {
        log.debug("finding AssetVirtuale instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.AssetVirtuale")
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
      log.debug("finding AssetVirtuale instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from AssetVirtuale as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByVirtualCenter(Object virtualCenter
	) {
		return findByProperty(VIRTUAL_CENTER, virtualCenter
		);
	}
	
	public List findByHostFisico(Object hostFisico
	) {
		return findByProperty(HOST_FISICO, hostFisico
		);
	}
	
	public List findByHwAbic(Object hwAbic
	) {
		return findByProperty(HW_ABIC, hwAbic
		);
	}
	
	public List findByPayed(Object payed
	) {
		return findByProperty(PAYED, payed
		);
	}
	
	public List findByPrezzo(Object prezzo
	) {
		return findByProperty(PREZZO, prezzo
		);
	}
	
	public List findByIdStato(Object idStato
	) {
		return findByProperty(ID_STATO, idStato
		);
	}
	
	public List findByCpu(Object cpu
	) {
		return findByProperty(CPU, cpu
		);
	}
	
	public List findByRam(Object ram
	) {
		return findByProperty(RAM, ram
		);
	}
	
	public List findByClasse(Object classe
	) {
		return findByProperty(CLASSE, classe
		);
	}
	
	public List findByIdReferente(Object idReferente
	) {
		return findByProperty(ID_REFERENTE, idReferente
		);
	}
	
	public List findByDescrizione(Object descrizione
	) {
		return findByProperty(DESCRIZIONE, descrizione
		);
	}
	
	public List findByMarcketing(Object marcketing
	) {
		return findByProperty(MARCKETING, marcketing
		);
	}
	
	public List findByUsername(Object username
	) {
		return findByProperty(USERNAME, username
		);
	}
	
	public List findByPassword(Object password
	) {
		return findByProperty(PASSWORD, password
		);
	}
	
	public List findByNote(Object note
	) {
		return findByProperty(NOTE, note
		);
	}
	

	public List findAll() {
		log.debug("finding all AssetVirtuale instances");
		try {
			String queryString = "from AssetVirtuale";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public AssetVirtuale merge(AssetVirtuale detachedInstance) {
        log.debug("merging AssetVirtuale instance");
        try {
            AssetVirtuale result = (AssetVirtuale) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(AssetVirtuale instance) {
        log.debug("attaching dirty AssetVirtuale instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(AssetVirtuale instance) {
        log.debug("attaching clean AssetVirtuale instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}