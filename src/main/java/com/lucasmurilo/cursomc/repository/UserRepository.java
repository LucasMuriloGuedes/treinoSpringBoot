package com.lucasmurilo.cursomc.repository;

import com.lucasmurilo.cursomc.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
