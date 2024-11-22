/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import Modelo.Autenticacion;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class AutenticacionController implements Initializable {

    @FXML
    private TextField usuario;
    @FXML
    private TextField password;
    @FXML
    private TextField correoRegistrar;
    @FXML
    private Button registrar;

    private Autenticacion aut = new Autenticacion();
    
    public AutenticacionController(){
        
    }
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }
    
    @FXML
    public void Logear(){
        aut.Logear(usuario, password);
    }
    
}
