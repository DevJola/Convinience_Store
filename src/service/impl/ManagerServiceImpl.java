package service.impl;

import enums.Role;
import model.Applicant;
import model.Company;
import model.Employee;
import model.Product;
import service.ManagerService;

public class ManagerServiceImpl implements ManagerService {
    @Override
    public void hire(Company company, Employee manager, Applicant applicant) {
        var applicantList = company.getApplicantList();

        if (!manager.getRole().equals(Role.MANAGER)){
            System.err.println(manager.getFirstName() + " is not authorised for this operation!");
        } else if (!applicantList.contains(applicant)){
            System.err.println(applicant.getFirstName() + " is not in applicants' list!");
        } else {
            Employee cashier = new Employee(applicant.getFirstName(), applicant.getLastName(), applicant.getEmail(),
                    applicant.getPhone(), applicant.getAddress(), Role.CASHIER, applicant.getQualification(),
                    applicant.getDob(), applicant.getGender());
            company.getEmployeeList().add(cashier);
            applicantList.remove(applicant);
            System.out.println(applicant.getFirstName() + " has been hired into " + company.getName());
        }
    }

    @Override
    public void fire(Company company, Employee manager, Employee cashier) {
        var employeeList = company.getEmployeeList();
        if (!manager.getRole().equals(Role.MANAGER)){
            System.err.println(manager.getFirstName() + " is not authorised for this operation!");
        } else if(!employeeList.contains(cashier)){
            System.err.println(cashier.getFirstName() + " is not an employee of " + company.getName());
        } else {
            employeeList.remove(cashier);
            System.out.println(cashier.getFirstName() + " has been fired from" + company.getName());
        }
    }

    @Override
    public void uploadProduct(Company company, Employee manager, Product product) {
        var employeeList = company.getEmployeeList();
        if (!manager.getRole().equals(Role.MANAGER)) {
            System.err.println(manager.getFirstName() + " is not authorised for this operation!");
        }else {
            company.getProductsList().add(product);
            System.out.println(product.getName() + " has been added to product list");
        }


    }
}
