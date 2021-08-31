package lk.ijse.pos.BO;

import lk.ijse.pos.dao.CustomerDAO;
import lk.ijse.pos.dao.impl.CustomerDAOImpl;
import lk.ijse.pos.model.Customer;

import java.util.ArrayList;

public class CustomerBOImpl {

    CustomerDAOImpl customerDAO = new CustomerDAOImpl();

    public boolean AddCustomer(Customer customer) throws Exception {
        return  customerDAO.add(customer);

    }
    public boolean deleteCustomer(String id) throws Exception {
        return  customerDAO.delete(id);
    }
    public boolean updateCustomer(Customer customer) throws Exception {
        return customerDAO.update(customer);
    }
    public Customer searchCustomer(String id) throws Exception {
        return customerDAO.search(id);
    }
    public ArrayList<Customer> getAllCustomers() throws Exception {
        return customerDAO.getAll();
    }
}
