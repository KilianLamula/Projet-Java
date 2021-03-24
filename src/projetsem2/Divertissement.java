/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

/**
 *
 * @author lamul
 */
public class Divertissement extends Emission {

    protected Animateur a;

    public Divertissement(String nom, int heureDebut, Animateur a) throws HoraireInvalideException, DureeInvalideException {

        super(nom, 2, heureDebut);
        this.a = a;

        if ((heureDebut < 18)&&(heureDebut + duree > 21)) {
            throw new HoraireInvalideException("L'heure de début" +heureDebut+ "et l'heure de fin" +(heureDebut+duree)+ "doivent être fixée entre 18h et 21h");
        }
    }
    @Override
    public String toString() {
    return super.toString() + ", " + a + ')' + '\n';
    }
}

