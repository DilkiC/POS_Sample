package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.CustomerDAO;
import lk.ijse.pos.db.DBConnection;
import lk.ijse.pos.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {

    @Override
    public boolean addCustomer(Customer customer) throws Exception {

        /*Connection connection = DBConnection.getInstance().getConnection();

        PreparedStatement pstm = connection.prepareStatement("INSERT INTO Customer VALUES (?,?,?,?)");

        pstm.setObject(1, customer.getcID());
        pstm.setObject(2, customer.getName());
        pstm.setObject(3, customer.getAddress());
        //pstm.setObject(4, 0);
        return pstm.executeUpdate()>0;*/

        String sql="INSERT INTO Customer VALUES (?,?,?,?)";
        return CrudUtil.executeUpdate(sql,customer.getcID(),customer.getName(),customer.getAddress());

    }
    @Override
    public boolean updateCustomer(Customer customer) throws Exception {
        String sql="UPDATE Customer SET name=?, address=? WHERE id=?";
        return CrudUtil.executeUpdate(sql,customer.getName(),customer.getAddress(),customer.getcID());


    }
    @Override
    public boolean deleteCustomer(String id) throws Exception {
        String sql="DELETE FROM Customer WHERE id=?";
        return CrudUtil.executeUpdate(sql,id);


    }
    @Override
    public Customer searchCustomer(String id) throws Exception {
        String sql="select * from Customer where id=?";
        ResultSet rst=CrudUtil.executeQuery(sql,id);
        if(rst.next()){
            return new Customer(rst.getString(1),rst.getString(2),rst.getString(3));

        }
        return null;


    }
    @Override
    public ArrayList<Customer> getAllCustomer() throws Exception {
       String sql= "SELECT * FROM Customer";

        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Customer> allCustomers = new ArrayList<>();
        while (rst.next()) {
            allCustomers.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return allCustomers;

    }

    //..................................................



}
