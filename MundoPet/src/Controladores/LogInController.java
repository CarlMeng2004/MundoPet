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
import javafx.scene.control.TextField;
import javafx.stage.Stage;


public class LogInController implements Initializable {

    @FXML
    private TextField usuarioRegistrar;
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
        
    }    

    @FXML
    private void registrar(ActionEvent event) {
        try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Registrar.fxml"));
        Parent root = loader.load();
        RegistrarController controlador = loader.getController();
        controlador.setEmail(usuarioRegistrar.getText());
        Scene scene = new Scene(root);
        Stage stage = new Stage();
       // stage.initModality(Modality.APPLICATION_MODAL); sirve para no salir hasta terminar el programa
        stage.setScene(scene);
        
        stage.show();
        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        currentStage.close();
        
        }
        catch(IOException ex){
           
        }
    }

    @FXML
    private void iniciar(ActionEvent event) {
        int logeado = aut.Logear(usuario, password);
        if (logeado == 1) {
            try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Catalogo.fxml"));
            Parent root = loader.load();
            CatalogoController controlador = loader.getController();
            Scene scene = new Scene(root);
            Stage stage = new Stage();
           // stage.initModality(Modality.APPLICATION_MODAL); sirve para no salir hasta terminar el programa
            stage.setScene(scene);

            stage.show();
            Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            currentStage.close();

            }
            catch(IOException ex){

            }
        } else if (logeado == 3){
            try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/Admin.fxml"));
            Parent root = loader.load();
            AdminController controlador = loader.getController();
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
    
}
