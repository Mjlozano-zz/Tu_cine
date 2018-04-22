/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import com.jfoenix.controls.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
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
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JESÚS LOZANO
 */
public class TicketsController implements Initializable {

    @FXML
    ImageView A1;
    
    @FXML
    JFXComboBox<String> pelis, sala;        
    
    Boolean[][] sala1 = new Boolean[10][8];
    Boolean[][] sala2 = new Boolean[10][8];
    
    public void cambiarEstado() throws FileNotFoundException {
        Image image = new Image(new FileInputStream("Imagenes/seleccionado.png"));
        A1.setImage(image);
    }
    public void back(ActionEvent e) throws IOException{
        Parent ticket_page_parent = FXMLLoader.load(getClass().getResource("FXMLHome_page.fxml"));
        Scene tickets_scene = new Scene(ticket_page_parent);
        Stage ap_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        ap_stage.hide(); //optional
        ap_stage.setScene(tickets_scene);
        ap_stage.show();
    }
    
    public void comprarTicket(ActionEvent e){
        
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        pelis.getItems().add("Avengers: Infinity War");
        pelis.getItems().add("Deadpool 2");
        pelis.getItems().add("El entierro de la anaconda cabezona");
        sala.getItems().add("sala 01");
        sala.getItems().add("sala 02");
        
    }

}
