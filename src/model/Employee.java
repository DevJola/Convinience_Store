package model;

import enums.Gender;
import enums.Qualification;
import enums.Role;
import model.common.CoperatePerson;

import java.time.LocalDate;

public class Employee extends CoperatePerson {
    private double salary;

    public Employee(String firstName, String lastName, String email, String phone, String address, Role role, Qualification qualification, LocalDate dob, Gender gender) {
        super(firstName, lastName, email, phone, address, role, qualification, dob, gender);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName=" + getFirstName() + " lastName=" + getLastName() +" email=" + getEmail()
                + " phone=" + getPhone() + " address=" + getAddress() + " gender=" + getGender()
                + " dob=" + getDob() + " qualification=" + getQualification() + " role=" + getRole() +
                "salary=" + salary +
                '}';
    }
}
