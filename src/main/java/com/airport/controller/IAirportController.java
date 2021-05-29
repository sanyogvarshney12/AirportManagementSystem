package com.airport.controller;

/**
 * @author Sanyog Varshney
 * @since 1.0
 * @version 1.0
 * @apiNote Controller Interface
 */
public interface IAirportController {

    public void listAllAirports();
    public void findAirportsByName();
    public void findAirportsByCountry();
    public void findAirportsBySize();
    public void findAirportsByRunways();
    public void findAirportsByContinent();
    public void listAllRegions();
    public void listAllNavaids();
    public void getRandomAirport();
    public void listAllCountries();
    public void login();
    public void signup();
}
