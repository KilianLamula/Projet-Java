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
public class Fiction extends Emission {

    protected int annee;
    protected boolean rediffusion;
    protected Realisateur r;

    public Fiction(String nom, int duree, int heureDebut, int annee, boolean rediffusion, Realisateur r) throws HoraireInvalideException {
        super(nom, duree, heureDebut);
        this.annee = annee;
        this.rediffusion = rediffusion;
        this.r = r;
        if (rediffusion == false && heureDebut < 21) {
            throw new HoraireInvalideException("Si une émission de Fiction n'est pas rediffusée, elle doit commencer après 21h et ne peut donc pas commencer à " + heureDebut + "h.");
        }
    }

    public String toString() {
        return super.toString() + "annee=" + annee + ", rediffusion=" + rediffusion + ", " + r + ')' + '\n';
    }

}
