package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.OrderDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class OrderDetailsDAO implements lk.ijse.pos.dao.OrderDetailsDAO {


    @Override
    public boolean add(Object o) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO OrderDetail VALUES (?,?,?,?)");

    }

    @Override
    public boolean delete(Object o) throws Exception {
        throw new UnsupportedOperationException("not yet");

    }

    @Override
    public boolean update(Object o) throws Exception {
        throw new UnsupportedOperationException("not yet");

    }

    @Override
    public Object search(Object o) throws Exception {
        throw new UnsupportedOperationException("not yet");

    }

    @Override
    public ArrayList getAll() throws Exception {
        throw new UnsupportedOperationException("not yet");

    }


//    public boolean addOrderDetails(OrderDetails oDetails) throws Exception {
//        return CrudUtil.executeUpdate("INSERT INTO OrderDetail VALUES (?,?,?,?)");
//    }
}