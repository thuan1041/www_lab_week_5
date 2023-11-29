package vn.edu.iuh.fit.www_lab_week_5.fronted.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_lab_week_5.backend.models.Company;
import vn.edu.iuh.fit.www_lab_week_5.backend.services.CompanySerive;

import java.util.List;
@Controller()
public class CompanyController {
    @Autowired
    private final  CompanySerive companySerive;
    public CompanyController(CompanySerive companySerive) {
        this.companySerive = companySerive;
    }

//    @GetMapping("/api/list")
//    public List<Company> getAll(){
//        return companySerive.getAll();
//    }
    @GetMapping("company/list")
    public String showCompanyList(Model model) {
        List<Company> companies = companySerive.getAll();
        model.addAttribute("companies", companies);
        return "company/company";
    }
}