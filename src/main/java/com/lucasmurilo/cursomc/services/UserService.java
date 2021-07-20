package com.lucasmurilo.cursomc.services;

import com.lucasmurilo.cursomc.domain.User;
import com.lucasmurilo.cursomc.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private UserRepository userRepository;

    public List<User> findAll(){
        List list = userRepository.findAll();
        return list;
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }
}
