package com.codeclan.example.WhiskyTracker.models;

public enum RegionType {
    HIGHLAND("Highland"),
    LOWLAND("Lowland"),
    SPEYSIDE("Speyside"),
    ISLAY("Islay"),
    CAMPBELLTOWN("Campbelltown");

    private final String name;

    RegionType(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getOrdinal(){
        return this.ordinal();
    }



}
