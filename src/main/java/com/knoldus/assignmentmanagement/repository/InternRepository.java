package com.knoldus.assignmentmanagement.repository;

import com.knoldus.assignmentmanagement.model.Intern;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternRepository extends JpaRepository<Intern, Integer> {
}
