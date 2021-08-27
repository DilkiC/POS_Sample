package lk.ijse.pos.dao;

import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.OrderDetails;
import lk.ijse.pos.view.tblmodel.OrderDetailTM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class OrderDetailDAOImpl {
    /*public boolean addOrderDetail(OrderDetails orderDetails) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("INSERT INTO OrderDetails VALUES (?,?,?,?)");

        OrderDetailTM[] olOrderDetails=null;
        for (OrderDetailTM orderDetail : olOrderDetails) {
            pstm.setObject(1, orderDetails.getOrderId());
            pstm.setObject(2, orderDetails.getItemCode());
            pstm.setObject(3, orderDetails.getQty());
            pstm.setObject(4, orderDetails.getUnitPrice());
            int affectedRows = pstm.executeUpdate();

            if (affectedRows == 0) {
                connection.rollback();
                //return;
            }
            int qtyOnHand = 0;

            Statement stm = connection.createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM Item WHERE code='" + orderDetail.getItemCode() + "'");
            if (rst.next()) {
                qtyOnHand = rst.getInt(4);
            }
            PreparedStatement pstm2 = connection.prepareStatement("UPDATE Item SET qtyOnHand=? WHERE code=?");
            pstm2.setObject(1, qtyOnHand - orderDetail.getQty());
            pstm2.setObject(2, orderDetail.getItemCode());

            affectedRows = pstm2.executeUpdate();

            if (affectedRows == 0) {
                connection.rollback();
                //return;
            }

        }
        return pstm.executeUpdate()>0;
    }*/
}
