package lk.ijse.pos.bo.custom;

import lk.ijse.pos.model.OrderDetails;
import lk.ijse.pos.model.Orders;

import java.util.ArrayList;

public interface OrderBO {
    public boolean placeOrder(Orders order, ArrayList<OrderDetails> orderDetails) throws Exception;
}
