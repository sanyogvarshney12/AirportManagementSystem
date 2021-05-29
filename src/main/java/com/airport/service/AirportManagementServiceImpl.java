package com.airport.service;

import com.airport.constants.AirportType;
import com.airport.dao.AirportDaoImpl;
import com.airport.logger.ApplicationLogger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Sanyog Varshney
 * @since 1.0
 * @version 1.0
 * @apiNote SERVICE
 */

@Service
public class AirportManagementServiceImpl implements IAirportService {

    @Autowired
    private AirportDaoImpl dao;

    private static final String CLASSNAME = AirportManagementServiceImpl.class.getName();
    private final ApplicationLogger LOGGER = new ApplicationLogger();
    private static final String METHODSTARTED_MSG = "**** Method Started ****";

    @Override
    public int listAllAirports() throws Exception {
        String METHOD = "listAllAirports()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);

        List<String> airports = dao.totalNumberOfAirports();

        List<String> smallAirports = airports.stream().filter(airport->smallAirport(airport))
                .collect(Collectors.toList());
        smallAirports.stream().forEach(System.out::println);
        List<String> largeAirports = airports.stream().filter(airport->largeAirport(airport))
                .collect(Collectors.toList());
        List<String> mediumAirports = airports.stream().filter(airport->mediumAirport(airport))
                .collect(Collectors.toList());
        List<String> heliport = airports.stream().filter(airport->heliport(airport))
                .collect(Collectors.toList());
        List<String> closed = airports.stream().filter(airport->closed(airport))
                .collect(Collectors.toList());
        List<String> baloonAirports = airports.stream().filter(airport->baloonAirport(airport))
                .collect(Collectors.toList());
        List<String> seaplaneBase = airports.stream().filter(airport->seaplaneBase(airport))
                .collect(Collectors.toList());

        int totalAirports = smallAirports.size()+largeAirports.size()+mediumAirports.size()
                +closed.size()+baloonAirports.size()+heliport.size()+seaplaneBase.size();
        System.out.println("Total Airports found : "+totalAirports);
        return totalAirports;
    }

    @Override
    public void findAirportsByName() {
        String METHOD = "findAirportsByName()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void findAirportsByCountry() {
        String METHOD = "findAirportsByCountry()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void findAirportsBySize() {
        String METHOD = "findAirportsBySize()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void findAirportsByRunways() {
        String METHOD = "findAirportsByRunways()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void findAirportsByContinent() {
        String METHOD = "findAirportsByContinent()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void listAllRegions() {
        String METHOD = "listAllRegions()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void listAllNavaids() {
        String METHOD = "listAllNavaids()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void getRandomAirport() {
        String METHOD = "getRandomAirport()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void listAllCountries() {
        String METHOD = "listAllCountries()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void login() {
        String METHOD = "login()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    @Override
    public void signup() {
        String METHOD = "signup()";
        LOGGER.debug(CLASSNAME, METHOD, METHODSTARTED_MSG);
    }

    public boolean smallAirport(String airport){
        return airport.contains(AirportType.SMALLAIRPORT.name());
    }

    public boolean largeAirport(String airport){
        return airport.contains(AirportType.LARGEAIRPORT.name());
    }

    public boolean mediumAirport(String airport){
        return airport.contains(AirportType.MEDIUMAIRPORT.name());
    }

    public boolean baloonAirport(String airport){
        return airport.contains(AirportType.BALOONAIRPORT.name());
    }

    public boolean heliport(String airport){
        return airport.contains(AirportType.HELIPORT.name());
    }

    public boolean closed(String airport){
        return airport.contains(AirportType.CLOSED.name());
    }

    public boolean seaplaneBase(String airport){
        return airport.contains(AirportType.SEAPLANEBASE.name());
    }

}
