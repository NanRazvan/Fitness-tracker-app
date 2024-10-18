package com.NanRazvan.java_fitness_app.repository;

import com.NanRazvan.java_fitness_app.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal,Long> {
}
