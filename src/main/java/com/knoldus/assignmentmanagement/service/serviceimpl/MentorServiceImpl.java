package com.knoldus.assignmentmanagement.service.serviceimpl;

import com.knoldus.assignmentmanagement.exceptions.ResourceNotFound;
import com.knoldus.assignmentmanagement.model.Mentor;
import com.knoldus.assignmentmanagement.repository.MentorRepository;
import com.knoldus.assignmentmanagement.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MentorServiceImpl implements MentorService {

    @Autowired
    private MentorRepository mentorRepository;
    @Override
    public List<Mentor> getAllMentors() {
        return mentorRepository.findAll();
    }

    @Override
    public Mentor getMentorDetails(Integer mentorId) {
        return mentorRepository.findById(mentorId).orElseThrow(()-> new ResourceNotFound("Mentor not found with id "+mentorId));
    }

    @Override
    public Mentor addMentor(Mentor mentor) {
        return mentorRepository.save(mentor);
    }

    @Override
    public Mentor updateMentor(Integer mentorId, Mentor mentor) {
        Mentor existingMentor = mentorRepository.findById(mentorId).orElseThrow(()->new ResourceNotFound("mentor not found with id "+mentorId));
        existingMentor.setMentorName(mentor.getMentorName());
        existingMentor.setEmp_id(mentor.getEmp_id());
        existingMentor.setCompetency_name(mentor.getCompetency_name());
        return mentorRepository.save(existingMentor);
    }

    @Override
    public void deleteMentor(Integer mentorId) {
        Mentor existingMentor = mentorRepository.findById(mentorId).orElseThrow(()->new ResourceNotFound("mentor not found with id "+mentorId));
        mentorRepository.deleteById(existingMentor.getMentorId());
    }
}
