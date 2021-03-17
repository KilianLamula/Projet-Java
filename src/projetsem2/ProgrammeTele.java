/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.util.ArrayList;

/**
 *
 * @author lamul
 */
public class ProgrammeTele {
    
    private ArrayList<Emissions> lesEmissions;

    public ProgrammeTele(ArrayList<Emissions> lesEmissions) {
        this.lesEmissions = lesEmissions;
    }
    
    public String toString() {
        return "Le programme télé est : " + lesEmissions;
    }
    
    
}
