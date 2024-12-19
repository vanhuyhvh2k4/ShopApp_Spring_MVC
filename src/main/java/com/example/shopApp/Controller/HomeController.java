package com.example.shopApp.Controller;

import com.example.shopApp.Entity.DTO.ProductDTO;
import com.example.shopApp.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class HomeController {
    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String getAllProducts(Model model) {
        List<ProductDTO> productDTOs = productService.getAllProducts();
        model.addAttribute("products", productDTOs);
        return "index";
    }

}
