/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetsem2;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lamul
 */
public class JTableModele extends AbstractTableModel {
    
    private final Emission[] emissions;

    private final String[] entetes = {"Heure début", "Type", "Nom", "Durée"};

    public JTableModele() throws HoraireInvalideException, DureeInvalideException {
        super();
        
        emissions = new Emission[]{};
        
        //        emissions = new Emission[]{
//            new Emission("Fiction", "Inception", 4, 0),
//            new Emission("Reportage", "La danse des oiseaux", 4, 1),
//            new Emission("Fiction", "Independence", 4, 5),
//            new Emission("Fiction", "Avatar", 3, 9),
//            new Emission("Fiction", "Alita", 4, 12),
//            new Emission("Fiction", "Passengers", 3, 16),
//            new Emission("Divertissement", "TPMP", 2, 19),
//            new Emission("Fiction", "Interstellar", 3, 21)
    }
    
    public void addEmission(ArrayList<Emission> lesEmissions){
        for(int i=0;i<emissions.length;i++) {
            emissions[i] = lesEmissions.get(i);
        }
    }

    public int getRowCount() {
        return emissions.length;
    }

    public int getColumnCount() {
        return entetes.length;
    }

    public String getColumnName(int columnIndex) {
        return entetes[columnIndex];
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return emissions[rowIndex].getHeureDebut();
            case 1:
                return emissions[rowIndex].getType();
            case 2:
                return emissions[rowIndex].getNom();
            case 3:
                return emissions[rowIndex].getDuree();
            default:
                return null; //Ne devrait jamais arriver
        }
    }
}
