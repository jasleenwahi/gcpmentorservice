package com.knoldus.assignmentmanagement.controller;

import com.knoldus.assignmentmanagement.model.Intern;
import com.knoldus.assignmentmanagement.service.InternService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/")
public class InternController {
    @Autowired
    private InternService internService;

    @GetMapping("/allInterns")
    public ResponseEntity<List<Intern>> getAllInterns(){
        return ResponseEntity.ok(internService.getAllInterns());
    }

    @GetMapping("/interndetails/{internId}")
    public ResponseEntity<Intern> getIntern(@PathVariable Integer internId){
        return ResponseEntity.ok(internService.getInternDetails(internId));
    }

    @PostMapping("/newintern")
    public ResponseEntity<Intern> addIntern(@RequestBody Intern intern){
        return ResponseEntity.ok(internService.addIntern(intern));
    }

    @PutMapping("/interndetails/{id}")
    public ResponseEntity<Intern> updateIntern(@PathVariable Integer id, @RequestBody Intern intern){
        return ResponseEntity.ok(internService.updateIntern(id, intern));
    }

    @DeleteMapping("/intern/{id}")
    public void deleteIntern(@PathVariable Integer id) {
        internService.deleteIntern(id);
    }
}
