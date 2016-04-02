package basaki.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import basaki.data.Address;
import basaki.data.Customer;
import basaki.service.CustomerService;

/**
 * 
 * <tt>CustomerServiceImpl</tt> is version 2 of the business service class
 * implementing <tt>CustomerService</tt> interface. It saves customers in a
 * <tt>HashMap</tt>.
 * <p/>
 * 
 * @author Indra Basak
 * 
 */
public class CustomerServiceImplv2 implements CustomerService {

    private int counter = 1;
    private Map<Integer, Customer> customers = new HashMap<Integer, Customer>();

    public CustomerServiceImplv2() {
	Customer cust = new Customer();
	cust.setId(counter);
	cust.setFirstName("2Robert");
	cust.setLastName("Land");
	Address addr = new Address();
	addr.setStreet("2486 Maxwell Farm Road");
	addr.setCity("Waynesboro");
	addr.setState("VA");
	addr.setZipCode("22980");
	cust.setAddress(addr);
	customers.put(cust.getId(), cust);
	counter++;

	cust = new Customer();
	cust.setId(counter);
	cust.setFirstName("2James");
	cust.setLastName("Brenner");
	addr = new Address();
	addr.setStreet("585 Pennsylvania Avenue");
	addr.setCity("New Brunswick");
	addr.setState("NJ");
	addr.setZipCode("08901");
	cust.setAddress(addr);
	customers.put(cust.getId(), cust);
	counter++;

	cust = new Customer();
	cust.setId(counter);
	cust.setFirstName("2Billy");
	cust.setLastName("Jones");
	addr = new Address();
	addr.setStreet("1201 Still Pastures Drive");
	addr.setCity("Columbia");
	addr.setState("SC");
	addr.setZipCode("29210");
	cust.setAddress(addr);
	customers.put(cust.getId(), cust);
	counter++;
    }

    @Override
    public Customer getCustomer(int id) {
	System.out.println("getCustomer() - " + customers.get(id));
	return customers.get(id);
    }

    @Override
    public List<Customer> getCustomers() {
	System.out.println("getCustomers()");
	return new ArrayList<Customer>(customers.values());
    }

    @Override
    public Customer createCustomer(Customer customer) {
	Customer cust = null;
	if (customer != null) {
	    cust = new Customer();
	    cust.setId(counter);
	    counter++;
	    copy(customer, cust);
	    customers.put(cust.getId(), cust);
	}

	return cust;
    }

    @Override
    public Customer deleteCustomer(int id) {
	return customers.remove(id);
    }

    @Override
    public Customer updateCustomer(int id, Customer customer) {
	Customer cust = customers.get(id);
	if (cust != null && customer != null) {
	    copy(customer, cust);
	}

	return cust;
    }

    @Override
    public Customer updatePartialCustomer(int id, Customer customer) {
	Customer cust = customers.get(id);
	if (cust != null && customer != null) {
	    cust.setFirstName(customer.getFirstName() != null ? customer.getFirstName() : cust.getFirstName());
	    cust.setLastName(customer.getLastName() != null ? customer.getLastName() : cust.getLastName());
	    if (cust.getAddress() == null) {
		Address addr = new Address();
		cust.setAddress(addr);
	    }

	    if (customer.getAddress() != null) {
		cust.getAddress().setStreet(customer.getAddress().getStreet() != null
			? customer.getAddress().getStreet() : cust.getAddress().getStreet());
		cust.getAddress().setCity(customer.getAddress().getCity() != null ? customer.getAddress().getCity()
			: cust.getAddress().getCity());
		cust.getAddress().setState(customer.getAddress().getState() != null ? customer.getAddress().getState()
			: cust.getAddress().getState());
		cust.getAddress().setZipCode(customer.getAddress().getZipCode() != null
			? customer.getAddress().getZipCode() : cust.getAddress().getZipCode());
	    }
	}

	return cust;
    }

    private void copy(Customer from, Customer to) {
	to.setFirstName(from.getFirstName());
	to.setLastName(from.getLastName());
	Address addr = to.getAddress();
	if (addr == null) {
	    addr = new Address();
	    to.setAddress(addr);
	}

	if (from.getAddress() != null) {
	    addr.setStreet(from.getAddress().getStreet());
	    addr.setCity(from.getAddress().getCity());
	    addr.setState(from.getAddress().getState());
	    addr.setZipCode(from.getAddress().getZipCode());
	}
    }

    private void print() {
	System.out.println("*** print() - 1");
	for (int key : customers.keySet()) {
	    System.out.println("*** print() - 2");
	    System.out.println(customers.get(key));
	}
	System.out.println("*** print() - 3");
    }

    public static void main(String[] args) {
	CustomerServiceImplv2 impl = new CustomerServiceImplv2();
	impl.print();
	System.out.println(impl.getCustomer(1));
    }

}
