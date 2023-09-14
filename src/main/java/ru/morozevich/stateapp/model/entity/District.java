package ru.morozevich.stateapp.model.entity;

public enum District {

    CENTAL_DISTRICT(Region.CAPITAL_REGION, true),
    FINANICIAL_DISTRICT(Region.CAPITAL_REGION, false),
    CULTURAL_DISTRICT(Region.CAPITAL_REGION, false),
    UPSTREAM_DISTRICT(Region.INDUSTRIAL_REGION, false),
    DOWNSTREAM_DISTRICT(Region.INDUSTRIAL_REGION, false),
    MANAGEMENT_DISTRICT(Region.INDUSTRIAL_REGION, true),
    PLANT_GROWING_DISTRICT(Region.RURAL_REGION, false),
    PASTORAL_DISTRICT(Region.RURAL_REGION, false),
    MARKET_DISTRICT(Region.RURAL_REGION, true),
    LIVING_DISTRICT(Region.ANCIENT_REGION, true),
    TOURISTIC_DISTRICT(Region.ANCIENT_REGION, false),
    BEACH_DISTRICT(Region.SEESIDE_REGION, false),
    NORTH_DISTRICT(Region.SEESIDE_REGION, true);

    private Region region;
    private boolean isRegionCenter;

    private District() {
    }

    private District(Region region) {
        this.region = region;
    }

    private District(Region region, boolean isRegionCenter) {
        this(region);
        this.isRegionCenter = isRegionCenter;
    }

    public Region getRegion() {
        return this.region;
    }

    public boolean isRegionCenter() {
        return isRegionCenter;
    }
}
