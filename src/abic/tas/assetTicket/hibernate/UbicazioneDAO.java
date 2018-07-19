package abic.tas.assetTicket.hibernate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Ubicazione entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.Ubicazione
  * @author MyEclipse Persistence Tools 
 */
public class UbicazioneDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(UbicazioneDAO.class);
		//property constants
	public static final String DESCRIZIONE = "descrizione";



    
    public void save(Ubicazione transientInstance) {
        log.debug("saving Ubicazione instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Ubicazione persistentInstance) {
        log.debug("deleting Ubicazione instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Ubicazione findById( java.lang.Integer id) {
        log.debug("getting Ubicazione instance with id: " + id);
        try {
            Ubicazione instance = (Ubicazione) getSession()
                    .get("abic.tas.assetTicket.hibernate.Ubicazione", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    @SuppressWarnings("rawtypes")
	public List findByExample(Ubicazione instance) {
        log.debug("finding Ubicazione instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.Ubicazione")
                    .add(Example.create(instance))
            .list();
            log.debug("find by example successful, result size: " + results.size());
            return results;
        } catch (RuntimeException re) {
            log.error("find by example failed", re);
            throw re;
        }
    }    
    
    @SuppressWarnings("rawtypes")
	public List findByProperty(String propertyName, Object value) {
      log.debug("finding Ubicazione instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Ubicazione as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	@SuppressWarnings("rawtypes")
	public List findByDescrizione(Object descrizione
	) {
		return findByProperty(DESCRIZIONE, descrizione
		);
	}
	

	@SuppressWarnings("rawtypes")
	public List findAll() {
		log.debug("finding all Ubicazione instances");
		try {
			String queryString = "from Ubicazione";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Ubicazione merge(Ubicazione detachedInstance) {
        log.debug("merging Ubicazione instance");
        try {
            Ubicazione result = (Ubicazione) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Ubicazione instance) {
        log.debug("attaching dirty Ubicazione instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Ubicazione instance) {
        log.debug("attaching clean Ubicazione instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }

}