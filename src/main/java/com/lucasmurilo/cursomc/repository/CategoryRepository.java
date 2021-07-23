package com.lucasmurilo.cursomc.repository;

import com.lucasmurilo.cursomc.domain.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
