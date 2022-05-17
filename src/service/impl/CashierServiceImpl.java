package service.impl;

import enums.Role;
import model.Customer;
import model.Employee;
import model.Product;
import service.CashierService;

public class CashierServiceImpl implements CashierService {
    @Override
    public void sell(Customer customer, Employee cashier, Product product) {
        if (cashier.getRole().equals(Role.CASHIER)){
            customer.getCart().add(product);
        }
    }

    @Override
    public void checkCustomerCart(Customer customer, Product product, Employee cashier) {
        var cart = customer.getCart();
        if (cashier.getRole().equals(Role.CASHIER)){
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + "." + "-->" + "\n Product Name" +
                        cart.get(i).getName() + "\n Product Name: " +
                        cart.get(i).getPrice());
            }
        }else{
            System.out.println("You do not have access to see the contents of this cart");
        }

    }
}

