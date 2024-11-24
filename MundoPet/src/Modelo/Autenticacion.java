/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import Usuario.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import javafx.scene.control.TextField;
import javax.swing.JOptionPane;

public class Autenticacion {
    ArrayList<Usuario> list = new ArrayList();
    public static Usuario usuarioLogeado;
    
    public Autenticacion(){
        leerArchivo();
    }
    
    public boolean Logear(TextField usuario, TextField password){
        leerArchivo();
        String user = usuario.getText();
        String pw = password.getText();
        
        System.out.println("in login");
        
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).usuario.equals(user) && list.get(i).password.equals(pw)) {
                System.out.println("logeado");
                usuarioLogeado = list.get(i);
                return true;
            } else if (list.get(i).usuario.equals(user) && !(list.get(i).password.equals(pw))){
                System.out.println("wrong password");
                usuarioLogeado = null;
                return false;
            }
        }
        
        return false;
    }
    
    public void registrar(TextField usuario, TextField password, TextField nombre, TextField cedula) {
        FileWriter file = null;
        PrintWriter printw = null;
        try {
            file = new FileWriter("/Users/eliasvidal/Documents/Coding III/MundoPet/src/texts/usuarios.txt");
            printw = new PrintWriter(file);
            
            Usuario u = new Usuario(usuario, password, nombre, cedula);
            list.add(u);
            for (int i = 0; i < list.size(); i++) {
                printw.println(list.get(i).usuario);
                printw.println(list.get(i).password);
                printw.println(list.get(i).nombre);
                printw.println(list.get(i).cedula);
            }
            
        } catch (Exception e) {
            
        } finally {
            try {
                if (null != file) {
                    file.close();
                }
            } catch (Exception e2) {
                System.out.println("Error when closing!");
            }
        }
    }
    
    public void leerArchivo(){
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
            archivo = new File("/Users/eliasvidal/Documents/Coding III/MundoPet/src/texts/usuarios.txt");
            fr = new FileReader(archivo);
            br = new BufferedReader(fr); //makes fr readable, it sort of translates it.
            
            String linea;
            int i=0;
            Usuario u = new Usuario();
            while ((linea = br.readLine()) != null) {
                    switch(i){
                    case 0:
                        u.usuario = linea.trim();
                        i++;
                        break;
                    case 1:
                        u.password = linea.trim();
                        i++;
                        break;
                    case 2:
                        u.nombre = linea.trim();
                        i++;
                        break;
                    case 3:
                        u.cedula = linea.trim();
                        list.add(u);
                        u = new Usuario();
                        i=0;
                        break;
                    }
            }
            System.out.println("Datos válidos cargados al archivo");
            System.out.println(list.get(0).usuario);
            System.out.println(list.get(0).password);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(
                null, "Información: \n"+e.getMessage(), 
                "Error!",
                JOptionPane.WARNING_MESSAGE);
        } finally {
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                JOptionPane.showMessageDialog(
                    null, "Información: \n"+e2.getMessage(), 
                    "Error!",
                    JOptionPane.WARNING_MESSAGE);
            }
        }
    }
    
}
