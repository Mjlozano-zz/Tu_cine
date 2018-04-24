/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import com.jfoenix.controls.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javax.imageio.ImageIO;

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
    
    @FXML
     GridPane asientos;
             

    Boolean[][] sala1 = new Boolean[10][13];
    Boolean[][] sala2 = new Boolean[10][13];
    Image seleccionado = new Image(getClass().getResource("Imagenes/seleccionado.png").toExternalForm());
    Image ocupado = new Image(getClass().getResource("Imagenes/ocupado.png").toExternalForm());
    Image libre = new Image(getClass().getResource("Imagenes/libre.png").toExternalForm());
    
    
    public void llenarMatriz(){
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {        
                if(i%2 != 0){
                    sala1[i][j] = true;
                }else{
                    sala1[i][j] = false;
                }
            }
        }
    }
    
    

    public void back(ActionEvent e) throws IOException {
        Parent ticket_page_parent = FXMLLoader.load(getClass().getResource("FXMLHome_page.fxml"));
        Scene tickets_scene = new Scene(ticket_page_parent);
        Stage ap_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        ap_stage.hide(); //optional
        ap_stage.setScene(tickets_scene);
        ap_stage.show();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        pelis.getItems().add("Avengers: Infinity War");
        pelis.getItems().add("Deadpool 2");
        pelis.getItems().add("El entierro de la anaconda cabezona");
        sala.getItems().add("sala 01");
        sala.getItems().add("sala 02");
        
        /*A1.setOnMouseClicked(new EventHandler<MouseEvent>(){
            @Override
            public void handle(MouseEvent event) {
                A1.setImage(image);
            }
        });*/
        
        llenarMatriz();
         for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 13; j++) {
                if(i==5){
                    i+=1;
                }
               if(sala1[i][j] == false){
                   asientos.add(new ImageView(libre), i,j,1,1);
               }else{
                   asientos.add(new ImageView(ocupado), i,j,1,1);
               }
                
            }
        }
        

    }

}
