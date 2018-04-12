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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author JESÚS LOZANO
 */
public class FXMLDocumentController implements Initializable {
    //@FXML 
    //private JFXButton loginB;
    
    @FXML
    private void gotoHome(ActionEvent e)throws IOException {         
        openWindow(e, "FXMLHome_page.fxml");
    }
    
    @FXML 
    private void openWindow(ActionEvent e, String file) throws IOException{
        Parent home_page_parent = FXMLLoader.load(getClass().getResource(file));
        Scene home_page_scene = new Scene(home_page_parent);
        Stage app_stage = (Stage) ((Node) e.getSource()).getScene().getWindow();
        
        app_stage.hide(); //optional
        app_stage.setScene(home_page_scene);
        app_stage.show();
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
