package main;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Bruno
 */
public class VentanaLongitud extends JFrame implements ActionListener {

    JLabel Fondo2;

    public VentanaLongitud() {

        setTitle("Equivalencias - Longitud");
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setBounds(0, 0, 600, 700);
        setResizable(false);
        setLayout(null);
        setLocationRelativeTo(null);

        Fondo2 = new JLabel();
        Fondo2.setIcon(new ImageIcon("src/Imagenes/VentanaLongitud.jpg"));
        Fondo2.setBounds(0, 0, 600, 800);
        add(Fondo2);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
