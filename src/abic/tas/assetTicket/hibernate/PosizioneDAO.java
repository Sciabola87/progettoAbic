package abic.tas.assetTicket.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Posizione entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.Posizione
  * @author MyEclipse Persistence Tools 
 */
public class PosizioneDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(PosizioneDAO.class);
		//property constants
	public static final String DESCRIZIONE = "descrizione";



    
    public void save(Posizione transientInstance) {
        log.debug("saving Posizione instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Posizione persistentInstance) {
        log.debug("deleting Posizione instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Posizione findById( java.lang.Integer id) {
        log.debug("getting Posizione instance with id: " + id);
        try {
            Posizione instance = (Posizione) getSession()
                    .get("abic.tas.assetTicket.hibernate.Posizione", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Posizione instance) {
        log.debug("finding Posizione instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.Posizione")
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
      log.debug("finding Posizione instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Posizione as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByDescrizione(Object descrizione
	) {
		return findByProperty(DESCRIZIONE, descrizione
		);
	}
	

	public List findAll() {
		log.debug("finding all Posizione instances");
		try {
			String queryString = "from Posizione";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Posizione merge(Posizione detachedInstance) {
        log.debug("merging Posizione instance");
        try {
            Posizione result = (Posizione) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Posizione instance) {
        log.debug("attaching dirty Posizione instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Posizione instance) {
        log.debug("attaching clean Posizione instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    
    public List descrizionePosizione(){
		log.debug("find all Posizione instances");
		try{
			String queryString ="Select pos.descrizione from Posizione as pos";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		}catch(RuntimeException re){
			log.error("find all failed",re);
			throw re;
		}
	}
    
}