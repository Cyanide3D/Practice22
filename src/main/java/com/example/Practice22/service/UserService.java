package com.example.Practice22.service;

import com.example.Practice22.models.User;
import com.example.Practice22.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Slf4j
@Transactional
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findByFirstName(String firstName) {
        log.info("Find user by first name " + firstName);
        return userRepository.findAllByFirstName(firstName);
    }
    public List<User> findByLastName(String lastName) {
        log.info("Find user by last name " + lastName);
        return userRepository.findAllByLastName(lastName);
    }
    public User findById(Long id) {
        log.info("Find user by id " + id);
        return userRepository.findOneById(id);
    }

}
