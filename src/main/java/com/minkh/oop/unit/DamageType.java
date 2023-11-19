package com.minkh.oop.unit;

public enum DamageType {

    NORMAL("Normal"),
    EXPLOSIVE("Explosive"),
    CONCUSSIVE("Concussive"),
    SPELL("Spell");

    private final String displayName;

    DamageType(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return displayName;
    }
}

