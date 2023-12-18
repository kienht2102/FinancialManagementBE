package com.example.financial_management.repository;
import java.util.Optional;

import com.example.financial_management.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByUsernameAndPassword(String username,String password);

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);

}