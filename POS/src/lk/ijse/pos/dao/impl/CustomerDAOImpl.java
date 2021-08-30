package lk.ijse.pos.dao.impl;

import lk.ijse.pos.dao.CrudUtil;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.model.Customer;

import java.sql.ResultSet;
import java.util.ArrayList;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public boolean add(Customer customer) throws Exception {

        String sql="INSERT INTO Customer VALUES (?,?,?,?)";
        return CrudUtil.executeUpdate(sql,customer.getcID(),customer.getName(),customer.getAddress());

    }

    @Override
    public boolean update(Customer customer) throws Exception {

        String sql="UPDATE Customer SET name=?, address=? WHERE id=?";
        return CrudUtil.executeUpdate(sql,customer.getName(),customer.getAddress(),customer.getcID());

    }

    @Override
    public boolean delete(String s) throws Exception {

        String sql="DELETE FROM Customer WHERE id=?";
        return CrudUtil.executeUpdate(sql,s);

    }

    @Override
    public Customer search(String s) throws Exception {

        String sql="select * from Customer where id=?";
        ResultSet rst=CrudUtil.executeQuery(sql,s);
        if(rst.next()){
            return new Customer(rst.getString(1),rst.getString(2),rst.getString(3));

        }
        return null;

    }

    @Override
    public ArrayList<Customer> getAll() throws Exception {

        String sql= "SELECT * FROM Customer";

        ResultSet rst = CrudUtil.executeQuery(sql);
        ArrayList<Customer> allCustomers = new ArrayList<>();
        while (rst.next()) {
            allCustomers.add(new Customer(rst.getString(1), rst.getString(2), rst.getString(3)));
        }
        return allCustomers;

    }


   /* @Override
    public boolean addCustomer(Customer customer) throws Exception {




 }
    @Override
    public boolean updateCustomer(Customer customer) throws Exception {


    }
    @Override
    public boolean deleteCustomer(String id) throws Exception {


    }
    @Override
    public Customer searchCustomer(String id) throws Exception {


    }
    @Override
    public ArrayList<Customer> getAllCustomer() throws Exception {

    }*/

    //..................................................



}
