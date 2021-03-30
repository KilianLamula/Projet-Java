/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author lamul
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Création de la liste d'émissions
        ArrayList<Emission> lesEmissions = new ArrayList<Emission>();
           
        try {
            //Création des émissions
            Emission e1 = new Fiction("Inception",4,0,2010,true,new Realisateur("Nolan","Christopher"));
            Emission e2 = new Reportage ("La danse des oiseaux",4,Theme.ANIMALIER);
            Emission e3 = new Fiction ("Independence",4,5,1996,true,new Realisateur("Emmerich","Roland"));
            Emission e4 = new Fiction ("Avatar",4,9,2009,true,new Realisateur("Cameron","James"));
            Emission e5 = new Fiction ("Alita",4,13,2019,true,new Realisateur("Rodriguez","Robert"));
            Emission e6 = new Fiction ("Passengers",2,17,2016,true,new Realisateur("Tyldum","Morten"));
            Emission e7 = new Divertissement ("TPMP",17,new Animateur("Hamouna","Cyril"));
            Emission e8 = new Fiction ("Interstellar",3,21,2014,false,new Realisateur("Nolan","Christopher"));
            
            //Replissage de la liste
            lesEmissions.add(e1);
            lesEmissions.add(e2);
            lesEmissions.add(e3);
            lesEmissions.add(e4);
            lesEmissions.add(e5);
            lesEmissions.add(e6);
            lesEmissions.add(e7);
            lesEmissions.add(e8);
            
        } catch (DureeInvalideException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (HoraireInvalideException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex); 
        }
        //Affichage du programme
        System.out.println("Les émissions diffusé dans la journée sont : " + '\n' + lesEmissions);
    }
    
}
