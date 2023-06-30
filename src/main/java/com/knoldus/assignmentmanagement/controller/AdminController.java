package com.knoldus.assignmentmanagement.controller;

import com.knoldus.assignmentmanagement.model.Intern;
import com.knoldus.assignmentmanagement.model.InternMentorMap;
import com.knoldus.assignmentmanagement.model.KipKupPlan;
import com.knoldus.assignmentmanagement.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/newsession")
    public ResponseEntity<KipKupPlan> addSession(@RequestBody KipKupPlan kipKupPlan){
        return ResponseEntity.ok(adminService.addKipKupPlan(kipKupPlan));
    }

    @PutMapping("/session/{sessionId}")
    public ResponseEntity<KipKupPlan> updateSession(@PathVariable Integer sessionId, @RequestBody KipKupPlan kipKupPlan) {
        return ResponseEntity.ok(adminService.updateKipKupPlan(kipKupPlan, sessionId));
    }

    @PostMapping("/internmentor")
    public ResponseEntity<InternMentorMap> addInternMentorMap(@RequestBody InternMentorMap internMentorMap) {
        return ResponseEntity.ok(adminService.addInternMentor(internMentorMap));
    }

    @PutMapping("/mentor/{internId}")
    public ResponseEntity<InternMentorMap> updateMentorForIntern(@RequestBody InternMentorMap internMentorMap, @PathVariable Integer internId){
        return ResponseEntity.ok(adminService.updateInternMentor(internMentorMap, internId));
    }
}
