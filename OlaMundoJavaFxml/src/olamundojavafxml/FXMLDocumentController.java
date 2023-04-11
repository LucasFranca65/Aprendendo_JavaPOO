/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package olamundojavafxml;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

/**
 *
 * @author lucas.franca
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label lblMensage;  
    private Button btnClick;
    
    @FXML
    private void clickBotao(ActionEvent event) {
       
        lblMensage.setText("Ola mundão do java Fxml!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
