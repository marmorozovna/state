package ru.morozevich.stateapp.model.service;

import ru.morozevich.stateapp.model.entity.District;
import ru.morozevich.stateapp.model.entity.Region;

import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;

public class RegionService {
    public static int countRegions() {
        return Region.getAllRegions().size();
    }

    public static String getAllRegionCenters() {
        List<District> allRegionCenters = new ArrayList<>();
        EnumSet<District> allDistrict = EnumSet.allOf(District.class);
        for (District district : allDistrict) {
            if (district.isRegionCenter()) {
                allRegionCenters.add(district);
            }
        }
        return allRegionCenters.toString();
    }
}
