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
        
        Emission e1 = Fiction (Inception,4,0,Nolan,Christopher,2010,True);
        Emission e2 = Reportage (La danse des oiseaux,1,4,Animalier);
        Emission e3 = Fiction (Independence,4,5,Emmerich,Roland,1996,True);
        Emission e4 = Fiction (Avatar,4,9,Cameron,James,2009,True);   
        Emission e5 = Fiction (Alita,4,13,Rodriguez,Robert,2019,True);
        Emission e6 = Fiction (Passengers,2,17,Tyldum,Morten,2016,True);
        Emission e7 = Divertissement (TPMP,2,19,Hamouna,Cyril);
        Emission e8 = Fiction (Interstellar,3,21,Nolan,Christopher,2014,False);
                
        //Création de la liste d'émissions
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
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
