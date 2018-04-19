/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import com.jfoenix.controls.*;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Background;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author JESÚS LOZANO
 */
public class FXMLHome_pageController implements Initializable {

    @FXML
    JFXButton unoA;
    @FXML 
    Label fecha, horaa, mt;
    
    Date fechaS = new Date();
    SimpleDateFormat formato = new SimpleDateFormat("dd-MM-YYYY");
    
    Calendar calendario = Calendar.getInstance();
    String hora, minutos, segundos, aMpM;

    public void openTickets(ActionEvent e) throws IOException {
        Parent ticket_page_parent = FXMLLoader.load(getClass().getResource("FXMLTickets.fxml"));
        Scene tickets_scene = new Scene(ticket_page_parent);
        Stage ap_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        ap_stage.hide(); //optional
        ap_stage.setScene(tickets_scene);
        ap_stage.show();
    }


    @Override
    public void initialize(URL url, ResourceBundle rb) {
        fecha.setText(formato.format(fechaS));
        hora =Integer.toString(calendario.get(Calendar.HOUR_OF_DAY));
        minutos = Integer.toString(calendario.get(Calendar.MINUTE));
        segundos = Integer.toString(calendario.get(Calendar.SECOND));
        horaa.setText(hora + ":" + minutos);
        if(calendario.get(Calendar.HOUR_OF_DAY)>=12){
            mt.setText("PM");
        }else{
            mt.setText("AM");
        }
      
    }

}
