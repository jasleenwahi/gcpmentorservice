package com.knoldus.assignmentmanagement.controller;

import com.knoldus.assignmentmanagement.model.Mentor;
import com.knoldus.assignmentmanagement.service.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class MentorController {
    @Autowired
    private MentorService mentorService;

    @GetMapping("/allMentors")
    public ResponseEntity<List<Mentor>> getAllMentors(){
        return ResponseEntity.ok(mentorService.getAllMentors());
    }

    @GetMapping("/mentordetails/{mentorId}")
    public ResponseEntity<Mentor> getMentor(@PathVariable Integer mentorId){
        return ResponseEntity.ok(mentorService.getMentorDetails(mentorId));
    }

    @PostMapping("/newmentor")
    public ResponseEntity<Mentor> addMentor(@RequestBody Mentor mentor){
        return ResponseEntity.ok(mentorService.addMentor(mentor));
    }

    @PutMapping("/mentordetails/{id}")
    public ResponseEntity<Mentor> updateMentor(@PathVariable Integer mentorId, @RequestBody Mentor mentor){
        return ResponseEntity.ok(mentorService.updateMentor(mentorId, mentor));
    }

    @DeleteMapping("/mentor/{id}")
    public void deleteMentor(@PathVariable Integer mentorId) {
        mentorService.deleteMentor(mentorId);
    }
}
