package service;

import model.Applicant;
import model.Company;

public interface ApplicantService {
    void apply(Company company, Applicant applicant);
}
