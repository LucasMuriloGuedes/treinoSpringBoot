package com.lucasmurilo.cursomc.repository;

import com.lucasmurilo.cursomc.domain.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
