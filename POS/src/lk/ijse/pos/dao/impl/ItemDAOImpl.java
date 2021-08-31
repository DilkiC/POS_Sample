package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.entity.Item;

import java.sql.ResultSet;
import java.util.ArrayList;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public boolean add(Item item) throws Exception {

        String sql="INSERT INTO Item VALUES (?,?,?,?)";

        return CrudUtil.executeUpdate(sql,item.getCode(),item.getDescription(),item.getQtyOnHand(),item.getUnitPrice());

    }

    @Override
    public boolean update(Item item) throws Exception {

        String sql="UPDATE Item SET description=?, unitPrice=?, qtyOnHand=? WHERE code=?";
        return CrudUtil.executeUpdate(sql,item.getDescription(),item.getQtyOnHand(),item.getUnitPrice(),item.getCode());

    }

    @Override
    public boolean delete(String s) throws Exception {

        String sql="DELETE FROM Item WHERE code=?";
        return CrudUtil.executeUpdate(sql,s);
    }

    @Override
    public Item search(String s) throws Exception {

        String sql = "select * from Item where code=?";


        ResultSet rst = CrudUtil.executeQuery(sql);
        if (rst.next()) {
            return new Item(rst.getString(1), rst.getString(2), rst.getBigDecimal(3), rst.getInt(4));
        }
        return null;

    }

    @Override
    public ArrayList<Item> getAll() throws Exception {

        String sql="SELECT * FROM Item";


        ResultSet rst = CrudUtil.executeQuery(sql);

        ArrayList<Item> alItems = new ArrayList<>();

        while (rst.next()) {

            Item item = new Item(rst.getString(1),
                    rst.getString(2),
                    rst.getBigDecimal(3),
                    rst.getInt(4));

            alItems.add(item);
        }
        return alItems;

    }

    @Override
    public boolean updateItemQtyOnHand(String code, int qtyOnHand) throws Exception {
        String sql="UPDATE Item SET qtyOnHand=? WHERE code=?";
        return CrudUtil.executeUpdate(sql,code,qtyOnHand);

    }




}
