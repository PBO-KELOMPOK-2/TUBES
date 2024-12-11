package com.example.laptoprental.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "login_form";
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, Model model) {
        // Simulasi login (diganti dengan autentikasi nyata)
        if ("admin".equals(username) && "adminpass".equals(password)) {
            return "redirect:/admin/laptops";
        } else if ("penyewa".equals(username) && "penyewapass".equals(password)) {
            return "redirect:/penyewa/register";
        } else {
            model.addAttribute("error", "Invalid username or password");
            return "login_form";
        }
    }
}
