package com.example.shopApp.Controller;

import com.example.shopApp.Entity.DTO.CategoryDTO;
import com.example.shopApp.Entity.DTO.ProductDTO;
import com.example.shopApp.Service.CategoryService;
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

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/")
    public String getAllProducts(Model model) {
        List<ProductDTO> productDTOs = productService.getAllProducts();
        List<CategoryDTO> categoryDTOS = categoryService.getAllCategories();
        model.addAttribute("products", productDTOs);
        model.addAttribute("categories", categoryDTOS);
        return "index";
    }

}
