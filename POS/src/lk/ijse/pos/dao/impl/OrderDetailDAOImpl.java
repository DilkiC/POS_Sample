package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.OrderDetailDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.OrderDetails;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class OrderDetailDAOImpl implements OrderDetailDAO {

    @Override
    public boolean addOrderDetails(OrderDetails orderDetails) throws Exception {


        String sql="INSERT INTO OrderDetails VALUES (?,?,?,?)";

        return CrudUtil.executeUpdate(sql,orderDetails.getOrderId(),orderDetails.getItemCode(),orderDetails.getQty(),orderDetails.getUnitPrice());

    }
}
