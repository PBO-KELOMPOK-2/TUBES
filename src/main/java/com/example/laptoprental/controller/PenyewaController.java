package com.example.laptoprental.controller;

import com.example.laptoprental.model.Penyewa;
import com.example.laptoprental.service.PenyewaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/penyewa")
public class PenyewaController {

    @Autowired
    private PenyewaService penyewaService;

    @GetMapping("/register")
    public String registerForm(Model model) {
        model.addAttribute("penyewa", new Penyewa());
        return "penyewa_register_form";
    }

    @PostMapping("/register")
    public String register(@ModelAttribute Penyewa penyewa) {
        penyewaService.register(penyewa);
        return "redirect:/penyewa/book";
    }
}
