package com.codecool.qualityapp.model;

public class ToolsUsage {
    private byte usedToolsEfficiently;
    private byte callDocumentation;

    public ToolsUsage(byte usedToolsEfficiently, byte callDocumentation) {
        this.usedToolsEfficiently = usedToolsEfficiently;
        this.callDocumentation = callDocumentation;
    }

    public byte getUsedToolsEfficiently() {
        return usedToolsEfficiently;
    }

    public void setUsedToolsEfficiently(byte usedToolsEfficiently) {
        this.usedToolsEfficiently = usedToolsEfficiently;
    }

    public byte getCallDocumentation() {
        return callDocumentation;
    }

    public void setCallDocumentation(byte callDocumentation) {
        this.callDocumentation = callDocumentation;
    }
}
