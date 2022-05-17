package service.impl;

import model.Applicant;
import model.Company;
import service.ApplicantService;

public class ApplicantServiceImpl implements ApplicantService {

    @Override
    public void apply(Company company, Applicant applicant) {
        var applicantList = company.getApplicantList();
        var applicantName = applicant.getFirstName();

        if (applicantList.contains(applicant)) {
            System.err.println(applicantName + " has already applied");
        } else {
            applicantList.add(applicant);
            System.out.println(applicantName+ " has been added to applicant list.");
        }
    }
}
