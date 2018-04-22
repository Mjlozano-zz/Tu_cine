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
 * @author JESÚS LOZANO
 */
public class DetallesController implements Initializable {

    @FXML
    private Label titulo_label, estreno_label,clasificacion_label,sinopsis_label,director_label,genero_label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        titulo_label.setText(FXMLCarteleraController.peliculas.get(0).getNombre());
        estreno_label.setText(FXMLCarteleraController.peliculas.get(0).getFechaEstreno());
        clasificacion_label.setText(FXMLCarteleraController.peliculas.get(0).getClasificacion());
        sinopsis_label.setText(FXMLCarteleraController.peliculas.get(0).getSinopsis());
        director_label.setText(FXMLCarteleraController.peliculas.get(0).getDirector());
        genero_label.setText(FXMLCarteleraController.peliculas.get(0).getGenero());
    }    
    
}
