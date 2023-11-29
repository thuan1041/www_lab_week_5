package vn.edu.iuh.fit.www_lab_week_5.fronted.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import vn.edu.iuh.fit.www_lab_week_5.backend.models.Candidate;
import vn.edu.iuh.fit.www_lab_week_5.backend.repositories.CandidateRepository;
import vn.edu.iuh.fit.www_lab_week_5.backend.services.CandidateService;

import java.util.List;

@Controller()
public class CandidateController {

    @Autowired
    private final CandidateService candidateService;

    public CandidateController(CandidateService candidateService) {
        this.candidateService = candidateService;
    }
    @GetMapping("/candidate/list")
    public String showCandidateList(Model model){
        List<Candidate> candidates = candidateService.findAll();
        model.addAttribute("candidates", candidates);
        return "candidate/candidate";
    }
}
