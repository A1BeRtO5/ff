package blog.p1.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("title", "ffffff");
        return "home";
    }
    @GetMapping("/blog-main")
    public String blogmain(Model model) {
        model.addAttribute("title", "fff4fff");
        return "blog-main";
    }
    @GetMapping("/about")
    public String about(Model model) {
        model.addAttribute("title", "Page about us");
        return "about";
    }


}