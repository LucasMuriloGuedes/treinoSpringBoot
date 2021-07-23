package com.lucasmurilo.cursomc.repository;

import com.lucasmurilo.cursomc.domain.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
