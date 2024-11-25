/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import Modelo.Autenticacion;
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
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

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

    @FXML
    private void volver(MouseEvent event) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/LogIn.fxml"));
            Parent root = loader.load();
            LogInController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
           // stage.initModality(Modality.APPLICATION_MODAL); sirve para no salir hasta terminar el programa
            stage.setScene(scene);

            stage.show();
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            }catch(IOException ex){

            }
    }
}
