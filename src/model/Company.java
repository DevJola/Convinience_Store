package model;

import java.util.ArrayList;
import java.util.List;

public class Company {
    private String name;
    private String address;

    private final List<Employee> employeeList = new ArrayList<>();
    private final List<Applicant> applicantList = new ArrayList<>();
    private final List<Product> productsList = new ArrayList<>();

    public Company(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public List<Applicant> getApplicantList() {
        return applicantList;
    }

    public List<Product> getProductsList() {
        return productsList;
    }
}
