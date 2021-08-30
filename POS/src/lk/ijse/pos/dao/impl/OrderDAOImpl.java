package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.custom.OrderDAO;
import lk.ijse.pos.model.Orders;

import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public boolean add(Orders orders) throws Exception {

        String sql = "INSERT INTO Orders VALUES (?,?,?)";
        return CrudUtil.executeUpdate(sql,orders.getId(),orders.getDate(),orders.getCustomerId());

    }

    @Override
    public boolean update(Orders orders) {

        throw new UnsupportedOperationException();
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public Orders search(String s) {
        return null;
    }

    @Override
    public ArrayList<Orders> getAll() {
        return null;
    }


}
