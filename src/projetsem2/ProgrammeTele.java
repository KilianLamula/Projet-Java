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
    
    //Méthode pour gérer les trous et les chevauchements
    public void validationGrille() throws TrouException, ChevauchementException, HoraireInvalideException {
        boolean grille[] = new boolean[24];
        //On initialise toutes les cases du tableau de booléen à false
        for(int a = 0 ; a < grille.length ; a++){
            grille[a]=false;
        }
        for(Emission e : lesEmissions){
            //On remplie la grille de 'true' pour chaque heure où une émission est programmée et on gère le problème de chevauchement en même temps
            for (int i = e.getHeureDebut(); i < (e.getHeureDebut()+e.getDuree()); i++){
                if((e.getHeureDebut()+e.getDuree()) > 24){
                    throw new HoraireInvalideException("Le programme doit commencer à minuit et finir à 00h : la dernière émission ne peut donc pas aller au delà de 00h. Ainsi l'heure de début ("+e.getHeureDebut()+") avec une durée de ("+e.getDuree()+") de l'émission ("+e+") dépasse 00h.");
                }
                if(grille[i]==true){
                    throw new ChevauchementException("Il y a un chevauchement avec l'émission ("+e+") entre "+ e.getHeureDebut() +"h et "+(e.getHeureDebut()+e.getDuree())+"h.");
                }
                if(grille[i]==false){
                    grille[i]=true;
                }
            }
        }
        //On vérifie si il y a des trous (donc des 'false') dans la grille après l'avoir remplie
        for(int j = 0 ; j < grille.length ; j++){
            if(grille[j]==false){
                throw new TrouException("Il y a un trou à "+j+"h.");
            }
        }
        System.out.println("La grille est valide");
    }
}
