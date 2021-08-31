package lk.ijse.pos.bo.custom;

import lk.ijse.pos.bo.SuperBO;
import lk.ijse.pos.dto.OrdersDTO;
import lk.ijse.pos.entity.OrderDetails;
import lk.ijse.pos.entity.Orders;

import java.util.ArrayList;

public interface OrderBO extends SuperBO {
    public boolean placeOrder(OrdersDTO ordersDTO) throws Exception;
}
