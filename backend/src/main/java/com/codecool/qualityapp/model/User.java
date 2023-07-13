package com.codecool.qualityapp.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            generator = "user_sequence",
            strategy = GenerationType.SEQUENCE
    )
    private Long id;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String project;
    private Position position;
    @OneToMany(mappedBy = "agentName", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evaluation> agentEvaluations;
    @OneToMany(mappedBy = "evaluator", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Evaluation> evaluatorEvaluations;

    public User() {}

    public User(String firstName, String lastName, String emailAddress, String project, Position position) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.project = project;
        this.position = position;
    }

    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public List<Evaluation> getAgentEvaluations() {
        return agentEvaluations;
    }

    public void setAgentEvaluations(List<Evaluation> agentEvaluations) {
        this.agentEvaluations = agentEvaluations;
    }

    public List<Evaluation> getEvaluatorEvaluations() {
        return evaluatorEvaluations;
    }

    public void setEvaluatorEvaluations(List<Evaluation> evaluatorEvaluations) {
        this.evaluatorEvaluations = evaluatorEvaluations;
    }
}
