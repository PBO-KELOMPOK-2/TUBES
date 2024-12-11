/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.laptoprental.controller;

/**
 *
 * @author rizkilahi
 */

import com.example.laptoprental.model.Laptop;
import com.example.laptoprental.service.LaptopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private LaptopService laptopService;

    @GetMapping("/laptops")
    public String listLaptops(Model model) {
        model.addAttribute("laptops", laptopService.getAllLaptops());
        return "admin_laptop_list";
    }

    @GetMapping("/laptops/add")
    public String addLaptopForm(Model model) {
        model.addAttribute("laptop", new Laptop());
        return "admin_laptop_form";
    }

    @PostMapping("/laptops")
    public String saveLaptop(@ModelAttribute Laptop laptop) {
        laptopService.saveLaptop(laptop);
        return "redirect:/admin/laptops";
    }

    @GetMapping("/laptops/delete/{id}")
    public String deleteLaptop(@PathVariable Long id) {
        laptopService.deleteLaptop(id);
        return "redirect:/admin/laptops";
    }
}
