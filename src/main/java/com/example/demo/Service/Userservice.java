package com.example.demo.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.entity.User;

@Service
public class UserServiceImpl implements UserService {

    // In-memory storage
    private final Map<Long, User> store = new HashMap<>();
    private long counter = 1;

    @Override
    public User insertUser(User user) {

        // Auto-generate ID
        user.setId(counter++);

        // Default role logic
        if (user.getRole() == null || user.getRole().isEmpty()) {
            user.setRole("USER");
        }

        // Save user
        store.put(user.getId(), user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<User> getOneUser(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void deleteUser(Long id) {
        store.remove(id);
    }
}
0