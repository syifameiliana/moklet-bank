/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxapplication10;

import static com.sun.javaws.ui.SplashScreen.hide;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author firdahilya
 */
public class FXMLDocumentController implements Initializable {

    
     String pin = "";
    String PIN ="1234";
    int kesempatan =3;
    int tmp;
    
    @FXML
    private Label label;
    @FXML
    private TextField editpin;
    @FXML
    private Button but1;
    @FXML
    private Button but4;
    @FXML
    private Button but2;
    @FXML
    private Button but3;
    @FXML
    private Button but5;
    @FXML
    private Button but6;
    @FXML
    private Button but7;
    @FXML
    private Button but8;
    @FXML
    private Button but9;
    @FXML
    private Button butc;
    @FXML
    private Button but0;
    @FXML
    private Button oke;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void satu(ActionEvent event) {
        pin +="1";
        editpin.setText(pin);
    }

    @FXML
    private void empat(ActionEvent event) {
         pin +="4";
        editpin.setText(pin);
    }
    
    @FXML
    private void dua(ActionEvent event) {
          pin +="2";
        editpin.setText(pin);
    }

    @FXML
    private void tiga(ActionEvent event) {
          pin +="3";
        editpin.setText(pin);
    }

    @FXML
    private void lima(ActionEvent event) {
          pin +="5";
        editpin.setText(pin);
    }

    @FXML
    private void enam(ActionEvent event) {
         pin +="6";
        editpin.setText(pin);
    }

    @FXML
    private void tujuh(ActionEvent event) {
          pin +="7";
        editpin.setText(pin);
    }

    @FXML
    private void lapan(ActionEvent event) {
          pin +="8";
        editpin.setText(pin);
    }

    @FXML
    private void sembilan(ActionEvent event) {
          pin +="9";
        editpin.setText(pin);
    }

    @FXML
    private void c(ActionEvent event) {
         pin ="";
        editpin.setText("");
    }

    @FXML
    private void proses(ActionEvent event) throws IOException {
        if(pin.equals(PIN)){
            try {
          ((Node)(event.getSource())).getScene().getWindow().hide();
          FXMLLoader fxmlLoader = new FXMLLoader();
          fxmlLoader.setLocation(getClass().getResource("FXMLMenuAwal.fxml"));
          Scene scene = new Scene (fxmlLoader.load(),830,450);
          Stage stage = new Stage();
          stage.setScene(scene);
          stage.setTitle("hasil");
          stage.show();
        }catch (IOException e){
                System.out.println("Failed to cretae new Window." + e);
                }
    }else {
         kesempatan -= 1;
         JOptionPane.showMessageDialog(null, "Pin  salah \n tersisa " + kesempatan+"Kesempatan lagi!");
}   editpin.setText("");
pin ="";
if(kesempatan == 0){
    System.exit(0);
}
        }
    }
    

