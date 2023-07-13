package com.codecool.qualityapp.model;

import jakarta.persistence.*;

@Embeddable
public class CommunicationSkills {
    private byte opening;
    private byte activeListening;
    private byte rephrasing;
    private byte deadAir;
    private byte holdProcedure;
    private byte language;
    private byte closing;

    public CommunicationSkills() {}

    public CommunicationSkills(byte opening,
                               byte activeListening,
                               byte rephrasing,
                               byte deadAir,
                               byte holdProcedure,
                               byte language,
                               byte closing) {
        this.opening = opening;
        this.activeListening = activeListening;
        this.rephrasing = rephrasing;
        this.deadAir = deadAir;
        this.holdProcedure = holdProcedure;
        this.language = language;
        this.closing = closing;
    }

    public byte getOpening() {
        return opening;
    }

    public void setOpening(byte opening) {
        this.opening = opening;
    }

    public byte getActiveListening() {
        return activeListening;
    }

    public void setActiveListening(byte activeListening) {
        this.activeListening = activeListening;
    }

    public byte getRephrasing() {
        return rephrasing;
    }

    public void setRephrasing(byte rephrasing) {
        this.rephrasing = rephrasing;
    }

    public byte getDeadAir() {
        return deadAir;
    }

    public void setDeadAir(byte deadAir) {
        this.deadAir = deadAir;
    }

    public byte getHoldProcedure() {
        return holdProcedure;
    }

    public void setHoldProcedure(byte holdProcedure) {
        this.holdProcedure = holdProcedure;
    }

    public byte getLanguage() {
        return language;
    }

    public void setLanguage(byte language) {
        this.language = language;
    }

    public byte getClosing() {
        return closing;
    }

    public void setClosing(byte closing) {
        this.closing = closing;
    }
}
