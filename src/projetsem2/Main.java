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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Emissions e1 = Fiction (Inception,4,0,Nolan,Christopher,2010,True);
        Emissions e2 = Reportage (La danse des oiseaux,1,4,Animalier);
        Emissions e3 = Fiction (Independence,4,5,Emmerich,Roland,1996,True);
        Emissions e4 = Fiction (Avatar,4,9,Cameron,James,2009,True);   
        Emissions e5 = Fiction (Alita,4,13,Rodriguez,Robert,2019,True);
        Emissions e6 = Fiction (Passengers,2,17,Tyldum,Morten,2016,True);
        Emissions e7 = Divertissement (TPMP,2,19,Hamouna,Cyril);
        Emissions e8 = Fiction (Interstellar,3,21,Nolan,Christopher,2014,False);
                
        //Création de la liste d'émissions
        ArrayList<Emissions> lesEmissions = new ArrayList<Emissions>();
        lesEmissions.add(e1);
        lesEmissions.add(e2);
        lesEmissions.add(e3);
        lesEmissions.add(e4);
        lesEmissions.add(e5);
        lesEmissions.add(e6);
        lesEmissions.add(e7);
        lesEmissions.add(e8);
        
        System.out.println("Les émissions diffusé dans la journée sont : " +lesEmissions);
    }
    
}
