package com.example.shopApp.Common.Mapping;


import com.example.shopApp.Entity.DTO.ProductDTO;
import com.example.shopApp.Entity.Product;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    List<ProductDTO> toProductDTOList(List<Product> products);
    ProductDTO toProductDTO(Product product);
    Product toEntity(ProductDTO productDTO);
}
