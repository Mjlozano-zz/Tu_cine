/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;

/**
 * FXML Controller class
 *
 * @author Jesús Lozano
 */
public class RecaudoController implements Initializable {
    static int recaudoc = 0;
    static int recaudocc =0;
    @FXML 
    Label recaudo_tick, recaudo_combo;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        TicketsController.tiquetes.mostrar();
        recaudo_tick.setText("$"+String.valueOf(recaudoc));
        recaudo_combo.setText("$"+String.valueOf(recaudocc));
    }    
    
}
