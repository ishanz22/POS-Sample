package lk.ijse.pos.dao;

import lk.ijse.pos.model.Customer;
import java.util.ArrayList;

public interface CustomerDAO {

    boolean addCustomer(Customer customer) throws Exception;

     boolean updateCustomer(Customer customer) throws Exception;

    public boolean deleteCustomer(String id) throws Exception;

    public Customer searchCustomer(String id) throws Exception;

    public ArrayList<Customer> getAllCustomers() throws Exception;
}
