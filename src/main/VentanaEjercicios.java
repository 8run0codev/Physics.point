/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Brubvc
 */
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
public class VentanaEjercicios extends JFrame {
    
    public VentanaEjercicios(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Ejercicios");
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setResizable(false);//para configurar si se redimensiona la ventana      
        setSize(1280, 720);//configurando tamaño de la ventana (ancho, alto)
        setLocationRelativeTo(null);//ventana centrada en la pantalla
        setVisible(true);//configurando visualización de la ventana 
    }
            
    
}
