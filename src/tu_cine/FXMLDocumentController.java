/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu_cine;

import com.jfoenix.controls.*;
import java.io.*;
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
import javax.swing.JOptionPane;

/**
 *
 * @author JESÚS LOZANO
 */
public class FXMLDocumentController implements Initializable {
    @FXML 
    private JFXTextField txtnombre, txtapellidos, txtemail, txtdocumento;
    private JFXPasswordField txtcontraseña;
    
    
    @FXML
    private void gotoHome(ActionEvent e)throws IOException {         
        openWindow(e, "FXMLHome_page.fxml");
    }
    
    @FXML
    private void registrar(ActionEvent ev)throws IOException{
       File f = null;
       FileWriter w;
       BufferedWriter bw;
       try {
            f = new File("Usuarios.txt");
            w = new FileWriter(f, true);
            bw = new BufferedWriter(w);
            bw.write(txtnombre.getText()+" | "+ txtapellidos.getText()+" | "+txtemail.getText()+ " | "+txtdocumento.getText());
            bw.newLine();
            bw.write("----------------------------------------------------");
            bw.newLine();
            bw.close();
            creaNombreUsuario();
            idUsuarios();
            cleanRegistro();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha habido un error! " + e);
        }
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
    
    @FXML
    private void cleanRegistro(){
        txtnombre.setText("");
        txtapellidos.setText("");
        txtemail.setText("");
        txtdocumento.setText("");
    }
   
    private String creaNombreUsuario(){
        String usuario;
        String[] mail = txtemail.getText().split("@");
        usuario = mail[0];
        return usuario;
    }
    
    private void idUsuarios(){
        File f = null;
       FileWriter w;
       BufferedWriter bw;
       try {
            f = new File("IDusuarios.txt");
            w = new FileWriter(f, true);
            bw = new BufferedWriter(w);
            bw.write(creaNombreUsuario()+",");
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Ha habido un error! " + e);
        }
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
