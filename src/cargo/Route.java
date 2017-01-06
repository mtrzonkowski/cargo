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
public class Route {
    
    private Airport depDrom;
    private Airport destDrom;

    public Route(Airport depDrom, Airport destDrom) {
        this.depDrom = depDrom;
        this.destDrom = destDrom;
    }

    public Airport getDepDrom() {
        return depDrom;
    }

    public void setDepDrom(Airport depDrom) {
        this.depDrom = depDrom;
    }

    public Airport getDestDrom() {
        return destDrom;
    }

    public void setDestDrom(Airport destDrom) {
        this.destDrom = destDrom;
    }
    
    public double getDistance(){
        return Math.acos((Math.sin(this.getDepDrom().getLatitude())*Math.sin(this.getDestDrom().getLatitude()))+(Math.cos(this.getDepDrom().getLatitude())*Math.cos(this.getDestDrom().getLatitude())*Math.cos(this.getDepDrom().getLongitude()-this.getDestDrom().getLongitude())));
    }
    
}
