package model.common;

import enums.Gender;
import enums.Qualification;
import enums.Role;
import model.common.Person;

import java.time.LocalDate;

public abstract class CoperatePerson extends Person {
    private Qualification qualification;
    private LocalDate dob;
    private Gender gender;


    public CoperatePerson(String firstName, String lastName, String email,
                          String phone, String address, Role role, Qualification qualification,
                          LocalDate dob, Gender gender) {
        super(firstName, lastName, email, phone, address, role);
        this.qualification = qualification;
        this.dob = dob;
        this.gender = gender;
    }

    public Qualification getQualification() {
        return qualification;
    }

    public void setQualification(Qualification qualification) {
        this.qualification = qualification;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }
}
