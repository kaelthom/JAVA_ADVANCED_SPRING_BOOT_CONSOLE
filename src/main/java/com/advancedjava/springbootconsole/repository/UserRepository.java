package com.advancedjava.springbootconsole.repository;

import com.advancedjava.springbootconsole.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
}
