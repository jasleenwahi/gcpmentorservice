package com.knoldus.assignmentmanagement.service.serviceimpl;

import com.knoldus.assignmentmanagement.exceptions.ResourceNotFound;
import com.knoldus.assignmentmanagement.model.*;
import com.knoldus.assignmentmanagement.repository.InternMentorRepository;
import com.knoldus.assignmentmanagement.repository.InternRepository;
import com.knoldus.assignmentmanagement.repository.KipKupPlanRepository;
import com.knoldus.assignmentmanagement.repository.MentorRepository;
import com.knoldus.assignmentmanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class AdminServiceImpl implements AdminService {

    @Autowired
    KipKupPlanRepository kipKupPlanRepository;

    @Autowired
    InternRepository internRepository;
    @Autowired
    MentorRepository mentorRepository;
    @Autowired
    InternMentorRepository internMentorRepository;
    @Override
    public KipKupPlan addKipKupPlan(KipKupPlan kipKupPlan) {
        return kipKupPlanRepository.save(kipKupPlan);
    }
    @Override
    public KipKupPlan updateKipKupPlan(KipKupPlan kipKupPlan, Integer sessionId) {
        KipKupPlan existingSession = kipKupPlanRepository.findById(sessionId).orElseThrow(()->new ResourceNotFound("session not found with id "+sessionId));
        existingSession.setDate(kipKupPlan.getDate());
        existingSession.setTime(kipKupPlan.getTime());
        existingSession.setTopic(kipKupPlan.getTopic());
        existingSession.setMentorName(kipKupPlan.getMentorName());
        existingSession.setType(kipKupPlan.getType());
        return kipKupPlanRepository.save(kipKupPlan);
    }

    @Override
    public InternMentorMap addInternMentor(InternMentorMap internMentorMap) {
        if(internRepository.existsById(internMentorMap.getIntern()) && mentorRepository.existsById(internMentorMap.getMentor())){
            return internMentorRepository.save(internMentorMap);
        }else {
            throw new ResourceNotFound("Resource not found");
        }

    }

    @Override
    public InternMentorMap updateInternMentor(InternMentorMap internMentorMap, Integer mentorId) {
        if(internMentorMap.getIntern() != null){
            internMentorMap.setMentor(mentorId);
            return internMentorRepository.save(internMentorMap);
        }
        else{
            throw new ResourceNotFound("Resource not found");
        }
    }
}
