package service;

import model.Company;
import model.Customer;
import model.Product;

public interface CustomerService {
    void buy(Company company, Customer customer, Product product);
    void checkCart(Customer customer, Product product);
}
