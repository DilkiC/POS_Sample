package lk.ijse.pos.bo.custom;

import lk.ijse.pos.bo.SuperBO;
import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Item;

import java.util.ArrayList;

public interface ItemBO extends SuperBO {
    public boolean addItem(ItemDTO item) throws Exception ;

    public boolean updateItem(ItemDTO item) throws Exception ;

    public boolean deleteItem(String id) throws Exception ;

    public ItemDTO searchItem(String id) throws Exception ;

    public ArrayList<ItemDTO> getAllItem() throws Exception ;

    public boolean updateItemQtyOnHand(String code,int qty) throws Exception ;

}
