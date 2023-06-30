package com.knoldus.assignmentmanagement.service;

import com.knoldus.assignmentmanagement.model.Mentor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface MentorService {
    List<Mentor> getAllMentors();
    Mentor getMentorDetails(Integer mentorId);
    Mentor addMentor(Mentor mentor);
    Mentor updateMentor(Integer id, Mentor mentor);
    void deleteMentor(Integer id);
}
