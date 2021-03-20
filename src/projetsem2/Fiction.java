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
public class Fiction extends Emission{
    
    protected int annee;
    protected boolean rediffusion;
    protected Realisateur r;
    
    public Fiction(String nom, int duree, int heureDebut, int annee, boolean rediffusion, Realisateur r) {
        super(nom, duree, heureDebut);
        this.annee = annee;
        this.rediffusion = rediffusion;
        this.r = r;
    }

    public String toString() {
        return super.toString() + "annee=" + annee + ", rediffusion=" + rediffusion + ", " + r + ')' + '\n';
    }
    
}
