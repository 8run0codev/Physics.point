package main;

import ConversorPhysics.VentanaConversor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import Memoramita.Ventanogra;
import java.awt.Container;
import java.awt.EventQueue;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import Cuestionario.Ventana.Examen;

public class VentanaInicio extends JFrame implements ActionListener {

    private final JButton EquivalenciasBoton;
    private final JButton FundamentosBoton;
    private final JButton EjerciciosBoton;
    private final JButton ConversorBoton;
    private final JButton PhysicsDotPointBoton;
    private final JButton AdministradorBoton;
    private final JLabel Fondo;

    public VentanaInicio() {

        ImageIcon iconoEquivalencia = new ImageIcon("src/Imagenes/BotonEquiva.jpg");
        ImageIcon iconoConversor = new ImageIcon("src/Imagenes/Botoneconversor.jpg");
        ImageIcon iconoEjercicios = new ImageIcon("src/Imagenes/Botonejercicios.jpg");
        ImageIcon iconoPhysics = new ImageIcon("src/Imagenes/Botonephysics.jpg");
        ImageIcon iconoFundamentos = new ImageIcon("src/Imagenes/Botonfundamentos.jpg");
        ImageIcon iconoAdmin = new ImageIcon("src/Imagenes/ConfiguracionAdmin.png");

        Container cont = getContentPane();
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Physicis.Point - Menu Principal");
        setResizable(false);

        EquivalenciasBoton = new javax.swing.JButton();
        EquivalenciasBoton.addActionListener(this);
        EquivalenciasBoton.setBounds(310, 280, 180, 380);
        EquivalenciasBoton.setIcon(iconoEquivalencia);
        cont.add(EquivalenciasBoton);

        FundamentosBoton = new javax.swing.JButton();
        FundamentosBoton.addActionListener(this);
        FundamentosBoton.setBounds(60, 280, 180, 380);
        FundamentosBoton.setIcon(iconoFundamentos);
        cont.add(FundamentosBoton);

        EjerciciosBoton = new javax.swing.JButton();
        EjerciciosBoton.addActionListener(this);
        EjerciciosBoton.setBounds(550, 280, 180, 380);
        EjerciciosBoton.setIcon(iconoEjercicios);
        cont.add(EjerciciosBoton);

        ConversorBoton = new javax.swing.JButton();
        ConversorBoton.addActionListener(this);
        ConversorBoton.setBounds(800, 280, 180, 380);
        ConversorBoton.setIcon(iconoConversor);
        cont.add(ConversorBoton);

        PhysicsDotPointBoton = new javax.swing.JButton();
        PhysicsDotPointBoton.addActionListener(this);
        PhysicsDotPointBoton.setBounds(1050, 280, 180, 380);
        PhysicsDotPointBoton.setIcon(iconoPhysics);
        cont.add(PhysicsDotPointBoton);

        AdministradorBoton = new javax.swing.JButton();
        AdministradorBoton.addActionListener(this);
        AdministradorBoton.setBounds(1200, 10, 50, 50);
        AdministradorBoton.setIcon(iconoAdmin);
        cont.add(AdministradorBoton);

        Fondo = new javax.swing.JLabel();
        Fondo.setIcon(new javax.swing.ImageIcon("src/Imagenes/FondoMenu.jpg"));
        Fondo.setBounds(0, 0, 1280, 720);
        add(Fondo);

        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == EquivalenciasBoton) {
            dispose();
            VentanaEquivalencias Equivalencias = new VentanaEquivalencias();
        } else {
            if (e.getSource() == FundamentosBoton) {
                VentanaFundamentos Fundamentos = new VentanaFundamentos();
                dispose();
            } else {
                if (e.getSource() == EjerciciosBoton) {
                    Examen examen = new Examen();

                } else if (e.getSource() == ConversorBoton) {
                    VentanaConversor Conversor = new VentanaConversor();
                    dispose();
                } else {
                    if (e.getSource() == PhysicsDotPointBoton) {
                        dispose();
                        EventQueue.invokeLater(new Runnable() {

                            @Override
                            public void run() {
                                //To change body of generated methods, choose Tools | Templates.
                                Ventanogra jueguito = new Ventanogra();
                            }
                        });

                    } else {
                        if (e.getSource() == AdministradorBoton) {
                            dispose();
                            Usuario user = new Usuario();
                        }
                    }
                }

            }
        }
    }

}
