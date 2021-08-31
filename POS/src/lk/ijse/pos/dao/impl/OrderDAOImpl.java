package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.OrderDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/

public class OrderDAOImpl implements OrderDAO {
    @Override
    public boolean add(Orders orders) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO Orders VALUES (?,?,?)");

    }



    @Override
    public boolean delete(String s) throws Exception {
        throw new UnsupportedOperationException("not yet");
    }

    @Override
    public boolean update(Orders orders) throws Exception {
        throw new UnsupportedOperationException("not yet");
    }

    @Override
    public Orders search(String s) throws Exception {
        throw new UnsupportedOperationException("not yet");
    }

    @Override
    public ArrayList<Orders> getAll() throws Exception {
        throw new UnsupportedOperationException("not yet");
    }


//
//    public boolean addOrder(Orders orders) throws Exception {
//return CrudUtil.executeUpdate("INSERT INTO Orders VALUES (?,?,?)");
//    }
//
//    public boolean deleteOrder() {
//        throw new UnsupportedOperationException("This feature is not supported yet");
//    }
//
//    public boolean updateOrder() {
//        throw new UnsupportedOperationException("This feature is not supported yet");
//    }
//
//    public Orders searchOrder() {
//        throw new UnsupportedOperationException("This feature is not supported yet");
//    }
//
//    public ArrayList<Orders> getAllOrders() {
//        throw new UnsupportedOperationException("This feature is not supported yet");
//    }

}
