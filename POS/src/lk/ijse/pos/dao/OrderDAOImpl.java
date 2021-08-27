package lk.ijse.pos.dao;

import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Customer;
import lk.ijse.pos.model.Item;
import lk.ijse.pos.model.Orders;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class OrderDAOImpl {

   /* public Customer getCustName (String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Customer WHERE id=?");
        pstm.setObject(1, id);
        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {

            return new Customer(rst.getString(1), rst.getString(2), rst.getString(3));
        }
        return null;
    }

    public Item getItemsDetail(String id) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("SELECT * FROM Item WHERE code = ?");
        pstm.setObject(1, id);

        ResultSet rst = pstm.executeQuery();

        if (rst.next()) {


            return new Item(rst.getString(1), rst.getString(2), rst.getBigDecimal(3), rst.getInt(4));

        }
        return null;
    }


    public boolean addOrder(Orders orders) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        connection.setAutoCommit(false);
        String sql = "INSERT INTO Orders VALUES (?,?,?)";
        PreparedStatement pstm = connection.prepareStatement(sql);
        pstm.setObject(1, orders.getId());
        pstm.setObject(2, orders.getDate());
        pstm.setObject(3, orders.getCustomerId());
        int affectedRows = pstm.executeUpdate();

        if (affectedRows == 0) {
            connection.rollback();
           // return;
        }

        return pstm.executeUpdate()>0;
    }*/

   /* public boolean deleteOrder(){

    }
    public boolean updateOrder(){

    }
    public Orders searchOrder(){

    }
    public ArrayList<Orders> getAllOrders(){

    }*/

}
