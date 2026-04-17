package com.ivana.userapi.controller;

import com.ivana.userapi.model.User;
import com.ivana.userapi.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @GetMapping
    public List<User> listar() {
        return service.listar();
    }

    @PostMapping
    public User salvar(@RequestBody User user) {
        return service.salvar(user);
    }
}