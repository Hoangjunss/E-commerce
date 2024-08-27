package com.baconbao.e_commerce.responsitory;

import com.baconbao.e_commerce.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findById(Integer id);
    User findByEmail(String email);
}
