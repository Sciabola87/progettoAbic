package abic.tas.assetTicket.hibernate;



/**
 * Login entity. @author MyEclipse Persistence Tools
 */
public class Login extends AbstractLogin implements java.io.Serializable {

    // Constructors

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	/** default constructor */
    public Login() {
    }

    
    /** full constructor */
    public Login(String username, String password) {
        super(username, password);        
    }
   
}
