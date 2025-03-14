package gr.aueb.cf.ch16;

import gr.aueb.cf.ch16.interfaces.ICustomerDAO;
import gr.aueb.cf.ch16.model.Customer;

public class CustomerServiceImpl {
    private ICustomerDAO iCustomerDAO;

    public void insertCustomer(ICustomerDAO iCustomerDAO) {
        this.iCustomerDAO = iCustomerDAO;
    }

    public void insertCustomer (Customer customer) throws Exception{
        try {
            if (iCustomerDAO.getCustomerByVat(customer.getVat()) != null) {
                throw new Exception(" ");
            }
            iCustomerDAO.addCustomer(customer);
        }catch (Exception e) {
            System.err.println("");
            throw e;
        }
    }
}
