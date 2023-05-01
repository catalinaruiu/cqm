package com.codecool.qualityapp.model;

public class QualityForm {
    private int id;
    private double score;
    private String comment;
    private String agentName;

    public QualityForm(int id, double score, String comment, String agentName) {
        this.id = id;
        this.score = score;
        this.comment = comment;
        this.agentName = agentName;
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
}
