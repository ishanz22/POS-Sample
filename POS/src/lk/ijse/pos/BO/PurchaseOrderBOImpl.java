package lk.ijse.pos.BO;

import lk.ijse.pos.dao.CustomerDAO;
import lk.ijse.pos.dao.ItemDAO;
import lk.ijse.pos.dao.OrderDAO;
import lk.ijse.pos.dao.impl.CustomerDAOImpl;
import lk.ijse.pos.dao.impl.ItemDAOImpl;
import lk.ijse.pos.dao.impl.OrderDAOImpl;
import lk.ijse.pos.dao.impl.OrderDetailsDAO;
import lk.ijse.pos.model.Orders;

import java.util.ArrayList;

public class PurchaseOrderBOImpl {
    private final CustomerDAO customerDAO = new CustomerDAOImpl();
    private final ItemDAO itemDAO = new ItemDAOImpl();
    private final OrderDAO orderDAO = new OrderDAOImpl();
    private final OrderDetailsDAO orderDetailsDAO = new OrderDetailsDAO();

    public boolean purchaseOrder(Orders order, ArrayList<OrderDetailsDAO> orderDetails){

    }
}
