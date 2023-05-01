package com.codecool.qualityapp.model;

public class QualityForm {
    private int id;
    private double score;
    private String comment;

    public QualityForm(int id, double score, String comment) {
        this.id = id;
        this.score = score;
        this.comment = comment;
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
}
