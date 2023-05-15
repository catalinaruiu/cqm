package com.codecool.qualityapp.model;

public class Evaluation {
    private int id;
    private double score;
    private String comment;
    private String agentName;
    private int callDuration;

    public Evaluation(int id, double score, String comment, String agentName, int callDuration) {
        this.id = id;
        this.score = score;
        this.comment = comment;
        this.agentName = agentName;
        this.callDuration = callDuration;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getAgentName() {
        return agentName;
    }

    public void setAgentName(String agentName) {
        this.agentName = agentName;
    }

    public int getCallDuration() {
        return callDuration;
    }

    public void setCallDuration(int callDuration) {
        this.callDuration = callDuration;
    }
}
