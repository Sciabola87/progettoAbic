package abic.tas.assetTicket.hibernate;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 	* A data access object (DAO) providing persistence and search support for Login entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.Login
  * @author MyEclipse Persistence Tools 
 */
public class LoginDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(LoginDAO.class);
		//property constants
	public static final String PASSWORD = "password";



    
    public void save(Login transientInstance) {
        log.debug("saving Login instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Login persistentInstance) {
        log.debug("deleting Login instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Login findById( java.lang.String id) {
        log.debug("getting Login instance with id: " + id);
        try {
            Login instance = (Login) getSession()
                    .get("abic.tas.assetTicket.hibernate.Login", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Login instance) {
        log.debug("finding Login instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.Login")
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
      log.debug("finding Login instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Login as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByPassword(Object password
	) {
		return findByProperty(PASSWORD, password
		);
	}
	

	public List findAll() {
		log.debug("finding all Login instances");
		try {
			String queryString = "from Login";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Login merge(Login detachedInstance) {
        log.debug("merging Login instance");
        try {
            Login result = (Login) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Login instance) {
        log.debug("attaching dirty Login instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Login instance) {
        log.debug("attaching clean Login instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public boolean verifica_utente(String username, String password){
		log.debug("finding all Login instances");
		try {
			String queryString = "from Login as model where model.username='"+username+"' and model.password='"+password+"'";
	         Query queryObject = getSession().createQuery(queryString);
	         if (!queryObject.list().isEmpty()){
	        	 return true;
	         }else{
	        	 return false;
	         }
		}catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
		}
}