package com.example.demo.services;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Userentity;

@Service
public class UserImpl implements UserServices {

    private final Map<Long, Userentity> store = new HashMap<>();
    private long counter = 1;

    @Override
    public Userentity insertUser(Userentity user) {
      
        if (user.getId() == null) {
            user.setId(counter++);
        }
        store.put(user.getId(), user);
        return user;
    }

    @Override
    public List<Userentity> getAllUser() {
        return new ArrayList<>(store.values());
    }

    @Override
    public Optional<Userentity> getOneUser(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public void deleteUser(Long id) {
        store.remove(id);
    }
}