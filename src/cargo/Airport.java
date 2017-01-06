/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import java.util.HashMap;

/**
 *
 * @author Michał
 */
public class Airport {

    private static HashMap<String, Airport> airports = new HashMap<String, Airport>();

    private String icao;
    private double latitude;
    private double longitude;

    public Airport(String icao, double latitude, double longitude) {
        this.icao = icao;
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public String getIcao() {
        return icao;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

}
