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
public class ProgrammeTele extends ArrayList {
    
    private ArrayList<Emission> lesEmissions;

    public ProgrammeTele(ArrayList<Emission> lesEmissions) {
        this.lesEmissions = lesEmissions;
    }
    
    public String toString() {
        return "Le programme télé est : " + lesEmissions;
    }
    
    
}
