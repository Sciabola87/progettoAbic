package abic.tas.assetTicket.hibernate;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Categoria entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.Categoria
  * @author MyEclipse Persistence Tools 
 */
public class CategoriaDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(CategoriaDAO.class);
		//property constants
	public static final String DESCRIZIONE = "descrizione";



    
    public void save(Categoria transientInstance) {
        log.debug("saving Categoria instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Categoria persistentInstance) {
        log.debug("deleting Categoria instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Categoria findById( java.lang.Integer id) {
        log.debug("getting Categoria instance with id: " + id);
        try {
            Categoria instance = (Categoria) getSession()
                    .get("abic.tas.assetTicket.hibernate.Categoria", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Categoria instance) {
        log.debug("finding Categoria instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.Categoria")
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
      log.debug("finding Categoria instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Categoria as model where model." 
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
		log.debug("finding all Categoria instances");
		try {
			String queryString = "from Categoria";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
	public List descrizioneCategoria(){
		log.debug("find all Categoria instances");
		try{
			String queryString ="Select cat.descrizione from Categoria as cat";
			Query queryObject = getSession().createQuery(queryString);
			return queryObject.list();
		}catch(RuntimeException re){
			log.error("find all failed",re);
			throw re;
		}
	}
	
    public Categoria merge(Categoria detachedInstance) {
        log.debug("merging Categoria instance");
        try {
            Categoria result = (Categoria) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Categoria instance) {
        log.debug("attaching dirty Categoria instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Categoria instance) {
        log.debug("attaching clean Categoria instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
}