package com.NanRazvan.java_fitness_app.repository;

import com.NanRazvan.java_fitness_app.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
