package com.ffucks.controller;

import com.ffucks.entities.User;
import com.ffucks.service.UserService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public String save(@RequestBody User user) {
        service.save(user);
        return "Saved!";
    }

    @GetMapping("/{id}")
    public User get(@PathVariable String id) {
        return service.get(id);
    }
}
