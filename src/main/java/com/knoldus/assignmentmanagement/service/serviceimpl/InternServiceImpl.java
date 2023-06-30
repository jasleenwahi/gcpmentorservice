package com.knoldus.assignmentmanagement.service.serviceimpl;

import com.knoldus.assignmentmanagement.exceptions.ResourceNotFound;
import com.knoldus.assignmentmanagement.model.Intern;
import com.knoldus.assignmentmanagement.repository.InternRepository;
import com.knoldus.assignmentmanagement.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class InternServiceImpl implements InternService {
    @Autowired
    private InternRepository internRepository;
    @Override
    public List<Intern> getAllInterns() {
        return internRepository.findAll();
    }

    @Override
    public Intern getInternDetails(Integer internId) {
        return internRepository.findById(internId).orElseThrow(()->new ResourceNotFound("intern not found with id"+internId));
    }

    @Override
    public Intern addIntern(Intern intern) {
        return internRepository.save(intern);
    }

    @Override
    public Intern updateIntern(Integer internId, Intern intern) {
        Intern existingIntern = internRepository.findById(internId).orElseThrow(()->new ResourceNotFound("intern not found with id "+internId));
        existingIntern.setEmp_id(intern.getEmp_id());
        existingIntern.setFirst_name(intern.getFirst_name());
        existingIntern.setLast_name(intern.getLast_name());
        existingIntern.setCompetency_name(intern.getCompetency_name());
        return internRepository.save(existingIntern);

    }

    @Override
    public void deleteIntern(Integer internId) {
        Intern existingIntern = internRepository.findById(internId).orElseThrow(()->new ResourceNotFound("intern not found with id"+internId));
        internRepository.deleteById(existingIntern.getInternId());
    }
}
