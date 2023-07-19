package com.huynhcanh.userservice.controller;

import com.huynhcanh.userservice.data.User;
import com.huynhcanh.userservice.model.UserDTO;
import com.huynhcanh.userservice.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/listUser")
    public List<User> getAllUser() {
        return userService.getAllUser();
    }

    @PostMapping("/addUser")
    public UserDTO addUser(@RequestBody UserDTO dto) {
        return userService.saveUser(dto);
    }

    @PostMapping("/login")
    public UserDTO login(@RequestBody UserDTO dto) {
        return userService.login(dto.getUsername(), dto.getPassword());
    }
}
