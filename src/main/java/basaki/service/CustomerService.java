package basaki.service;

import java.util.List;

import basaki.data.Customer;

/**
 * 
 * <tt>CustomerService</tt> is an interface exposing the operations that can be
 * performed on a customer data model.
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
public interface CustomerService {

    Customer getCustomer(int id);

    List<Customer> getCustomers();

    Customer createCustomer(Customer customer);

    Customer deleteCustomer(int id);

    Customer updateCustomer(int id, Customer customer);

    Customer updatePartialCustomer(int id, Customer customer);

}
