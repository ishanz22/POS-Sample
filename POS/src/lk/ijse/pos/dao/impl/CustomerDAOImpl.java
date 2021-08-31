package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.CustomerDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Customer;
import lk.ijse.pos.model.Item;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean add(Customer customer) throws Exception {
             return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?)",customer.getcID(),customer.getName(),customer.getAddress());

    }

    @Override
    public boolean delete(String s) throws Exception {
                return CrudUtil.executeUpdate("DELETE FROM Customer WHERE id=?");

    }

    @Override
    public boolean update(Customer customer) throws Exception {
               return CrudUtil.executeUpdate("INSERT INTO Customer VALUES(?,?,?,?)",customer.getcID(),customer.getName(),customer.getAddress());

    }

    @Override
    public Customer search(String s) throws Exception {
        ResultSet rst = CrudUtil.executeQuery( "SELECT * FROM Customer where id=?",s);
        if (rst.next()) {
            return new Customer(rst.getString("id"), rst.getString("name"), rst.getString("address"));
        }
        return null;
    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Customer");
        ArrayList<Customer> alCustomers = new ArrayList<>();
        while (rst.next()) {
            Customer customer = new Customer(rst.getString(1), rst.getString(2), rst.getString(3));
            alCustomers.add(customer);
        }
        return alCustomers;
    }
    }

