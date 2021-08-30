package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.OrderDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Customer;
import lk.ijse.pos.model.Item;
import lk.ijse.pos.model.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public boolean addOrder(Orders orders) throws Exception {
        String sql = "INSERT INTO Orders VALUES (?,?,?)";
        return CrudUtil.executeUpdate(sql,orders.getId(),orders.getDate(),orders.getCustomerId());



    }

   /* public boolean deleteOrder(){

    }
    public boolean updateOrder(){

    }
    public Orders searchOrder(){

    }
    public ArrayList<Orders> getAllOrders(){

    }*/

}
