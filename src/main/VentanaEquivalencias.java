package main;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VentanaEquivalencias extends JFrame implements ActionListener {

    private final JButton RegresarBoton;
    private final JButton LongitudBoton;
    private final JButton SuperficieBoton;
    private final JButton VolumenBoton;
    private final JButton CapacidadBoton;
    private final JButton PesoBoton;
    private final JLabel jLabel1;

    public VentanaEquivalencias() {

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Equivalencias");
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setBounds(0, 0, 1280, 720);
        setLayout(null);
        setLocationRelativeTo(null);

        ImageIcon Botonatras = new ImageIcon("src/Imagenes/Botonatrasadmin.jpg");
        ImageIcon iconoLongitud = new ImageIcon("src/Imagenes/Botonlongitud.jpg");
        ImageIcon iconoCapacidad = new ImageIcon("src/Imagenes/Botoncapacidad.jpg");
        ImageIcon iconovolumen = new ImageIcon("src/Imagenes/Botonvolumen.jpg");
        ImageIcon iconoPeso = new ImageIcon("src/Imagenes/Botonpeso.jpg");
        ImageIcon iconoSuperficie = new ImageIcon("src/Imagenes/Botonsuperficie.jpg");

        RegresarBoton = new JButton();
        RegresarBoton.setBounds(10, 10, 113, 70);
        RegresarBoton.setIcon(Botonatras);
        RegresarBoton.addActionListener(this);
        RegresarBoton.setVisible(true);
        add(RegresarBoton);

        LongitudBoton = new JButton();
        LongitudBoton.addActionListener(this);
        LongitudBoton.setBounds(60, 170, 180, 380);
        LongitudBoton.setIcon(iconoLongitud);
        add(LongitudBoton);
        LongitudBoton.setVisible(true);

        SuperficieBoton = new JButton();
        SuperficieBoton.addActionListener(this);
        SuperficieBoton.setBounds(310, 170, 180, 380);
        SuperficieBoton.setIcon(iconoSuperficie);
        add(SuperficieBoton);
        SuperficieBoton.setVisible(true);

        VolumenBoton = new JButton();
        VolumenBoton.addActionListener(this);
        VolumenBoton.setBounds(550, 170, 180, 380);
        VolumenBoton.setIcon(iconovolumen);
        add(VolumenBoton);
        VolumenBoton.setVisible(true);

        CapacidadBoton = new JButton();
        CapacidadBoton.addActionListener(this);
        CapacidadBoton.setBounds(800, 170, 180, 380);
        CapacidadBoton.setIcon(iconoCapacidad);
        add(CapacidadBoton);
        CapacidadBoton.setVisible(true);

        PesoBoton = new JButton();
        PesoBoton.addActionListener(this);
        PesoBoton.setBounds(1050, 170, 180, 380);
        PesoBoton.setIcon(iconoPeso);
        add(PesoBoton);
        PesoBoton.setVisible(true);

        jLabel1 = new JLabel();//Agregar imagen de fondo 
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondoazul.jpg")));
        GroupLayout layoutsito = new GroupLayout(getContentPane());
        getContentPane().setLayout(layoutsito);
        layoutsito.setHorizontalGroup(
                layoutsito.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layoutsito.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );
        layoutsito.setVerticalGroup(
                layoutsito.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layoutsito.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
        );
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == RegresarBoton) {
            dispose();
            System.out.println("Regresar al muenu principal");
            VentanaInicio Inicio = new VentanaInicio();
        } else {
            if (e.getSource() == LongitudBoton) {
                System.out.println("Clic en Longitud");
                VentanaLongitud Longitud = new VentanaLongitud();
            } else {
                if (e.getSource() == SuperficieBoton) {
                    System.out.println("Clic en Superficie");
                    VentanaSuperficie Superficie = new VentanaSuperficie();
                } else {
                    if (e.getSource() == VolumenBoton) {
                        System.out.println("Clic en Volumen");
                        VentanaVolumen Volumen = new VentanaVolumen();
                    } else {
                        if (e.getSource() == CapacidadBoton) {
                            System.out.println("Clic en Capacidad");
                            VentanaCapacidad Capacidad = new VentanaCapacidad();
                        } else {
                            if (e.getSource() == PesoBoton) {
                                System.out.println("Clic en Peso");
                                VentanaPeso Peso = new VentanaPeso();
                            }
                        }
                    }
                }
            }
        }
    }
}
