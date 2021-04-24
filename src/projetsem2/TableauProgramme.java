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
public class TableauProgramme {
    
    //Remarque cette classe est testée dans le main 'ProgrammeEtSauvegarde'
    
    ArrayList<Emission> emissions = new ArrayList<Emission>();
    
    public TableauProgramme(ArrayList<Emission> emissions) {
        this.emissions = emissions;
    }
    
    public void getEmission(){
        
        //On initialise la fenêtre
        JFrame window = new JFrame();
        window.setLocationRelativeTo(null);
        window.setTitle("Programme du jour");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(400,600);
        
        //On créé la liste qu'on va remplir avec les attributs qu'on veut dans notre tableau
        ArrayList<ListePourTableau> lesEmissions = new ArrayList<ListePourTableau>();
        
        //On remplit la liste
        for(Emission e : emissions){
            ListePourTableau list = new ListePourTableau(e.heureDebut, e.type, e.nom, e.duree);
            lesEmissions.add(list);
        }
        
        //On organise les colonnes et les lignes du tableau
        Object data [][] = new Object[lesEmissions.size()][4];
        for(int j=0; j<lesEmissions.size(); j++){
            data[j][0]=lesEmissions.get(j).heureDebut;
            data[j][1]=lesEmissions.get(j).type;
            data[j][2]=lesEmissions.get(j).nom;
            data[j][3]=lesEmissions.get(j).duree;
        }
        
        //On créé le tableau
        String title[] = {"Heure de début", "Type d'émission", "Nom de l'émission", "Durée"};
        JTable tableau = new JTable(data,title);
        window.getContentPane().add(tableau.getTableHeader(), BorderLayout.NORTH);
        window.getContentPane().add(tableau, BorderLayout.CENTER);
        
        window.add(tableau);
        window.setVisible(true);
    }
}
