package com.airport.controller;

import com.airport.logger.ApplicationLogger;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AirportManagementControllerTest {
    private static final String CLASSNAME = AirportManagementControllerTest.class.getName();
    //private ApplicationLogger LOGGER = new ApplicationLogger();

    @Before
    public void init(){
            //LOGGER.debug(CLASSNAME, "init()", "Executing before testcase");
        System.out.println("Before");
    }

    @After
    public void destroy(){
        System.out.println("After");
        //LOGGER.debug(CLASSNAME, "destroy()", "Executing after testcase");
    }

    @Test
    public void testListAllAirports() {
        fail("Not implemented");
    }

    @Test
    public void testFindAirportsByName() {
        fail("Not Yet Impemented");
    }

    @Test
    public void testFindAirportsByCountry() {
        fail("Not Yet Impemented");
    }

    @Test
    public void testFindAirportsBySize() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindAirportsByRunways() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindHelipads() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testFindAirportsByContinent() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListAllRegions() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListAllNavaids() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testGetRandomAirport() {
        fail("Not Yet Implemented");
    }
    @Test
    public void testListCountries() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testListContinents() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testLogin() {
        fail("Not Yet Implemented");
    }

    @Test
    public void testSignup() {
        fail("Not Yet Implemented");
    }
    @Test
    public void testHelp(){
        fail("Not Yet Implemented");
    }
    @Test
    public void listAirportsSorted(){
        fail("Not Yet Implemented");
    }
    @Test
    public void listAirportsPaginated(){
        fail("Not Yet Implemented");
    }

}
