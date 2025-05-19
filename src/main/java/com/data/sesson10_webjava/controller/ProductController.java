package com.data.sesson10_webjava.controller;

import com.data.sesson10_webjava.model.Product;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ProductController {
    @GetMapping("/product-form")
    public String showForm(Model model) {
        model.addAttribute("product", new Product());
        return "productForm";
    }

    @PostMapping("/add-product")
    public String addProduct(@ModelAttribute("product") Product product, Model model) {
        model.addAttribute("product", product);
        return "productResult";
    }
}
