/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cargo;

import java.util.ArrayList;

/**
 *
 * @author Michał
 */
public class Rotation {
    
    private ArrayList<Flight> rotation;

    public Rotation(ArrayList<Flight> rotation) {
        this.rotation = rotation;
    }

    public ArrayList<Flight> getRotation() {
        return rotation;
    }

    public void setRotation(ArrayList<Flight> rotation) {
        this.rotation = rotation;
    }
    
     
    
}
