package com.lucasmurilo.cursomc.repository;

import com.lucasmurilo.cursomc.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
