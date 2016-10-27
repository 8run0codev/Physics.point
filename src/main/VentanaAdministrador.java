package main;

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
import javax.swing.JOptionPane;

public class VentanaAdministrador extends JFrame implements ActionListener {

    private final JButton AgregarFundamentosBoton;
    private final JButton AgregarEjercicios;
    private final JButton CalificacionesBoton;
    private final JButton RegresarBoton;
    private final JLabel Fondo;

    public VentanaAdministrador() {

        ImageIcon BotonCal = new ImageIcon("src/Imagenes/Botoncal.jpg");
        ImageIcon Botonfundamen = new ImageIcon("src/Imagenes/nuevotema.jpg");
        ImageIcon Botonejer = new ImageIcon("src/Imagenes/nuevocuestionario.jpg");
        ImageIcon Botonatras = new ImageIcon("src/Imagenes/Botonatrasadmin.jpg");

        Container cont = getContentPane();
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Administrador");
        setResizable(false);

        AgregarFundamentosBoton = new javax.swing.JButton();
        AgregarFundamentosBoton.addActionListener(this);
        AgregarFundamentosBoton.setBounds(300, 400, 353, 180);
        AgregarFundamentosBoton.setIcon(Botonfundamen);
        AgregarFundamentosBoton.setVisible(true);
        cont.add(AgregarFundamentosBoton);

        CalificacionesBoton = new javax.swing.JButton();
        CalificacionesBoton.addActionListener(this);
        CalificacionesBoton.setBounds(300, 230, 720, 151);
        CalificacionesBoton.setIcon(BotonCal);
        CalificacionesBoton.setVisible(true);
        cont.add(CalificacionesBoton);

        AgregarEjercicios = new javax.swing.JButton();
        AgregarEjercicios.addActionListener(this);
        AgregarEjercicios.setBounds(670, 400, 353, 180);
        AgregarEjercicios.setIcon(Botonejer);
        AgregarEjercicios.setVisible(true);
        cont.add(AgregarEjercicios);

        RegresarBoton = new javax.swing.JButton();
        RegresarBoton.setBounds(10, 10, 113, 70);
        RegresarBoton.setIcon(Botonatras);
        RegresarBoton.addActionListener(this);
        RegresarBoton.setVisible(true);
        cont.add(RegresarBoton);

        Fondo = new javax.swing.JLabel();
        Fondo.setIcon(new javax.swing.ImageIcon("src/Imagenes/FondoAdmin.jpg"));
        Fondo.setBounds(0, 0, 1280, 720);
        add(Fondo);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == RegresarBoton) {
            dispose();
            VentanaInicio inicio = new VentanaInicio();
        } else {
            if (e.getSource() == CalificacionesBoton) {
                JOptionPane.showMessageDialog(null, "3");
            } else {
                if (e.getSource() == AgregarEjercicios) {
                    JOptionPane.showMessageDialog(null, "4");
                } else {
                    if (e.getSource() == AgregarFundamentosBoton) {
                        dispose();
                        Textitos text = new Textitos();
                    }
                }
            }
        }
    }
}
