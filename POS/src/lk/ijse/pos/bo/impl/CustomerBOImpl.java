package lk.ijse.pos.bo.impl;

import lk.ijse.pos.bo.custom.CustomerBO;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.dao.custom.ItemDAO;
import lk.ijse.pos.dao.impl.CustomerDAOImpl;
import lk.ijse.pos.model.Customer;

import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO dao= (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);


    public boolean addCustomer(Customer customer) throws Exception {
        return dao.add(customer);

    }
    public boolean updateCustomer(Customer customer) throws Exception {
        return dao.update(customer);

    }
    public boolean deleteCustomer(String id) throws Exception {
        return dao.delete(id);

    }
    public Customer searchCustomer(String id) throws Exception {
        return dao.search(id);

    }
    public ArrayList<Customer>getAllCustomer() throws Exception {
        return dao.getAll();

    }

}
