package com.example.practice.Repository;

import com.example.practice.Entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {
    List<UserEntity> findByFullName(String fullName);
    List<UserEntity> findByAge(int age);
}
