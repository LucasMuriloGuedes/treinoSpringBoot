package com.lucasmurilo.cursomc.services;

import com.lucasmurilo.cursomc.domain.Order;
import com.lucasmurilo.cursomc.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll(){
        List<Order> list = orderRepository.findAll();
        return list;
    }

    public Order findById(Long id){
        Optional<Order> order = orderRepository.findById(id);
        return order.orElse(null);
    }
}
