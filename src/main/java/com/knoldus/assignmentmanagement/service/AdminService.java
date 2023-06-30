package com.knoldus.assignmentmanagement.service;

import com.knoldus.assignmentmanagement.model.InternMentorMap;
import com.knoldus.assignmentmanagement.model.InternMentorMapId;
import com.knoldus.assignmentmanagement.model.KipKupPlan;
import org.springframework.stereotype.Service;

@Service
public interface AdminService {
    KipKupPlan addKipKupPlan(KipKupPlan kipKupPlan);
    KipKupPlan updateKipKupPlan(KipKupPlan kipKupPlan, Integer sessionId);
    InternMentorMap addInternMentor(InternMentorMap internMentorMap);
    InternMentorMap updateInternMentor(InternMentorMap internMentorMap, Integer mentorId);
    
}
