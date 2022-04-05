package com.example.security.controller;

import com.example.security.dao.UserRepository;
import com.example.security.model.User;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserRepository userRepository;

    @ResponseBody
    @PostMapping("add")
    public void testAddUser(@RequestBody User user) {
        userRepository.save(user);
    }

    @ResponseBody
    @GetMapping("get")
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

}
