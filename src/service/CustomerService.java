package service;


import model.Customer;
import java.util.Collection;
import java.util.HashSet;

public class CustomerService {

    //Creates are map of all the customers
    public Collection <Customer> setOfCustomers = new HashSet<Customer>();

    //Due to project specifications we implement a Single Pattern, so we can provide only one instance of it.
    //Helps maintain data consistency.
    private static CustomerService customerService = null;

    private CustomerService(){}

    public static CustomerService getInstance(){
        if (null == customerService){
            customerService = new CustomerService();
        }
        return null;
    }

    //Create a new object when customer is being created
    public void addCustomer(String email, String firstName, String lastName) {

        Customer newCustomer = new Customer(email, firstName, lastName);

    //Add customer to collection of customers
        setOfCustomers.add(newCustomer);
    }

    //Retrieve a customer from the map
        public Customer getCustomer(String customerEmail){

        for (Customer customer : setOfCustomers){

            if((customer.getEmail()).equals(customerEmail)){
                return customer;
            }

        }
        return null;

    }
    //Return all of the customers should they be in customer collection
    public Collection <Customer> getAllCustomers(){
        return setOfCustomers;
    }

}
