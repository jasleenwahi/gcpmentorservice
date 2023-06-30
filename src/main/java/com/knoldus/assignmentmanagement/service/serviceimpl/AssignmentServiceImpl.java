package com.knoldus.assignmentmanagement.service.serviceimpl;

import com.knoldus.assignmentmanagement.model.Assignment;
import com.knoldus.assignmentmanagement.repository.AssignmentRepository;
import com.knoldus.assignmentmanagement.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public class AssignmentServiceImpl implements AssignmentService {
    private final AssignmentRepository assignmentRepository;

    @Autowired
    public AssignmentServiceImpl(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }
    public void createUser(Assignment assignment) throws ExecutionException, InterruptedException {
        assignmentRepository.addUser(assignment);
    }
}


