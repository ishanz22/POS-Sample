package lk.ijse.pos.dao;

import lk.ijse.pos.model.Orders;

import java.util.ArrayList;

public interface OrderDAO {

    public boolean addOrder(Orders orders) throws Exception;

//    public boolean updateOrder(Orders orders);
//
//    public boolean deleteOrder(String id);
//
//    public boolean searchOrder(String id);
//
//    public ArrayList<Orders> getAllOrders();
}
