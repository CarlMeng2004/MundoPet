/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

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
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

public class CatalogoController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
    VistaProductoController prod = new VistaProductoController();

    @FXML
    private void ProPlanEsteril(MouseEvent event) {
        prod.cambiar("Alimento para gato", "1", "79000" ,"/Imagenes/p1.png");
    }

    @FXML
    private void ProPlanAdultoGato(MouseEvent event) {
        prod.cambiar("Alimento para gato", "2", "79000" ,"/Imagenes/p2.png");
    }

    @FXML
    private void ProPlanClear(MouseEvent event) {
        prod.cambiar("Alimento para gato", "3", "79000" ,"/Imagenes/p3.png");
    }

    @FXML
    private void ProPlanUrinario(MouseEvent event) {
        prod.cambiar("Alimento para gato", "4", "79000" ,"/Imagenes/p4.png");
    }

    @FXML
    private void ProPlanExigente(MouseEvent event) {
        prod.cambiar("Alimento para perro", "5", "59000" ,"/Imagenes/p5.png");
    }

    @FXML
    private void ProPlanSensible(MouseEvent event) {
        prod.cambiar("Alimento para perro", "6", "59000" ,"/Imagenes/p6.png");
    }

    @FXML
    private void ProPlanPiel(MouseEvent event) {
        prod.cambiar("Alimento para perro", "7", "59000" ,"/Imagenes/p7.png");
    }

    @FXML
    private void ProPlanAdultoPerro(MouseEvent event) {
        prod.cambiar("Alimento para perro", "8", "59000" ,"/Imagenes/p8.png");
    }

    @FXML
    private void CerrarSesion(ActionEvent event) {
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
