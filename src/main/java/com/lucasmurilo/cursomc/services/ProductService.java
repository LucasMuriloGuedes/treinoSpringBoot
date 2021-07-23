package com.lucasmurilo.cursomc.services;

import com.lucasmurilo.cursomc.domain.Product;
import com.lucasmurilo.cursomc.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<Product> findAll(){
        List<Product> list = productRepository.findAll();
        return list;
    }

    public Product findById(Long id){
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }
}
