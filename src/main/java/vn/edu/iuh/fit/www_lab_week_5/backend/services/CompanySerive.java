package vn.edu.iuh.fit.www_lab_week_5.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vn.edu.iuh.fit.www_lab_week_5.backend.models.Company;
import vn.edu.iuh.fit.www_lab_week_5.backend.repositories.CompanyRepository;
import vn.edu.iuh.fit.www_lab_week_5.fronted.controllers.CompanyController;

import java.util.List;

@Service
public class CompanySerive {
    @Autowired
    private CompanyRepository companyRepository;
    public List<Company> getAll(){
        return companyRepository.findAll();
    }
}
