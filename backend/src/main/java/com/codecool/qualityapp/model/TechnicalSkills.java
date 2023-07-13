package com.codecool.qualityapp.model;

import jakarta.persistence.*;

@Embeddable
public class TechnicalSkills {
    private byte troubleshootingOrder;
    private byte troubleshootingCompletion;

    public TechnicalSkills() {}

    public TechnicalSkills(byte troubleshootingOrder, byte troubleshootingCompletion) {
        this.troubleshootingOrder = troubleshootingOrder;
        this.troubleshootingCompletion = troubleshootingCompletion;
    }

    public byte getTroubleshootingOrder() {
        return troubleshootingOrder;
    }

    public void setTroubleshootingOrder(byte troubleshootingOrder) {
        this.troubleshootingOrder = troubleshootingOrder;
    }

    public byte getTroubleshootingCompletion() {
        return troubleshootingCompletion;
    }

    public void setTroubleshootingCompletion(byte troubleshootingCompletion) {
        this.troubleshootingCompletion = troubleshootingCompletion;
    }
}
