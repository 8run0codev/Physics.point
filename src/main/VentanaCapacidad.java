/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Brubvc
 */
public class VentanaCapacidad extends JFrame implements ActionListener {
    JLabel Fondo2;

    public VentanaCapacidad() {

        setTitle("Equivalencias - Capacidad");
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setBounds(0, 0, 600, 700);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        Fondo2 = new JLabel();
        Fondo2.setIcon(new ImageIcon("src/Imagenes/VentanaCapacidad.jpg"));
        Fondo2.setBounds(0, 0, 600, 700);
        add(Fondo2);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
