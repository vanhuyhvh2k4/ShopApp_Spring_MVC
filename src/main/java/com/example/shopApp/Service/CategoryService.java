package com.example.shopApp.Service;

import com.example.shopApp.Common.Mapping.CategoryMapper;
import com.example.shopApp.Entity.Category;
import com.example.shopApp.Entity.DTO.CategoryDTO;
import com.example.shopApp.Repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryMapper categoryMapper;

    public List<CategoryDTO> getAllCategories() {
        List<Category> categories = categoryRepository.findAll();

        if (categories.isEmpty()) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
        return categoryMapper.toCategoryDTOList(categories);
    }
}
