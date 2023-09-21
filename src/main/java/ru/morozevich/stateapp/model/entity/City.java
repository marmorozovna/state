package ru.morozevich.stateapp.model.entity;

public enum City {
    CAPITAL_CITY(District.CENTAL_DISTRICT,  "Столица"),
    NON_CAPITAL_CITY1(District.CULTURAL_DISTRICT),
    NON_CAPITAL_CITY2(District.CULTURAL_DISTRICT),
    NON_CAPITAL_CITY3(District.FINANICIAL_DISTRICT),
    NON_CAPITAL_CITY4(District.FINANICIAL_DISTRICT),
    NON_CAPITAL_CITY5(District.DOWNSTREAM_DISTRICT),
    NON_CAPITAL_CITY6(District.UPSTREAM_DISTRICT),
    NON_CAPITAL_CITY7(District.UPSTREAM_DISTRICT),
    NON_CAPITAL_CITY8(District.MANAGEMENT_DISTRICT),
    NON_CAPITAL_CITY9(District.UPSTREAM_DISTRICT),
    NON_CAPITAL_CITY10(District.LIVING_DISTRICT),
    NON_CAPITAL_CITY11(District.LIVING_DISTRICT),
    NON_CAPITAL_CITY12(District.TOURISTIC_DISTRICT),
    NON_CAPITAL_CITY13(District.TOURISTIC_DISTRICT),
    NON_CAPITAL_CITY14(District.TOURISTIC_DISTRICT),
    NON_CAPITAL_CITY15(District.TOURISTIC_DISTRICT),
    NON_CAPITAL_CITY16(District.BEACH_DISTRICT),
    NON_CAPITAL_CITY17(District.BEACH_DISTRICT),
    NON_CAPITAL_CITY18(District.BEACH_DISTRICT),
    NON_CAPITAL_CITY19(District.BEACH_DISTRICT),
    NON_CAPITAL_CITY20(District.NORTH_DISTRICT),
    NON_CAPITAL_CITY21(District.PASTORAL_DISTRICT),
    NON_CAPITAL_CITY22(District.PLANT_GROWING_DISTRICT),
    NON_CAPITAL_CITY23(District.PASTORAL_DISTRICT),
    NON_CAPITAL_CITY24(District.MARKET_DISTRICT),
    NON_CAPITAL_CITY25(District.MARKET_DISTRICT);

    private District district;

    private String name;

    private City() {
    }

    private City(District district) {
        this.district = district;
    }

    private City(District district, String name) {
        this(district);
        this.name=name;
    }

    public District getDistrict() {
        return district;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
