/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JESÚS LOZANO
 */
public class AddpeliculaController implements Initializable {

    @FXML
    private JFXTextField nombrepeltxt, clastxt, generotxt, directortxt;
    @FXML
    private JFXTextArea sinoptxt;
    @FXML
    private JFXComboBox<String> tipopel, puntuaciontxt;
    
    public void agregar(ActionEvent e){
        FXMLCarteleraController.peliculas.add(new Pelicula(nombrepeltxt.getText(), clastxt.getText(),generotxt.getText(),sinoptxt.getText(), tipopel.getSelectionModel().getSelectedItem() ,directortxt.getText(), puntuaciontxt.getSelectionModel().getSelectedItem()));
        System.out.println(FXMLCarteleraController.peliculas.get(0));
    }
    
    public void back(ActionEvent e) throws IOException{
        Parent home_page_parent = FXMLLoader.load(getClass().getResource("FXMLCartelera.fxml"));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tipopel.getItems().add("3D");
        tipopel.getItems().add("2D");
        tipopel.getItems().add("3D-2D");
        puntuaciontxt.getItems().add("1");
        puntuaciontxt.getItems().add("2");
        puntuaciontxt.getItems().add("3");
        puntuaciontxt.getItems().add("4");
        puntuaciontxt.getItems().add("5");
    }    
    
}
