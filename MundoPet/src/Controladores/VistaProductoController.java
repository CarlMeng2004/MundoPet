/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package Controladores;

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class VistaProductoController implements Initializable {

    @FXML
    private ImageView image;
    @FXML
    private Label nombre;
    @FXML
    private Label idProd;
    @FXML
    private Label precio;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
    public void cambiar(String nombre,String id, String precio,String ruta){
    try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/Vistas/VistaProducto.fxml"));
        Parent root = loader.load();
        VistaProductoController controlador = loader.getController();
       
        controlador.generarVista(nombre, id, precio, ruta);
        
        Scene scene = new Scene(root);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.showAndWait();
        
        }
        catch(IOException ex){
            System.out.println(ex);
        }
    }
    
    public void generarVista(String nombre, String id, String precio, String ruta){
        
        this.nombre.setText(nombre);
        
        this.precio.setText(precio);
        
        this.idProd.setText(id);
        
        javafx.scene.image.Image imagen = new javafx.scene.image.Image(ruta);
        image.setImage(imagen);
        
    }
    
}
