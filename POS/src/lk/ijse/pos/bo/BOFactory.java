package lk.ijse.pos.bo;

import lk.ijse.pos.bo.impl.CustomerBOImpl;
import lk.ijse.pos.bo.impl.ItemBOImpl;
import lk.ijse.pos.bo.impl.OrderBOImpl;

public class BOFactory {

    private static BOFactory boFactory;

    private BOFactory(){

    }

    public static BOFactory getInstance(){
        if(boFactory==null){
            return boFactory=new BOFactory();
        }else {
            return boFactory;
        }
    }

    public enum BOTypes{
        CUSTOMER,ITEM,ORDER;
    }

    public SuperBO getBO(BOTypes boTypes){
        switch (boTypes){
            case CUSTOMER:
                return new CustomerBOImpl();
            case ITEM:
                return new ItemBOImpl();
            case ORDER:
                return new OrderBOImpl();
            default:
                return null;
        }
    }

}
