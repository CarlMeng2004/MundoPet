/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package mundopet;

import Controladores.AutenticacionController;
import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class MundoPet extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        try {
            System.out.println("start does start");
            System.out.println(getClass().getResource("/Vistas/FXMLDocument.fxml"));
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/Vistas/Autenticacion.fxml"));

          
            Pane ventana = (Pane) loader.load();
            
            System.out.println("Cargo el load");
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(ventana);
            primaryStage.setScene(scene);
            System.out.println("Set Scene");
            primaryStage.show();
            System.out.println("start does finish");
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
