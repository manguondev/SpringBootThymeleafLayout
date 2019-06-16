package dev.manguon.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author TRUONG DUONG
 */
@Controller
public class HomeController {

    @GetMapping("/")
    public String showIndex() {
        return "home";
    }

    @GetMapping("/home")
    public String showHome() {
        return "home";
    }

    @GetMapping("/about")
    public String showaAbout() {
        return "about";
    }

    @GetMapping("/project")
    public String showProject() {
        return "project";
    }

    @GetMapping("/contact")
    public String showContact() {
        return "contact";
    }

}
