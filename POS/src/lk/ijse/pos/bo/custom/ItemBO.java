package lk.ijse.pos.bo.custom;

import lk.ijse.pos.bo.SuperBO;
import lk.ijse.pos.model.Item;

import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    public boolean addItem(Item item) throws Exception ;

    public boolean updateItem(Item item) throws Exception ;

    public boolean deleteItem(String id) throws Exception ;

    public Item searchItem(String id) throws Exception ;

    public ArrayList<Item> getAllItem() throws Exception ;

    public boolean updateItemQtyOnHand(String code,int qty) throws Exception ;

}
