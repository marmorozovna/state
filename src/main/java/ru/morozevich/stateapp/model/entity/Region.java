package ru.morozevich.stateapp.model.entity;

import java.util.EnumSet;
import java.util.Set;

public enum Region {
    CAPITAL_REGION,
    INDUSTRIAL_REGION,
    SEESIDE_REGION,
    RURAL_REGION,
    ANCIENT_REGION;

    public static Set <Region> getAllRegions (){
        return EnumSet.allOf(Region.class);
    }
}
