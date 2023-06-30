package com.knoldus.assignmentmanagement.service;

import com.knoldus.assignmentmanagement.model.Intern;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InternService {
    List<Intern> getAllInterns();
    Intern getInternDetails(Integer internId);
    Intern addIntern(Intern intern);
    Intern updateIntern(Integer id, Intern intern);
    void deleteIntern(Integer id);
}
