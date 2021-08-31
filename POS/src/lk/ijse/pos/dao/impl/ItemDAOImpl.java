package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.ItemDAO;
import lk.ijse.pos.db.DBConnection;
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
public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean add(Item item) throws Exception {
            return CrudUtil.executeUpdate("INSERT INTO Item VALUES (?,?,?,?)");

    }

    @Override
    public boolean update(Item item) throws Exception {
               return CrudUtil.executeUpdate("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?");

    }

    @Override
    public boolean delete(String id) throws Exception {
           return CrudUtil.executeUpdate("DELETE FROM Item WHERE code=?");

    }

    @Override
    public Item search(String code) throws Exception {
        ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item where code=?", code);

        if (rst.next()) {
            return new Item(rst.getString(1),
                    rst.getString(2),
                    rst.getBigDecimal(3),
                    rst.getInt(4));
        }
        return null;
    }

    @Override
    public boolean updateItemQtyOnHand(String code, int qtyOnHand) throws Exception {
              return CrudUtil.executeUpdate("UPDATE Item SET qtyOnHand=? WHERE code=?");

    }

    @Override
    public ArrayList<Item> getAll() throws Exception {
               ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item");
        ArrayList<Item> allItems = new ArrayList<>();
        while (rst.next()) {
            Item item = new Item(rst.getString(1),
                    rst.getString(2),
                    rst.getBigDecimal(3),
                    rst.getInt(4));
            allItems.add(item);
        }
        return allItems;
    }
    }

//    public ItemDAOImpl() throws Exception {
//    }
//
//    public boolean addItem(Item item) throws Exception {
//    return CrudUtil.executeUpdate("INSERT INTO Item VALUES (?,?,?,?)");
//    }
//
//    public boolean deleteItem(String code) throws Exception {
//      return CrudUtil.executeUpdate("DELETE FROM Item WHERE code=?");
//    }
//
//
//    public boolean updateItem(Item item) throws Exception {
//       return CrudUtil.executeUpdate("UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?");
//    }
//
//
//    public boolean updateItemQtyOnHand(String code,int qtyOnHand) throws Exception {
//       return CrudUtil.executeUpdate("UPDATE Item SET qtyOnHand=? WHERE code=?");
//    }
//
//
//
//    public Item searchItem(String code) throws Exception {
//       ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item where code=?", code);
//
//        if (rst.next()) {
//            return new Item(rst.getString(1),
//                    rst.getString(2),
//                    rst.getBigDecimal(3),
//                    rst.getInt(4));
//        }
//        return null;
//    }
//
//    public ArrayList<Item> getAllItems() throws Exception {
//       ResultSet rst = CrudUtil.executeQuery("SELECT * FROM Item");
//        ArrayList<Item> allItems = new ArrayList<>();
//        while (rst.next()) {
//            Item item = new Item(rst.getString(1),
//                    rst.getString(2),
//                    rst.getBigDecimal(3),
//                    rst.getInt(4));
//            allItems.add(item);
//        }
//        return allItems;
//    }

