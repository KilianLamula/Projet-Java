/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author lamul
 */
public class JTableGrille extends JFrame {

    public JTableGrille() throws HoraireInvalideException, DureeInvalideException {
        super();
        
    //Création de la liste d'émissions
    ArrayList<Emission> lesEmissions = new ArrayList<Emission>();

    //Création des émissions
    Emission e1 = new Emission("Fiction","Inception", 4, 0);
    Emission e2 = new Emission("Reportage","La danse des oiseaux",1,4);
//    Emission e3 = new Fiction("Independence", 4, 5, 1996, true, new Realisateur("Emmerich", "Roland"));
//    Emission e4 = new Fiction("Avatar", 3, 9, 2009, true, new Realisateur("Cameron", "James"));
//    Emission e5 = new Fiction("Alita", 4, 12, 2019, true, new Realisateur("Rodriguez", "Robert"));
//    Emission e6 = new Fiction("Passengers", 3, 16, 2016, true, new Realisateur("Tyldum", "Morten"));
//    Emission e7 = new Divertissement("TPMP", 19, new Animateur("Hanouna", "Cyril"));
//    Emission e8 = new Fiction("Interstellar", 3, 21, 2014, false, new Realisateur("Nolan", "Christopher"));

    lesEmissions.add (e1);
    lesEmissions.add (e2);
//    lesEmissions.add (e3);
//    lesEmissions.add (e4);
//    lesEmissions.add (e5);
//    lesEmissions.add (e6);
//    lesEmissions.add (e7);
//    lesEmissions.add (e8);

        setTitle("Programme");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTable tableau = new JTable(new JTableModele());
        
        tableau.addEmission(lesEmissions);

        getContentPane().add(new JScrollPane(tableau), BorderLayout.CENTER);

        pack();
    }

    public static void main(String[] args) throws HoraireInvalideException, DureeInvalideException {
        new JTableGrille().setVisible(true);
    }
}
