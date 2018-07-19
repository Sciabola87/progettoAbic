package abic.tas.assetTicket.hibernate;

import java.util.List;
import java.util.Set;
import org.hibernate.LockOptions;
import org.hibernate.Query;
import org.hibernate.criterion.Example;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import abic.tas.assetTicket.struts.form.InserisciAssetForm;

/**
 	* A data access object (DAO) providing persistence and search support for AssetFisico entities.
 			* Transaction control of the save(), update() and delete() operations 
		can directly support Spring container-managed transactions or they can be augmented	to handle user-managed Spring transactions. 
		Each of these methods provides additional information for how to configure it for the desired type of transaction control. 	
	 * @see abic.tas.assetTicket.hibernate.AssetFisico
  * @author MyEclipse Persistence Tools 
 */
public class AssetFisicoDAO extends BaseHibernateDAO  {
	     private static final Logger log = LoggerFactory.getLogger(AssetFisicoDAO.class);
		//property constants
	public static final String PROPRIETA = "proprieta";
	public static final String ID_OWNER = "idOwner";
	public static final String ID_RIFERIMENTO = "idRiferimento";
	public static final String UTILIZZO_PROGETTO = "utilizzoProgetto";



    
    public void save(AssetFisico transientInstance) {
        log.debug("saving AssetFisico instance");
        try {
            getSession().save(transientInstance);
            log.debug("save successful");
        } catch (RuntimeException re) {
            log.error("save failed", re);
            throw re;
        }
    }
    
	public void delete(AssetFisico persistentInstance) {
        log.debug("deleting AssetFisico instance");
        try {
            getSession().delete(persistentInstance);
            log.debug("delete successful");
        } catch (RuntimeException re) {
            log.error("delete failed", re);
            throw re;
        }
    }
    
    public AssetFisico findById( java.lang.Integer id) {
        log.debug("getting AssetFisico instance with id: " + id);
        try {
            AssetFisico instance = (AssetFisico) getSession()
                    .get("abic.tas.assetTicket.hibernate.AssetFisico", id);
            return instance;
        } catch (RuntimeException re) {
            log.error("get failed", re);
            throw re;
        }
    }
    
    
    public List findByExample(AssetFisico instance) {
        log.debug("finding AssetFisico instance by example");
        try {
            List results = getSession()
                    .createCriteria("abic.tas.assetTicket.hibernate.AssetFisico")
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
      log.debug("finding AssetFisico instance with property: " + propertyName
            + ", value: " + value);
      try {
         String queryString = "from AssetFisico as model where model." 
         						+ propertyName + "= ?";
         Query queryObject = getSession().createQuery(queryString);
		 queryObject.setParameter(0, value);
		 return queryObject.list();
      } catch (RuntimeException re) {
         log.error("find by property name failed", re);
         throw re;
      }
	}

	public List findByProprieta(Object proprieta
	) {
		return findByProperty(PROPRIETA, proprieta
		);
	}
	
	public List findByIdOwner(Object idOwner
	) {
		return findByProperty(ID_OWNER, idOwner
		);
	}
	
	public List findByIdRiferimento(Object idRiferimento
	) {
		return findByProperty(ID_RIFERIMENTO, idRiferimento
		);
	}
	
	public List findByUtilizzoProgetto(Object utilizzoProgetto
	) {
		return findByProperty(UTILIZZO_PROGETTO, utilizzoProgetto
		);
	}
	

	public List findAll() {
		log.debug("finding all AssetFisico instances");
		try {
			String queryString = "from AssetFisico";
	         Query queryObject = getSession().createQuery(queryString);
			 return queryObject.list();
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}
	
    public AssetFisico merge(AssetFisico detachedInstance) {
        log.debug("merging AssetFisico instance");
        try {
            AssetFisico result = (AssetFisico) getSession()
                    .merge(detachedInstance);
            log.debug("merge successful");
            return result;
        } catch (RuntimeException re) {
            log.error("merge failed", re);
            throw re;
        }
    }

    public void attachDirty(AssetFisico instance) {
        log.debug("attaching dirty AssetFisico instance");
        try {
            getSession().saveOrUpdate(instance);
            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void attachClean(AssetFisico instance) {
        log.debug("attaching clean AssetFisico instance");
        try {
                      	getSession().buildLockRequest(LockOptions.NONE).lock(instance);
          	            log.debug("attach successful");
        } catch (RuntimeException re) {
            log.error("attach failed", re);
            throw re;
        }
    }
    
    public void nuovoAsset (String dati){
    	
    	// inserimenti dei dati all'interno dell Asset
    	log.debug("inserimento dell'asset all'interno del DB");
          try {
             Query queryObject = getSession().createQuery(dati);
            int q= queryObject.executeUpdate();
             
          } catch (RuntimeException re) {
             log.error("find by property name failed", re);
             throw re;
          }
	
    }
}