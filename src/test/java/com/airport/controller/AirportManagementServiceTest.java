package com.airport.controller;

import com.airport.dao.AirportDaoImpl;
import com.airport.dao.IAirportDao;
import com.airport.service.AirportManagementServiceImpl;
import com.airport.service.IAirportService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.mockito.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class AirportManagementServiceTest {

    private AirportDaoImpl dao;

    @Before
    public void init() throws Exception {
        //LOGGER.debug(CLASSNAME, "init()", "Executing before testcase");
        System.out.println("Before");
        dao = Mockito.mock(AirportDaoImpl.class);
        List<String> list = new ArrayList<>();
        list.add("38612,YTNC,small_airport,Tuncurry Airport,-32.150001525878906,152.48300170898438,,OC,AU,AU-NSW,,no,YTNC,,,,,");
        list.add("38612,YTNC,small_airport,Tuncurry Airport,-32.150001525878906,152.48300170898438,,OC,AU,AU-NSW,,no,YTNC,,,,,");
        list.add("38612,YTNC,small_airport,Tuncurry Airport,-32.150001525878906,152.48300170898438,,OC,AU,AU-NSW,,no,YTNC,,,,,");
        Mockito.when(dao.totalNumberOfAirports()).thenReturn(list);
    }

    @After
    public void destroy(){
        System.out.println("After");
        //LOGGER.debug(CLASSNAME, "destroy()", "Executing after testcase");
    }

    @Test()
    public void testListAllAirports() throws Exception {
        int expected = 3;
        AirportManagementServiceImpl service = new AirportManagementServiceImpl();
        int actual = service.listAllAirports();
        assertEquals(expected, actual);
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
