package com.airport.model;

/**
 * @author Sanyog Varshney
 * @since 1.0
 * @version 1.0
 * @apiNote MODEL
 */
public class Airport {

    private int id;
    private String type;
    private String name;
    private int elevation_ft;
    private String isoCountry;
    private String isoRegion;

    public Airport(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElevation_ft() {
        return elevation_ft;
    }

    public void setElevation_ft(int elevation_ft) {
        this.elevation_ft = elevation_ft;
    }

    public String getIsoCountry() {
        return isoCountry;
    }

    public void setIsoCountry(String isoCountry) {
        this.isoCountry = isoCountry;
    }

    public String getIsoRegion() {
        return isoRegion;
    }

    public void setIsoRegion(String isoRegion) {
        this.isoRegion = isoRegion;
    }
}
