package id.ac.ui.akmr.cuanku.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BaseController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("nama", "David");
        return "index";
    }
}
