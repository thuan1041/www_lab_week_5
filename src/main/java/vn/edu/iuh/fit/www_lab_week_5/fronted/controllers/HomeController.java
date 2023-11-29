package vn.edu.iuh.fit.www_lab_week_5.fronted.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class HomeController {
    @GetMapping("")
    public String home(Model model) {
        return  "home";
    }
}
