package lk.ijse.pos.dao.impl;

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
    public boolean addOrder(Orders orders) throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        String sql = "INSERT INTO Orders VALUES (?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, orders.getId());
        pstm.setObject(2, orders.getDate());
        pstm.setObject(3, orders.getCustomerId());
        return  pstm.executeUpdate()>0;


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
