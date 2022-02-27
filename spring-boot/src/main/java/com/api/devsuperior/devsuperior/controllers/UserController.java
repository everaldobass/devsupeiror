package com.api.devsuperior.devsuperior.controllers;
import java.util.List;
import java.util.Optional;

import com.api.devsuperior.devsuperior.entities.User;
import com.api.devsuperior.devsuperior.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/users" )
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping
    public List<User> findAll(){
        List<User> result =  repository.findAll();
        return result;

    }

    @GetMapping(value = "/{id}")
    public Optional<User> findById(@PathVariable Long id){
        Optional<User> result = repository.findById(id);
        return result;
    }

    @PostMapping
    public User insert(@RequestBody User user) {
        User result = repository.save(user);
        return result;
    }


}
