package abic.tas.assetTicket.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for TipoUtilizzo entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.TipoUtilizzo
  * @author MyEclipse Persistence Tools 
 */
public class TipoUtilizzoDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(TipoUtilizzoDAO.class);
		//property constants
	public static final String DESCRIZIONE = "descrizione";



    
    public void save(TipoUtilizzo transientInstance) {
        log.debug("saving TipoUtilizzo instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(TipoUtilizzo persistentInstance) {
        log.debug("deleting TipoUtilizzo instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public TipoUtilizzo findById( java.lang.Integer id) {
        log.debug("getting TipoUtilizzo instance with id: " + id);
        try {
            TipoUtilizzo instance = (TipoUtilizzo) getSession()
                    .get("abic.tas.assetTicket.hibernate.TipoUtilizzo", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(TipoUtilizzo instance) {
        log.debug("finding TipoUtilizzo instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.TipoUtilizzo")
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
      log.debug("finding TipoUtilizzo instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from TipoUtilizzo as model where model." 
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
		log.debug("finding all TipoUtilizzo instances");
		try {
			String queryString = "from TipoUtilizzo";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public TipoUtilizzo merge(TipoUtilizzo detachedInstance) {
        log.debug("merging TipoUtilizzo instance");
        try {
            TipoUtilizzo result = (TipoUtilizzo) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(TipoUtilizzo instance) {
        log.debug("attaching dirty TipoUtilizzo instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(TipoUtilizzo instance) {
        log.debug("attaching clean TipoUtilizzo instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public List descrizioneTipoUtilizzo(){
		log.debug("find all Tipo Utilizzo instances");
		try{
			String queryString ="Select tu.descrizione from TipoUtilizzo as tu";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		}catch(RuntimeException re){
			log.error("find all failed",re);
			throw re;
		}
	}
}