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
public class Reportage extends Emission {
    
    protected Theme theme;
    
    public Reportage(String nom, int duree, int heureDebut, Theme theme) {
        super(nom, 1, heureDebut);
        this.theme = theme;
    }

    public String toString() {
        return super.toString() + "theme=" + theme + ')' + '\n';
    }
    
}
