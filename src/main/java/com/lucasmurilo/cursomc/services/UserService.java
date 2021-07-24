package com.lucasmurilo.cursomc.services;

import com.lucasmurilo.cursomc.domain.User;
import com.lucasmurilo.cursomc.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll(){
       List<User> obj = userRepository.findAll();
        return obj;
    }

    public User findById(Long id){
        Optional<User> user = userRepository.findById(id);
        return user.orElse(null);
    }

    public User insert(User user){
       return userRepository.save(user);
    }

    public void delete(Long id){
        userRepository.deleteById(id);
    }
}
