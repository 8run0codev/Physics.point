/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConversorPhysics;

import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import main.VentanaInicio;
import main.VentanaLongitud;

/**
 *
 * @author Brubvc
 */
public class VentanaConversor extends JFrame implements ActionListener {

    private final JButton BotonLongitud;
    private final JButton BotonPeso;
    private final JButton BotonTiempo;
    private final JButton RegresarBoton;
    private final JLabel Fondo;

    public VentanaConversor() {
        ImageIcon Longitud = new ImageIcon("src/Conversor/Imagenes/Botonlongitud.jpg");
        ImageIcon Tiempo = new ImageIcon("src/Conversor/Imagenes/Botontiempo.jpg");
        ImageIcon Peso = new ImageIcon("src/Conversor/Imagenes/Botonpeso.jpg");
        ImageIcon Botonatras = new ImageIcon("src/Conversor/Imagenes/atras.jpg");

        Container cont = getContentPane();
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Conversor - Physicis.Point");
        setResizable(false);

        RegresarBoton = new javax.swing.JButton();
        RegresarBoton.setBounds(10, 10, 113, 70);
        RegresarBoton.setIcon(Botonatras);
        RegresarBoton.addActionListener(this);
        RegresarBoton.setVisible(true);
        cont.add(RegresarBoton);

        BotonLongitud = new javax.swing.JButton();
        BotonLongitud.addActionListener(this);
        BotonLongitud.setBounds(100, 222, 325, 276);
        BotonLongitud.setIcon(Longitud);
        cont.add(BotonLongitud);

        BotonPeso = new javax.swing.JButton();
        BotonPeso.addActionListener(this);
        BotonPeso.setBounds(475, 222, 325, 276);
        BotonPeso.setIcon(Peso);
        cont.add(BotonPeso);

        BotonTiempo = new javax.swing.JButton();
        BotonTiempo.addActionListener(this);
        BotonTiempo.setBounds(850, 222, 325, 276);
        BotonTiempo.setIcon(Tiempo);
        cont.add(BotonTiempo);

        Fondo = new javax.swing.JLabel();
        Fondo.setIcon(new javax.swing.ImageIcon("src/Conversor/Imagenes/FondoConversor.jpg"));
        Fondo.setBounds(0, 0, 1280, 720);
        add(Fondo);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == BotonLongitud) {
            dispose();
            LongitudRem Longitud = new  LongitudRem();
        } else {

            if (e.getSource() == BotonPeso) {
                dispose();
                Masa Peso = new Masa();
            } else {
                if (e.getSource() == BotonTiempo) {
                    
                    dispose();
                    Tiempo Tiempo = new Tiempo();
                } else {
                    if (e.getSource() == RegresarBoton) {
                    VentanaInicio Inicio = new VentanaInicio();
                    dispose();
                } 

                }
            }

        }
    }
}
