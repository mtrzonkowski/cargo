/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Michał
 */
public class Airplaine {
    
    
    private String callSign;
    
    private int dow;
    private double dowIndex;
   
    private int maxFuel;
    private double fuelIndex;
    private int fuelUsage;
    
    private int maxTTL;    
    private int cargoPositionNum;
    private ArrayList<String> positions;
    private HashMap<String,Integer> cargoPositionMax;
    private HashMap<String,Double> cargoPositionIndex;
    
    private int maxZFW;
    private double minZFWIndex;
    private double maxZFWIndex;
    private int maxTOW;
    private double minTOWIndex;
    private double maxTOWIndex;
    private int maxLAN;
    private double minLANIndex;
    private double maxLANIndex;

    public Airplaine(String callSign, int dow, double dowIndex, int maxFuel, double fuelIndex, int maxTTL, int cargoPositionNum, HashMap<String, Double> cargoPositionIndex, int maxZFW, double minZFWIndex, double maxZFWIndex, int maxTOW, double minTOWIndex, double maxTOWIndex, int maxLAN, double minLANIndex, double maxLANIndex) {
        this.callSign = callSign;
        this.dow = dow;
        this.dowIndex = dowIndex;
        this.maxFuel = maxFuel;
        this.fuelIndex = fuelIndex;
        this.maxTTL = maxTTL;
        this.cargoPositionNum = cargoPositionNum;
        this.cargoPositionIndex = cargoPositionIndex;
        this.maxZFW = maxZFW;
        this.minZFWIndex = minZFWIndex;
        this.maxZFWIndex = maxZFWIndex;
        this.maxTOW = maxTOW;
        this.minTOWIndex = minTOWIndex;
        this.maxTOWIndex = maxTOWIndex;
        this.maxLAN = maxLAN;
        this.minLANIndex = minLANIndex;
        this.maxLANIndex = maxLANIndex;
    }

    public int getDow() {
        return dow;
    }

    public void setDow(int dow) {
        this.dow = dow;
    }

    public double getDowIndex() {
        return dowIndex;
    }

    public void setDowIndex(double dowIndex) {
        this.dowIndex = dowIndex;
    }

    public int getMaxFuel() {
        return maxFuel;
    }

    public void setMaxFuel(int maxFuel) {
        this.maxFuel = maxFuel;
    }

    public double getFuelIndex() {
        return fuelIndex;
    }

    public void setFuelIndex(double fuelIndex) {
        this.fuelIndex = fuelIndex;
    }

    public int getMaxTTL() {
        return maxTTL;
    }

    public void setMaxTTL(int maxTTL) {
        this.maxTTL = maxTTL;
    }

    public int getCargoPositionNum() {
        return cargoPositionNum;
    }

    public void setCargoPositionNum(int cargoPositionNum) {
        this.cargoPositionNum = cargoPositionNum;
    }

    public HashMap<String, Double> getCargoPositionIndex() {
        return cargoPositionIndex;
    }

    public void setCargoPositionIndex(HashMap<String, Double> cargoPositionIndex) {
        this.cargoPositionIndex = cargoPositionIndex;
    }

    public int getMaxZFW() {
        return maxZFW;
    }

    public void setMaxZFW(int maxZFW) {
        this.maxZFW = maxZFW;
    }

    public double getMinZFWIndex() {
        return minZFWIndex;
    }

    public void setMinZFWIndex(double minZFWIndex) {
        this.minZFWIndex = minZFWIndex;
    }

    public double getMaxZFWIndex() {
        return maxZFWIndex;
    }

    public void setMaxZFWIndex(double maxZFWIndex) {
        this.maxZFWIndex = maxZFWIndex;
    }

    public int getMaxTOW() {
        return maxTOW;
    }

    public void setMaxTOW(int maxTOW) {
        this.maxTOW = maxTOW;
    }

    public double getMinTOWIndex() {
        return minTOWIndex;
    }

    public void setMinTOWIndex(double minTOWIndex) {
        this.minTOWIndex = minTOWIndex;
    }

    public double getMaxTOWIndex() {
        return maxTOWIndex;
    }

    public void setMaxTOWIndex(double maxTOWIndex) {
        this.maxTOWIndex = maxTOWIndex;
    }

    public int getMaxLAN() {
        return maxLAN;
    }

    public void setMaxLAN(int maxLAN) {
        this.maxLAN = maxLAN;
    }

    public double getMinLANIndex() {
        return minLANIndex;
    }

    public void setMinLANIndex(double minLANIndex) {
        this.minLANIndex = minLANIndex;
    }

    public double getMaxLANIndex() {
        return maxLANIndex;
    }

    public void setMaxLANIndex(double maxLANIndex) {
        this.maxLANIndex = maxLANIndex;
    }
    
    
    
}
