/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import com.jfoenix.controls.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * FXML Controller class
 *
 * @author JESÚS LOZANO
 */
public class FXMLHome_pageController implements Initializable {

       public void openTickets(ActionEvent e) throws IOException {
        Parent ticket_page_parent = FXMLLoader.load(getClass().getResource("Tickets.fxml"));
        Scene tickets_scene = new Scene(ticket_page_parent);
        Stage ap_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        ap_stage.hide(); //optional
        ap_stage.setScene(tickets_scene);
        ap_stage.show();
        
        
    }
       public void openPeliculas(ActionEvent e) throws IOException{
        Parent ticket_page_parent = FXMLLoader.load(getClass().getResource("FXMLCartelera.fxml"));
        Scene tickets_scene = new Scene(ticket_page_parent);
        Stage ap_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        ap_stage.hide(); //optional
        ap_stage.setScene(tickets_scene);
        ap_stage.show();
             
       }
       public void openCombo(ActionEvent e) throws IOException{
        Parent ticket_page_parent = FXMLLoader.load(getClass().getResource("VentaCombos.fxml"));
        Scene tickets_scene = new Scene(ticket_page_parent);
        Stage ap_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        ap_stage.hide(); //optional
        ap_stage.setScene(tickets_scene);
        ap_stage.show();
             
       }
        public void openTarifas(ActionEvent e) throws IOException{
        Parent ticket_page_parent = FXMLLoader.load(getClass().getResource("Tarifas.fxml"));
        Scene tickets_scene = new Scene(ticket_page_parent);
        Stage ap_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        //ap_stage.hide(); //optional
        ap_stage.setScene(tickets_scene);
        ap_stage.show();           
       }
        
       public void  mostrarLista(){
           TicketsController.tiquetes.mostrar();        
        }
       
       


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
      
    }

}
