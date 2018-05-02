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
 * @author jesusl
 */
public class ProgramacionController implements Initializable {

    @FXML
    public static Label pel1, pel2, pel3, hr1, hr2, hr3, hr4, hr5;
    
    public void setProg(){
        pel1.setText(FXMLCarteleraController.peliculas.get(0).getNombre());
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        AddpeliculaController.funciones.mostrarf();
    }

}
