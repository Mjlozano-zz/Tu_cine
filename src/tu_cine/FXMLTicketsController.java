/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import com.jfoenix.controls.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * FXML Controller class
 *
 * @author JESÚS LOZANO
 */
public class FXMLTicketsController implements Initializable {

    @FXML
    JFXComboBox<String> pel, sala;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pel.getItems().add("Avengers: Infinity war");
        pel.getItems().add("El entierro de la anaconda cabezona");
        pel.getItems().add("Acuestate conmigo y seras madre ;)");
        sala.getItems().add("sala 01");
        sala.getItems().add("sala 02");
    }    
    
}
