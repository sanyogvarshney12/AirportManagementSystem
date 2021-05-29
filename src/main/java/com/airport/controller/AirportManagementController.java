package com.airport.controller;

import com.airport.logger.ApplicationLogger;

/**
 * @author Sanyog Varshney
 * @since 1.0
 * @version 1.0
 * @apiNote REST CONTROLLER
 */
public class AirportManagementController implements IAirportController{

    private static final String CLASSNAME = AirportManagementController.class.getName();
    private ApplicationLogger LOGGER = new ApplicationLogger();

    @Override
    public void listAllAirports() {
        String METHOD = "listAllAirports()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void findAirportsByName() {
        String METHOD = "findAirportsByName()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void findAirportsByCountry() {
        String METHOD = "findAirportsByCountry()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void findAirportsBySize() {
        String METHOD = "findAirportsBySize()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void findAirportsByRunways() {
        String METHOD = "findAirportsByRunways()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void findAirportsByContinent() {
        String METHOD = "findAirportsByContinent()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void listAllRegions() {
        String METHOD = "listAllRegions()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void listAllNavaids() {
        String METHOD = "listAllNavaids()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void getRandomAirport() {
        String METHOD = "getRandomAirport()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void listAllCountries() {
        String METHOD = "listAllCountries()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void login() {
        String METHOD = "login()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }

    @Override
    public void signup() {
        String METHOD = "signup()";
        LOGGER.debug(CLASSNAME, METHOD, "method Started");
    }
}
