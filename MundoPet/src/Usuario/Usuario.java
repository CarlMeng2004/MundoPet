/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

import javafx.scene.control.TextField;

public class Usuario {
    public String usuario;
    public String password;
    public String nombre;
    public String cedula;

    public Usuario(){
        
    }
    
    public Usuario(TextField usuario, TextField password, TextField nombre, TextField cedula){
        this.usuario = usuario.getText();
        this.password = password.getText();
        this.nombre = nombre.getText();
        this.cedula = cedula.getText();
    }
    
    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String nombre) {
        this.usuario = nombre;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void getNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    
    
}
