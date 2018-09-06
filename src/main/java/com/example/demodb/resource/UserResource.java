package com.example.demodb.resource;

import com.example.demodb.model.Users;
import com.example.demodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/users")
public class UserResource {

    @Autowired
    UserRepository userRepository;

    @GetMapping(value = "/all")
    public List<Users> getAll(){
        return userRepository.findAll();
    }

    @PostMapping(value = "/load")
    public List<Users> persist(@RequestBody final Users users){
        userRepository.save(users);
        return userRepository.findAll();
    }
}
