package lk.ijse.pos.dao;

import lk.ijse.pos.model.Item;

import java.util.ArrayList;

public interface ItemDAO extends SuperDAO<Item,String>{


     boolean updateItemQtyOnHand(String code,int qtyOnHand) throws Exception;

}
