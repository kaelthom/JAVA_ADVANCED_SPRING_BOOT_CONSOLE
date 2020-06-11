package com.advancedjava.springbootconsole;

import com.advancedjava.springbootconsole.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.annotation.ReadOnlyProperty;
import org.springframework.stereotype.Repository;

@SpringBootApplication
public class SpringbootconsoleApplication implements CommandLineRunner {
    @Autowired
    UserRepository userRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringbootconsoleApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("hello");

        System.out.println("users : ");
        System.out.println(userRepository.findAll());
    }
}
