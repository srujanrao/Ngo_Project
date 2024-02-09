package controller;


import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import repository.UserRepository;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    //@CrossOrigin("http://localhost:3000")
    @PostMapping("/saveUser")
    public User saveUser(@RequestBody User user) {

        return userRepository.save(user);
    }

    @GetMapping("/getUser")
    public List<User> getUser() {
        return userRepository.findAll();
    }

    
}
