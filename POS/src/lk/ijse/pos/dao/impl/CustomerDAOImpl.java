package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.CustomerDAO;
import lk.ijse.pos.model.Customer;

import java.sql.ResultSet;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class CustomerDAOImpl implements CustomerDAO {



    public boolean addCustomer(Customer customer) throws Exception {
      /*  Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?)");
        pstm.setObject(1, customer.getcID());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        pstm.setObject(4, 0);
        return (pstm.executeUpdate() > 0);

       */
       return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?)",customer.getcID(),customer.getName(),customer.getAddress());

    }

    public boolean updateCustomer(Customer customer) throws Exception {
      return CrudUtil.executeUpdate("UPDATE Customer SET name=?, address=? WHERE id=?");
    }

    public boolean deleteCustomer(String id) throws Exception {
        return CrudUtil.executeUpdate("DELETE FROM Customer WHERE id=?");
    }

    public Customer searchCustomer(String id) throws Exception {

        ResultSet rst = CrudUtil.executeQuery( "SELECT * FROM Customer where id=?",id);
        if (rst.next()) {
            return new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"));
        }
        return null;
    }

    public ArrayList<Customer> getAllCustomers() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<Customer> alCustomers = new ArrayList<>();
        while (rst.next()) {
            Customer customer = new Customer(rst.getString(1), rst.getString(2), rst.getString(3));
            alCustomers.add(customer);
        }
        return alCustomers;
    }

}
