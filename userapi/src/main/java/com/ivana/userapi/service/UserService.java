package com.ivana.userapi.service;

import com.ivana.userapi.model.User;
import com.ivana.userapi.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public List<User> listar() {
        return repository.findAll();
    }

    public User salvar(User user) {
        return repository.save(user);
    }

    public User buscarPorId(Long id) {
        return repository.findById(id).orElse(null);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}