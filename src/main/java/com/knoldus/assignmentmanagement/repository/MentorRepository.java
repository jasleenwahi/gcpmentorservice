package com.knoldus.assignmentmanagement.repository;

import com.knoldus.assignmentmanagement.model.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepository extends JpaRepository<Mentor, Integer> {
}
