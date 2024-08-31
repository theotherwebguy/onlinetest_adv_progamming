package org.onlinetestsystem.onlinetest.controller;

import org.onlinetestsystem.onlinetest.entity.Users;
import org.onlinetestsystem.onlinetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Users getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public String registerUser(@RequestBody Users user) {
        userService.registerUser(user);
        return "User registered successfully";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody Users user) {
        userService.updateUser(id, user);
        return "User updated successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
        return "User deleted successfully";
    }
}
