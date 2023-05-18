package com.codecool.qualityapp.model;

public class SoftSkills {
    private byte empathy;
    private byte furtherAssistance;

    public SoftSkills(byte empathy, byte furtherAssistance) {
        this.empathy = empathy;
        this.furtherAssistance = furtherAssistance;
    }

    public byte getEmpathy() {
        return empathy;
    }

    public void setEmpathy(byte empathy) {
        this.empathy = empathy;
    }

    public byte getFurtherAssistance() {
        return furtherAssistance;
    }

    public void setFurtherAssistance(byte furtherAssistance) {
        this.furtherAssistance = furtherAssistance;
    }
}
