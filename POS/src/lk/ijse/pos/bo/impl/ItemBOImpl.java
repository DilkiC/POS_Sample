package lk.ijse.pos.bo.impl;

import lk.ijse.pos.bo.custom.ItemBO;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.dto.ItemDTO;
import lk.ijse.pos.entity.Customer;
import lk.ijse.pos.entity.Item;

import java.util.ArrayList;

public class ItemBOImpl implements ItemBO {
    //ItemDAO dao=new ItemDAOImpl();
    ItemDAO dao= (ItemDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.ITEM);

    public boolean addItem(ItemDTO item) throws Exception {
        return dao.add(new Item(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand()));

    }



    public boolean updateItem(ItemDTO item) throws Exception {
        return dao.add(new Item(item.getCode(),item.getDescription(),item.getUnitPrice(),item.getQtyOnHand()));


    }
    public boolean deleteItem(String id) throws Exception {
        return dao.delete(id);

    }
    public ItemDTO searchItem(String id) throws Exception {
        Item search=dao.search(id);
        return new ItemDTO(search.getCode(),search.getDescription(),search.getUnitPrice(),search.getQtyOnHand());


    }
    public ArrayList<ItemDTO> getAllItem() throws Exception {
        ArrayList<Item>all= dao.getAll();
        ArrayList<ItemDTO>allItem= new ArrayList<>();
        for (Item i:all){
            ItemDTO dto=new ItemDTO(i.getCode(),i.getDescription(),i.getUnitPrice(),i.getQtyOnHand());
            allItem.add(dto);
        }
        return allItem;

    }
    public boolean updateItemQtyOnHand(String code,int qty) throws Exception {
        return dao.updateItemQtyOnHand(code,qty);
    }
}
