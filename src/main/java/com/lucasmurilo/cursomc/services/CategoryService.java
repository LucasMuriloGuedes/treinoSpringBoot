package com.lucasmurilo.cursomc.services;

import com.lucasmurilo.cursomc.domain.Category;
import com.lucasmurilo.cursomc.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll(){
        List<Category> list = categoryRepository.findAll();
        return list;
    }

    public Category findById(Long id){
        Optional<Category> category = categoryRepository.findById(id);
        return category.orElse(null);
    }
}
