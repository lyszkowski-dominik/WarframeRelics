package com.relicsearcher;

public class MissionPrototype {
    String missionType;
    String missionTier;
    String missionRotation;
    double missionDropChance;

    public String getMissionType() {
        return missionType;
    }

    public String getMissionTier() {
        return missionTier;
    }

    public String getMissionRotation() {
        return missionRotation;
    }

    public double getMissionDropChance() {
        return missionDropChance;
    }

    public MissionPrototype(String missionType, String missionTier, String missionRotation, double missionDropChance) {
        this.missionType = missionType;
        this.missionTier = missionTier;
        this.missionRotation = missionRotation;
        this.missionDropChance = missionDropChance;
    }
}
