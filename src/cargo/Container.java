/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

/**
 *
 * @author Michał
 */
public class Container {
    
    
    private String number;
    private Airport depDrom;
    private Airport destDrom;
    private int load;
    private double value;

    public Container(String number, Airport depDrom, Airport destDrom, int load, double value) {
        this.number = number;
        this.depDrom = depDrom;
        this.destDrom = destDrom;
        this.load = load;
        this.value = value;
    }

    public String getNumber() {
        return number;
    }

    public Airport getDepDrom() {
        return depDrom;
    }

    public Airport getDestDrom() {
        return destDrom;
    }

    public int getLoad() {
        return load;
    }

    public double getValue() {
        return value;
    }
    
}
