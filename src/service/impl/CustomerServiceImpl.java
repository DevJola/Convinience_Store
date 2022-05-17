package service.impl;

import enums.Role;
import model.Company;
import model.Customer;
import model.Product;
import service.CustomerService;





public class CustomerServiceImpl implements CustomerService {
    @Override
    public void buy(Company company, Customer customer, Product product) {
        if (company.getProductsList().contains(product)){
            customer.getCart().add(product);
            System.out.println("Congratulations " + customer.getFirstName() + " you have just bought the " +
                    product.getName() + "from our store " + company.getName() );
        }
    }

    @Override
    public void checkCart(Customer customer, Product product) {
            var cart = customer.getCart();
        if (customer.getRole().equals(Role.CUSTOMER)) {
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + "." + "-->" + "\n Product Name" +
                        cart.get(i).getName() + "\n Product Name: " +
                        cart.get(i).getPrice());
            }
        }else{
            System.out.println("You do not have access to see this cart");
        }
    }
}
