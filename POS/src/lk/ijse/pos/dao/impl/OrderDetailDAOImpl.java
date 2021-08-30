package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.custom.OrderDetailDAO;
import lk.ijse.pos.model.OrderDetails;

import java.util.ArrayList;

public class OrderDetailDAOImpl implements OrderDetailDAO {
    @Override
    public boolean add(OrderDetails orderDetails) throws Exception {
        String sql="INSERT INTO OrderDetails VALUES (?,?,?,?)";

        return CrudUtil.executeUpdate(sql,orderDetails.getOrderId(),orderDetails.getItemCode(),orderDetails.getQty(),orderDetails.getUnitPrice());

    }

    @Override
    public boolean update(OrderDetails orderDetails) {
        return false;
    }

    @Override
    public boolean delete(String s) {
        return false;
    }

    @Override
    public OrderDetails search(String s) {
        return null;
    }

    @Override
    public ArrayList<OrderDetails> getAll() {
        return null;
    }


}
