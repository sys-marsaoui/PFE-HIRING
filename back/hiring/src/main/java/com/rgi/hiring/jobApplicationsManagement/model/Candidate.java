package com.rgi.hiring.jobApplicationsManagement.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "candidates")
public class Candidate {
    @Id
    private String id;
    private String name;
    private String email;
    private String resume;

    public Candidate(String id, String name, String email, String resume) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.resume = resume;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }
}
