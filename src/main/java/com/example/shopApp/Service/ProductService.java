package com.example.shopApp.Service;

import com.example.shopApp.Common.Mapping.ProductMapper;
import com.example.shopApp.Entity.DTO.ProductDTO;
import com.example.shopApp.Entity.Product;
import com.example.shopApp.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductMapper productMapper;

    public List<ProductDTO> getAllProducts() {
        List<Product> products = productRepository.findAll();

        if (products.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }

        return productMapper.toProductDTOList(products);
    }
}
