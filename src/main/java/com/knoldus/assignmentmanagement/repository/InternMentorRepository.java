package com.knoldus.assignmentmanagement.repository;

import com.knoldus.assignmentmanagement.model.InternMentorMap;
import com.knoldus.assignmentmanagement.model.InternMentorMapId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InternMentorRepository extends JpaRepository<InternMentorMap, InternMentorMapId> {

}
