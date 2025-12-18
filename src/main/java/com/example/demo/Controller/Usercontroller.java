package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/users")   // better REST naming (lowercase & plural).
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // CREATE
    @PostMapping
    public User postUser(@RequestBody User user) {
        return userService.insertUser(user);
    }

    // READ ALL
    @GetMapping
    public List<User> getAll() {
        return userService.getAllUsers();
    }

    // READ ONE
    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Long id) {
        return userService.getOneUser(id);
    }

    // UPDATE
    @PutMapping("/{id}")
    public String updateUser(@PathVariable Long id, @RequestBody User user) {

        Optional<User> userOpt = userService.getOneUser(id);

        if (userOpt.isPresent()) {
            User existingUser = userOpt.get();

            existingUser.setName(user.getName());
            existingUser.setEmail(user.getEmail());
            existingUser.setPassword(user.getPassword()); // example field

            userService.insertUser(existingUser);
            return "Updated Successfully ";
        }
        return "User Not Found ";
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id) {

        Optional<User> user = userService.getOneUser(id);

        if (user.isPresent()) {
            userService.deleteUser(id);
            return "Deleted Successfully ";
        }
        return "User Not Found ";
    }
}
