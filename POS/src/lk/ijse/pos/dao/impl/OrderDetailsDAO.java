package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.model.OrderDetails;

/**
 * @author : Sanu Vithanage
 * @since : 0.1.0
 **/
public class OrderDetailsDAO implements lk.ijse.pos.dao.OrderDetailsDAO {


    public boolean addOrderDetails(OrderDetails oDetails) throws Exception {
        return CrudUtil.executeUpdate("INSERT INTO OrderDetail VALUES (?,?,?,?)");
    }
}