package com.example.Practice22.controller;

import com.example.Practice22.models.User;
import com.example.Practice22.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping("/filtered/user/id/{id}")
    public User getAllById(@PathVariable("id") Long id) {
        return userService.findById(id);
    }

    @GetMapping("/filtered/user/lastname/{lastname}")
    public List<User> getAllByLastName(@PathVariable("lastname") String lastName) {
        return userService.findByLastName(lastName);
    }

    @GetMapping("/filtered/user/firstname/{firstname}")
    public List<User> getAllByFirstName(@PathVariable("firstname") String firstName) {
        return userService.findByFirstName(firstName);
    }


}
