package com.example.practice.Controller;

import com.example.practice.Entity.UserEntity;
import com.example.practice.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    private final UserService userService;
    @Autowired
    public UserController(UserService userService){
        this.userService = userService;
    }

    @GetMapping("/")
    public List<UserEntity> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/")
    public UserEntity saveUser(@RequestBody UserEntity userEntity){
        return userService.saveUser(userEntity);
    }

    @GetMapping("/user/{userID}")
    public Optional findUserByID(@PathVariable Long userID){
        return userService.findByID(userID);
    }

    @GetMapping("/username/{userName}")
    public List<UserEntity> findUserByID(@PathVariable String userName){
        return userService.findByUserName(userName);
    }

    @GetMapping("/userage/{age}")
    public List<UserEntity> findUserByID(@PathVariable int age){
        return userService.findByUserAge(age);
    }
}
