package lk.ijse.pos.bo.impl;

import lk.ijse.pos.bo.custom.CustomerBO;
import lk.ijse.pos.dao.DAOFactory;
import lk.ijse.pos.dao.custom.CustomerDAO;
import lk.ijse.pos.dto.CustomerDTO;
import lk.ijse.pos.entity.Customer;

import java.util.ArrayList;

public class CustomerBOImpl implements CustomerBO {
    CustomerDAO dao= (CustomerDAO) DAOFactory.getDaoFactory().getDAO(DAOFactory.DAOTypes.CUSTOMER);


    public boolean addCustomer(CustomerDTO customer) throws Exception {
        return dao.add(new Customer(customer.getcID(),customer.getName(),customer.getAddress()));

    }
    public boolean updateCustomer(CustomerDTO customer) throws Exception {
        return dao.update(new Customer(customer.getcID(),customer.getName(),customer.getAddress()));

    }
    public boolean deleteCustomer(String id) throws Exception {
        return dao.delete(id);

    }
    public CustomerDTO searchCustomer(String id) throws Exception {
        Customer search=dao.search(id);
        return new CustomerDTO(search.getcID(),search.getName(),search.getAddress());

    }
    public ArrayList<CustomerDTO>getAllCustomer() throws Exception {
        ArrayList<Customer>all= dao.getAll();
        ArrayList<CustomerDTO>allCust= new ArrayList<>();
        for (Customer c:all){
            CustomerDTO dto=new CustomerDTO(c.getcID(),c.getName(),c.getAddress());
            allCust.add(dto);
        }
        return allCust;


    }

}
