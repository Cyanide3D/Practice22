package com.example.Practice22.controller;

import com.example.Practice22.models.Dog;
import com.example.Practice22.models.User;
import com.example.Practice22.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {

    @Autowired
    private DogService dogService;

    @GetMapping(value = "/dog/{dogId}/user")
    public User getDogUser(@PathVariable("dogId") Long dogId){
        return dogService.getUserByDog(dogId);
    }

    @GetMapping("/dogs")
    public List<Dog> getAllDogs() {
        return dogService.getAllDogs();
    }

    @GetMapping("/filtered/dog/id/{id}")
    public Dog getAllById(@PathVariable("id") Long id) {
        return dogService.findById(id);
    }

    @GetMapping("/filtered/dog/name/{name}")
    public List<Dog> getAllByName(@PathVariable("name") String name) {
        return dogService.findByName(name);
    }

    @GetMapping("/filtered/dog/breed/{breed}")
    public List<Dog> getAllByFirstName(@PathVariable("breed") String breed) {
        return dogService.findByBreed(breed);
    }

}
