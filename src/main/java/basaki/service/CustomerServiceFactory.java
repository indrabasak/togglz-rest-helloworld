package basaki.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.togglz.spring.proxy.FeatureProxyFactoryBean;

/**
 * 
 * <tt>CustomerServiceFactory</tt> is a factory class which returns an
 * implementation of a <tt>CustomerService</tt>
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
@Service("customerServiceFactory")
public class CustomerServiceFactory {

    // Reference to the Togglz proxy factory bean that delegates the
    // invocation to one of two target customer service implementations
    // depending on that state of the rest service version
    // feature
    @Autowired
    private FeatureProxyFactoryBean factory;

    /**
     * Retrieves the customer service implementation from the Togglz factory
     * bean based on the state of the Togglz rest service feature.
     * 
     * @return the customer service
     */
    public CustomerService getService() {
	CustomerService service = null;
	if (factory != null) {
	    try {
		service = (CustomerService) factory.getObject();
		System.out.println("##################### FOUND CUSTOMER SERVICE");
		System.out.println(service);
	    } catch (Exception e) {
		System.out.println("##################### NO CUSTOMER SERVICE");
		e.printStackTrace();
	    }

	} else {
	    System.out.println("##################### FACTORY is NULL");
	}

	return service;
    }
}
