package com.example.shopApp.Common.Mapping;

import com.example.shopApp.Entity.Category;
import com.example.shopApp.Entity.DTO.CategoryDTO;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoryMapper {
    List<CategoryDTO> toCategoryDTOList(List<Category> categories);
    CategoryDTO toCategoryDTO(Category category);
    Category toEntity(CategoryDTO categoryDTO);
}
