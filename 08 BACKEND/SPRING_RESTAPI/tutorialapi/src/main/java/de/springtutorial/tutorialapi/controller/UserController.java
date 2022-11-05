package de.springtutorial.tutorialapi.controller;

import de.springtutorial.tutorialapi.model.User;
import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.springtutorial.tutorialapi.repository.UserRepository;

@RestController
@RequestMapping("/")
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("")
    public String index() {
        return "API works...";
    }    

    @GetMapping("/user/all")
    public List<User> all() {
        return userRepository.findAll();
    }

    @GetMapping("/user/{id}")
    public ResponseEntity<User> get(@PathVariable Integer id) {
        try {
            User user = userRepository.findById(id).get();
            return new ResponseEntity<>(user, HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<User>(HttpStatus.NOT_FOUND);
        }
    }
}
