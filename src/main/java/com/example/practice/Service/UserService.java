package com.example.practice.Service;

import com.example.practice.Entity.UserEntity;
import com.example.practice.Repository.UserRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }
    public List<UserEntity> getAllUsers(){
        List<UserEntity> result = userRepository.findAll();
        return result;
    }

    public UserEntity saveUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    public Optional findByID(Long userID) {
        Optional user = userRepository.findById(userID);
        return user;
    }

    public List<UserEntity> findByUserName(String userName) {
        return userRepository.findByFullName(userName);
    }

    public List<UserEntity> findByUserAge(int age) {
        return userRepository.findByAge(age);
    }
}
