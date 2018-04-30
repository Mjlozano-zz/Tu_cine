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
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import static tu_cine.FXMLCarteleraController.peliculas;

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

   static  Boolean[][] sala1 = new Boolean[10][13];
   static  Boolean[][] aux = new Boolean[10][13];
    Image seleccionado = new Image(getClass().getResource("Imagenes/seleccionado.png").toExternalForm());
    Image ocupado = new Image(getClass().getResource("Imagenes/ocupado.png").toExternalForm());
    Image libre = new Image(getClass().getResource("Imagenes/libre.png").toExternalForm());

    public static void llenarMatriz() {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 13; j++) {
                aux[i][j] = false;
                sala1[i][j] = false;
                
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

   public void cargaSala() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 13; j++) {
                final int it = i;
                final int jt = j;
                final  ImageView estado = new ImageView();
                if (i == 5) {
                    i += 1;
                }
                if (sala1[i][j] == false) {
                    estado.setImage(libre);
                    asientos.add(estado, i, j, 1, 1);
                } else {
                    asientos.add(new ImageView(ocupado), i, j, 1, 1);
                }
                estado.setOnMouseClicked(evt -> {
                    if (estado.getImage() == ocupado) {
                        return;
                    }

                    if (estado.getImage() == libre) {
                        estado.setImage(seleccionado);
                        sala1[it][jt] = true;
                        
                    } else {
                        estado.setImage(libre);
                    }
                });
            }
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        pelis.getItems().add(peliculas.get(0).getNombre());
        pelis.getItems().add(peliculas.get(1).getNombre());
        pelis.getItems().add(peliculas.get(2).getNombre());
        sala.getItems().add("sala 01");
        sala.getItems().add("sala 02");
        cargaSala();

    }

}
