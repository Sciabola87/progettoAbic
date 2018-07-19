package abic.tas.assetTicket.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Modello entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.Modello
  * @author MyEclipse Persistence Tools 
 */
public class ModelloDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(ModelloDAO.class);
		//property constants
	public static final String DESCRIZIONE = "descrizione";



    
    public void save(Modello transientInstance) {
        log.debug("saving Modello instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Modello persistentInstance) {
        log.debug("deleting Modello instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Modello findById( java.lang.Integer id) {
        log.debug("getting Modello instance with id: " + id);
        try {
            Modello instance = (Modello) getSession()
                    .get("abic.tas.assetTicket.hibernate.Modello", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Modello instance) {
        log.debug("finding Modello instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.Modello")
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
      log.debug("finding Modello instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Modello as model where model." 
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
		log.debug("finding all Modello instances");
		try {
			String queryString = "from Modello";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Modello merge(Modello detachedInstance) {
        log.debug("merging Modello instance");
        try {
            Modello result = (Modello) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Modello instance) {
        log.debug("attaching dirty Modello instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Modello instance) {
        log.debug("attaching clean Modello instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    
    public List descrizioneModello(){
		log.debug("find all Modello instances");
		try{
			String queryString ="Select u.descrizione from Modello as u";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		}catch(RuntimeException re){
			log.error("find all failed",re);
			throw re;
		}
	}
}