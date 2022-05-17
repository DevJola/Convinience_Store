package service;

import model.Customer;
import model.Employee;
import model.Product;

public interface CashierService {

    void sell (Customer customer, Employee cashier, Product product);
    void checkCustomerCart(Customer customer, Product product, Employee cashier);
}
