import enums.Gender;
import enums.Qualification;
import enums.Role;
import model.*;
import service.ApplicantService;
import service.CustomerService;
import service.ManagerService;
import service.impl.ApplicantServiceImpl;
import service.impl.ManagerServiceImpl;

import java.time.LocalDate;
import java.time.Month;

public class Main {


    public static void main(String[] args) {
        Customer customer1 = new Customer("Dami", "Paul", "w@gmail.com",
                "090987654", "Sangotedo", Role.CUSTOMER);

        Employee manager = new Employee("Joy", "Chika", "chika@decagon.dev",
                "09876789098765", "Edo", Role.MANAGER, Qualification.BSC,
                LocalDate.of(1995, Month.JULY, 12), Gender.MALE);

        Employee cashier = new Employee("Dennis", "Obinna", "obinna@decagon.dev",
                "09876789098765", "Edo", Role.CASHIER, Qualification.BSC,
                LocalDate.of(1995, Month.JULY, 12), Gender.MALE);

        Applicant applicant = new Applicant ("Augusta", "Damilola", "daugusta@gmail.com",
                "098765445678", "Ebonyi", Qualification.SSCE, LocalDate.of(1995, Month.JULY, 12),
                Gender.FEMALE, 30_000, 18, 89);

        Company decagonLab = new Company("Decagon Lab", "UK");


        ApplicantService applicantService = new ApplicantServiceImpl();
        ManagerService managerService = new ManagerServiceImpl();

//        applicantService.apply(decagonLab, applicant);
//        applicantService.apply(decagonLab, applicant);

        managerService.hire(decagonLab, manager, applicant);
        managerService.fire(decagonLab, manager, cashier);

        Product product = new Product("Bag", 4000 );

        managerService.uploadProduct(decagonLab, manager, product);






    }
}
