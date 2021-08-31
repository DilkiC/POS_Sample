package lk.ijse.pos.dao;

import lk.ijse.pos.dao.impl.*;

public class DAOFactory {

    private static DAOFactory daoFactory;

    private DAOFactory(){


    }

    public static DAOFactory getDaoFactory(){
        if(daoFactory==null){
            return daoFactory=new DAOFactory();
        }else {
            return daoFactory;
        }
    }

    public enum DAOTypes{
        CUSTOMER,ITEM,ORDER,ORDERDETAILS,QUERY
    }

    public SuperDAO getDAO(DAOTypes daoTypes){
        switch (daoTypes){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case ITEM:
                return new ItemDAOImpl();
            case ORDER:
               return new OrderDAOImpl();
            case ORDERDETAILS:
                return new OrderDetailDAOImpl();
            case QUERY:
                return new QueryDAOImpl();
            default:
                return null;


        }

    }



}
