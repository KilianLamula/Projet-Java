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
    
    public Divertissement(String nom, int duree, int heureDebut, Animateur a) {
        super(nom, 2, heureDebut);
        this.a = a;
    }

    public String toString() {
        return super.toString() + ", " + a + ')' + '\n';
    }
    
}
