package com.practica01.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author Usuario
 */
@Controller
public class IndexController {
    
    @GetMapping("/")
    public String inicio(Model model) {
        return "index";
    }
}
