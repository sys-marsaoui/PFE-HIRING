package com.rgi.hiring.jobApplicationsManagement.repository;

import com.rgi.hiring.jobApplicationsManagement.model.Candidate;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CandidateRepository extends MongoRepository<Candidate, String> {
}
