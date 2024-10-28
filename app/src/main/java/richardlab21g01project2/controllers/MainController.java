package richardlab21g01project2.controllers;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;


@Controller
public class MainController {
    @GetMapping("/")
    public String home(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/index")
    public String index(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/signup")
    public String signup(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    @GetMapping("/login")
    public String login(@RequestParam(value = "name", defaultValue = "World") String name, Model model) {
        model.addAttribute("name", name);
        return "index";
    }

    // @GetMapping("/service")
    // public String service(Model model) {
    //     return "service";
    // }

    // @GetMapping("/contact")
    // public String contact(Model model) {
    //     return "contact";
    // }

    // @GetMapping("/about")
    // public String about(Model model) {
    //     return "about";
    // }
}
