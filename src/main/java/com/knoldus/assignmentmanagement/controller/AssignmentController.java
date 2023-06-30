package com.knoldus.assignmentmanagement.controller;

import com.knoldus.assignmentmanagement.model.Assignment;
import com.knoldus.assignmentmanagement.service.serviceimpl.AssignmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/example")
public class AssignmentController {

    @Autowired
    private AssignmentServiceImpl assignmentService;

    @PostMapping("/create-document")
    public void createDocument(@RequestBody Assignment assignment) throws Exception {
        assignmentService.createUser(assignment);
    }
}


