package model;

import enums.Role;
import model.common.Person;

import java.util.ArrayList;
import java.util.List;

public class Customer extends Person {
    private List<Product> cart = new ArrayList<>();

    public Customer(String firstName, String lastName, String email, String phone, String address, Role role) {
        super(firstName, lastName, email, phone, address, role);
    }

    public List<Product> getCart() {
        return cart;
    }


}
