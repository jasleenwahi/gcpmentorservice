package com.knoldus.assignmentmanagement.service;

import com.knoldus.assignmentmanagement.model.Assignment;
import org.springframework.stereotype.Service;

import java.util.concurrent.ExecutionException;

@Service
public interface AssignmentService {
    public void createUser(Assignment assignment) throws ExecutionException, InterruptedException;
}
