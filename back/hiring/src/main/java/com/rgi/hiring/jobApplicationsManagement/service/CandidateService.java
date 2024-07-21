package com.rgi.hiring.jobApplicationsManagement.service;

import com.rgi.hiring.jobApplicationsManagement.model.Candidate;
import com.rgi.hiring.jobApplicationsManagement.repository.CandidateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidateService {
    @Autowired
    private CandidateRepository repository;

    public List<Candidate> getAllCandidates() {
        return repository.findAll();
    }

    public Candidate getCandidateById(String id) {
        return repository.findById(id).orElse(null);
    }

    public Candidate createOrUpdateCandidate(Candidate candidate) {
        return repository.save(candidate);
    }

    public void deleteCandidate(String id) {
        repository.deleteById(id);
    }
}
