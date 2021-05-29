package com.airport.dao;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.io.BufferedReader;
import java.io.StringReader;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AirportDaoImpl implements IAirportDao {

    @Value("${CSV_LOCATION}")
    private String airportCSVLocation;

    @Override
    public List<String> totalNumberOfAirports() throws Exception {

        HttpRequest request = HttpRequest.newBuilder(new URI(airportCSVLocation))
                .GET()
                .timeout(Duration.ofMinutes(1)).build();
        HttpResponse<String> response = HttpClient.newHttpClient()
                .send(request, HttpResponse.BodyHandlers.ofString());

        BufferedReader reader = new BufferedReader(new StringReader(response.body()));
        String line = "";
        List<String> airports = new ArrayList<>();
        while((line = reader.readLine()) != null){
            airports.add(line.replace("\"", ""));
        }
        return airports;
    }
}
