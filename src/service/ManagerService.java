package service;

import model.Applicant;
import model.Company;
import model.Employee;
import model.Product;

public interface ManagerService {
    void hire (Company company, Employee manager, Applicant applicant);
    void fire (Company company, Employee manager, Employee cashier);
    void uploadProduct (Company company, Employee manager, Product product);
}
