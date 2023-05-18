package com.codecool.qualityapp.model;

import java.util.Date;

public class Evaluation {
    private long id;
    private EvaluationType type;
    private User agentName;
    private Date callDate;
    private int callDuration;
    private Date evaluationDate;
    private User evaluator;
    private SoftSkills softSkills;
    private CommunicationSkills communicationSkills;
    private TechnicalSkills technicalSkills;
    private ToolsUsage toolsUsage;
    private double score;
    private String comment;
    private boolean acknowledged;
    private String agentComment;

    public Evaluation(EvaluationType type,
                      User agentName,
                      Date callDate,
                      int callDuration,
                      Date evaluationDate,
                      User evaluator,
                      SoftSkills softSkills,
                      CommunicationSkills communicationSkills,
                      TechnicalSkills technicalSkills,
                      ToolsUsage toolsUsage,
                      double score,
                      String comment,
                      boolean acknowledged) {
        this.type = type;
        this.agentName = agentName;
        this.callDate = callDate;
        this.callDuration = callDuration;
        this.evaluationDate = evaluationDate;
        this.evaluator = evaluator;
        this.softSkills = softSkills;
        this.communicationSkills = communicationSkills;
        this.technicalSkills = technicalSkills;
        this.toolsUsage = toolsUsage;
        this.score = score;
        this.comment = comment;
        this.acknowledged = acknowledged;
    }

    public long getId() {
        return id;
    }

    public EvaluationType getType() {
        return type;
    }

    public void setType(EvaluationType type) {
        this.type = type;
    }

    public User getAgentName() {
        return agentName;
    }

    public void setAgentName(User agentName) {
        this.agentName = agentName;
    }

    public Date getCallDate() {
        return callDate;
    }

    public void setCallDate(Date callDate) {
        this.callDate = callDate;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }

    public Date getEvaluationDate() {
        return evaluationDate;
    }

    public void setEvaluationDate(Date evaluationDate) {
        this.evaluationDate = evaluationDate;
    }

    public User getEvaluator() {
        return evaluator;
    }

    public void setEvaluator(User evaluator) {
        this.evaluator = evaluator;
    }

    public SoftSkills getSoftSkills() {
        return softSkills;
    }

    public void setSoftSkills(SoftSkills softSkills) {
        this.softSkills = softSkills;
    }

    public CommunicationSkills getCommunicationSkills() {
        return communicationSkills;
    }

    public void setCommunicationSkills(CommunicationSkills communicationSkills) {
        this.communicationSkills = communicationSkills;
    }

    public TechnicalSkills getTechnicalSkills() {
        return technicalSkills;
    }

    public void setTechnicalSkills(TechnicalSkills technicalSkills) {
        this.technicalSkills = technicalSkills;
    }

    public ToolsUsage getToolsUsage() {
        return toolsUsage;
    }

    public void setToolsUsage(ToolsUsage toolsUsage) {
        this.toolsUsage = toolsUsage;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isAcknowledged() {
        return acknowledged;
    }

    public void setAcknowledged(boolean acknowledged) {
        this.acknowledged = acknowledged;
    }

    public String getAgentComment() {
        return agentComment;
    }

    public void setAgentComment(String agentComment) {
        this.agentComment = agentComment;
    }
}
