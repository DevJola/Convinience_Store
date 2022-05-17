package model;

import enums.Gender;
import enums.Qualification;
import enums.Role;
import model.common.CoperatePerson;

import java.time.LocalDate;

public class Applicant extends CoperatePerson {
    private double expectedSalary;
    private double experienceYears;
    private double testScore;


    public Applicant(String firstName, String lastName, String email, String phone, String address,
                     Qualification qualification, LocalDate dob, Gender gender,
                     double expectedSalary, double experienceYears, double testScore) {
        super(firstName, lastName, email, phone, address, Role.APPLICANT, qualification, dob, gender);
        this.expectedSalary = expectedSalary;
        this.experienceYears = experienceYears;
        this.testScore = testScore;
    }

    @Override
    public String toString() {
        return "Applicant{" +
                "firstName=" + getFirstName() + " lastName=" + getLastName() +" email=" + getEmail()
                + " phone=" + getPhone() + " address=" + getAddress() + " gender=" + getGender()
                + " dob=" + getDob() + " qualification=" + getQualification() + " role=" + getRole() +
                "expectedSalary=" + expectedSalary +
                ", experienceYears=" + experienceYears +
                ", testScore=" + testScore +
                '}';
    }
}
