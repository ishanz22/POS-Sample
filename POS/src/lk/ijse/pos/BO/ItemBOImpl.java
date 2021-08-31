package lk.ijse.pos.BO;

import lk.ijse.pos.dao.CustomerDAO;
import lk.ijse.pos.dao.ItemDAO;
import lk.ijse.pos.dao.impl.CustomerDAOImpl;
import lk.ijse.pos.dao.impl.ItemDAOImpl;
import lk.ijse.pos.model.Customer;
import lk.ijse.pos.model.Item;

import java.util.ArrayList;

public class ItemBOImpl {
    ItemDAO itemDAO = new ItemDAOImpl();


    public boolean addItem(Item item) throws Exception{
       return itemDAO.add(item);

    }
    public boolean deleteItem(String id ) throws Exception {
        return itemDAO.delete(id);
    }
    public boolean updateItem(Item item) throws Exception {
            return itemDAO.update(item);
    }
    public ArrayList<Item> getAllItems() throws Exception {
        return itemDAO.getAll();
    }
}
