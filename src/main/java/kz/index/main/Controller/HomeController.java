package kz.index.main.Controller;

import kz.index.main.model.PC;
import kz.index.main.bd.DBManager;



import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/")
    public String getMainPage(Model model) {
        model.addAttribute("laptops", DBManager.getPcs());
        return "main";
    }
}
