package com.rgi.hiring.jobApplicationsManagement.controller;


import com.rgi.hiring.jobApplicationsManagement.model.Candidate;
import com.rgi.hiring.jobApplicationsManagement.service.CandidateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/candidates")
@CrossOrigin(origins = "http://localhost:4200")
public class CandidateController {
    @Autowired
    private CandidateService service;

    @GetMapping
    public List<Candidate> getAllCandidates() {
        return service.getAllCandidates();
    }

    @GetMapping("/{id}")
    public Candidate getCandidateById(@PathVariable String id) {
        return service.getCandidateById(id);
    }

    @PostMapping
    public Candidate createCandidate(@RequestBody Candidate candidate) {
        return service.createOrUpdateCandidate(candidate);
    }

    @PutMapping("/{id}")
    public Candidate updateCandidate(@PathVariable String id, @RequestBody Candidate candidate) {
        candidate.setId(id);
        return service.createOrUpdateCandidate(candidate);
    }

    @DeleteMapping("/{id}")
    public void deleteCandidate(@PathVariable String id) {
        service.deleteCandidate(id);
    }
}