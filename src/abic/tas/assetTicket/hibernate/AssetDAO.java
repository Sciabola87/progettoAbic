package abic.tas.assetTicket.hibernate;

import java.util.List;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import abic.tas.assetTicket.struts.form.InserisciAssetForm;

/**
 	* A data access object (DAO) providing persistence and search support for Asset entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.Asset
  * @author MyEclipse Persistence Tools 
 */
public class AssetDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(AssetDAO.class);
		//property constants
	public static final String ID_TIPO_ASSET = "idTipoAsset";
	public static final String DESCRIZIONE = "descrizione";



    
    public void save(Asset transientInstance) {
        log.debug("saving Asset instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(Asset persistentInstance) {
        log.debug("deleting Asset instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public Asset findById( java.lang.Integer id) {
        log.debug("getting Asset instance with id: " + id);
        try {
            Asset instance = (Asset) getSession()
                    .get("abic.tas.assetTicket.hibernate.Asset", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(Asset instance) {
        log.debug("finding Asset instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.Asset")
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
      log.debug("finding Asset instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from Asset as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByIdTipoAsset(Object idTipoAsset
	) {
		return findByProperty(ID_TIPO_ASSET, idTipoAsset
		);
	}
	
	public List findByDescrizione(Object descrizione
	) {
		return findByProperty(DESCRIZIONE, descrizione
		);
	}
	

	public List findAll() {
		log.debug("finding all Asset instances");
		try {
			String queryString = "from Asset";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public Asset merge(Asset detachedInstance) {
        log.debug("merging Asset instance");
        try {
            Asset result = (Asset) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(Asset instance) {
        log.debug("attaching dirty Asset instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(Asset instance) {
        log.debug("attaching clean Asset instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public boolean inserimentoAsset(InserisciAssetForm asset){
    	log.debug("inserimento di un nuovo asset all'interno del database");
    	try {
    			String queryString = "select ub.id_ubicazione from Ubicazione as ub where descrizione='"+ asset.getUbicazione().toString() +"'";
    			Query queryObject = getSession().createQuery(queryString);
    			String id_ubicazione = queryObject.toString(); 
    			
    			return true;
			
		} catch (RuntimeException re) {
			// TODO: handle exception
			log.error("find by property name failed", re);
	         throw re;
		}
    	

    }
}