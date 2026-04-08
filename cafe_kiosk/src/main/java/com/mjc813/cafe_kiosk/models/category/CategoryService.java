package com.mjc813.cafe_kiosk.models.category;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public CategoryDto insert(CategoryDto categoryDto) {
        CategoryEntity newData = new CategoryEntity();
        newData.setName(categoryDto.getName());
        newData.setId(categoryDto.getId());

        CategoryEntity resEntity = this.categoryRepository.save(newData);

        CategoryDto result = new CategoryDto();
        result.setId(resEntity.getId());
        result.setName(resEntity.getName());
        return result;
    }

    public CategoryDto update(CategoryDto categoryDto) {
        return null;
    }

    public CategoryDto deleteById(Integer id) {
        return null;
    }

    public CategoryDto findById(Integer id) {
        return null;
    }

    public Slice<CategoryDto> findByNameContains(String name, Pageable pageable) {
        return null;
    }
}