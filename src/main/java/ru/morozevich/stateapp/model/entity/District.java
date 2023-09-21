package ru.morozevich.stateapp.model.entity;

public enum District {

    CENTAL_DISTRICT(Region.CAPITAL_REGION, true, "Центральный район"),
    FINANICIAL_DISTRICT(Region.CAPITAL_REGION, false),
    CULTURAL_DISTRICT(Region.CAPITAL_REGION, false),
    UPSTREAM_DISTRICT(Region.INDUSTRIAL_REGION, false),
    DOWNSTREAM_DISTRICT(Region.INDUSTRIAL_REGION, false),
    MANAGEMENT_DISTRICT(Region.INDUSTRIAL_REGION, true, "Управленческий район"),
    PLANT_GROWING_DISTRICT(Region.RURAL_REGION, false),
    PASTORAL_DISTRICT(Region.RURAL_REGION, false),
    MARKET_DISTRICT(Region.RURAL_REGION, true, "Рыночный район"),
    LIVING_DISTRICT(Region.ANCIENT_REGION, true, "Жилой район"),
    TOURISTIC_DISTRICT(Region.ANCIENT_REGION, false),
    BEACH_DISTRICT(Region.SEESIDE_REGION, false),
    NORTH_DISTRICT(Region.SEESIDE_REGION, true, "Северный район");

    private final Region region;
    private boolean isRegionCenter;

    private String name;

    District(Region region) {
        this.region = region;
    }

    District(Region region, boolean isRegionCenter) {
        this(region);
        this.isRegionCenter = isRegionCenter;
    }

    District(Region region, boolean isRegionCenter, String name) {
        this(region, isRegionCenter);
        this.name = name;
    }

    public Region getRegion() {
        return this.region;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
