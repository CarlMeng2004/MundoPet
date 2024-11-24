/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import Modelo.Autenticacion;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author eliasvidal
 */
public class RegistrarController implements Initializable {
    @FXML
    private Button registerButton;
    @FXML
    private TextField nombre;
    @FXML
    private TextField cedula;
    @FXML
    private TextField usuario;
    @FXML
    private TextField password;

    private Autenticacion aut = new Autenticacion();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    public void setEmail(String correo){
        this.usuario.setText(correo);
    }

    @FXML
    private void register(ActionEvent event) {
        aut.registrar(usuario, password, nombre, cedula);
    }
}
