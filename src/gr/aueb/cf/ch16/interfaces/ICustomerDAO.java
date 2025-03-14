package gr.aueb.cf.ch16.interfaces;

import gr.aueb.cf.ch16.model.Customer;

public interface ICustomerDAO {
    void addCustomer(Customer customer);
    void updateCustomer(Long id, Customer customer);
    boolean removeCustomer(Long id);
    Customer getCustomerbyId(Long id);
    Customer getCustomerByPhoneNumber(String phoneNumber);
    Customer[] getCustomerByRegion(String region);
    Customer getCustomerByVat(String vat);

}
