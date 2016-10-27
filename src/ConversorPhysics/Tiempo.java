package ConversorPhysics;

import ConversorPhysics.TipoUnidad;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import main.VentanaInicio;

public class Tiempo extends JFrame implements ActionListener {

    private JButton Regresar;
    private JButton b1;
    private JButton b2;
    private JButton b3;
    private JButton b4;
    private JButton b5;
    private JButton b6;

    // -------> Son para ingresar lo que sera convertido
    private JTextField t1;
    private JTextField t2;
    private JTextField t3;
    private JTextField t4;
    private JTextField t5;
    private JTextField t6;
    // -----> Ricardo se la come jeje 8===D O:

    private JTextField sas;
    private JTextField sami;
    private JTextField sah;
    private JTextField sad;
    private JTextField same;
    private JTextField saañ;

    // ==================> Textos de minutos
    private JTextField mias;
    private JTextField miami;
    private JTextField miah;
    private JTextField miad;
    private JTextField miame;
    private JTextField miaañ;

    //======================> Textos de horas
    private JTextField has;
    private JTextField hami;
    private JTextField hah;
    private JTextField had;
    private JTextField hame;
    private JTextField haañ;

    // ===================> Textos de dias
    private JTextField das;
    private JTextField dami;
    private JTextField dah;
    private JTextField dad;
    private JTextField dame;
    private JTextField daañ;

    // ==================> Textos de meses
    private JTextField meas;
    private JTextField meami;
    private JTextField meah;
    private JTextField mead;
    private JTextField meame;
    private JTextField meaañ;

    // =================> Textos de años
    private JTextField añas;
    private JTextField añami;
    private JTextField añah;
    private JTextField añad;
    private JTextField añame;
    private JTextField añaañ;

    private JButton Limpiar;
    JLabel Fondo;

    public Tiempo() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 412);
        setTitle("Conversor");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
         Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);

        Regresar = new JButton("");
        Regresar.addActionListener(this);
        Regresar.setBounds(5, 5, 90, 30);
        Regresar.setIcon(new ImageIcon("src/Imagenes/back.jpg"));
        add(Regresar);

        Limpiar = new JButton("");
        Limpiar.addActionListener(this);
        Limpiar.setBounds(120, 320, 400, 45);
        Limpiar.setIcon(new ImageIcon("src/Imagenes/limpiar.jpg"));
        add(Limpiar);

        b1 = new JButton("Unlock");
        b1.addActionListener(this);
        b1.setBounds(20, 60, 25, 25);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(b1);

        b2 = new JButton("Unlock");
        b2.addActionListener(this);
        b2.setBounds(20, 100, 25, 25);
        // Aqui va el icono -----------> Masa.setIcon(iconoEquivalencia);
        add(b2);

        b3 = new JButton("Unlock");
        b3.addActionListener(this);
        b3.setBounds(20, 140, 25, 25);
        //Aqui va el icono -----------> Tiempo.setIcon(iconoEquivalencia);
        add(b3);

        b4 = new JButton("Unlock");
        b4.addActionListener(this);
        b4.setBounds(20, 180, 25, 25);
        //Aqui va el icono ----------> Regresar.setIcon(icono equivalencia);
        add(b4);

        b5 = new JButton("Unlock");
        b5.addActionListener(this);
        b5.setBounds(20, 220, 25, 25);
        //Aqui va el icono ----------> Regresar.setIcon(icono equivalencia);
        add(b5);

        b6 = new JButton("Unlock");
        b6.addActionListener(this);
        b6.setBounds(20, 260, 25, 25);
        //Aqui va el icono ----------> Regresar.setIcon(icono equivalencia);
        add(b6);

        // -----------> Textos a ingresar
        t1 = new JTextField("Segundos");
        t1.addActionListener(this);
        t1.setBounds(60, 60, 60, 25);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(t1);

        t2 = new JTextField("Minutos");
        t2.addActionListener(this);
        t2.setBounds(60, 100, 60, 25);
        // Aqui va el icono -----------> Masa.setIcon(iconoEquivalencia);
        add(t2);

        t3 = new JTextField("Hora");
        t3.addActionListener(this);
        t3.setBounds(60, 140, 60, 25);
        //Aqui va el icono -----------> Tiempo.setIcon(iconoEquivalencia);
        add(t3);

        t4 = new JTextField("Dias");
        t4.addActionListener(this);
        t4.setBounds(60, 180, 60, 25);
        //Aqui va el icono ----------> Regresar.setIcon(icono equivalencia);
        add(t4);

        t5 = new JTextField("Meses");
        t5.addActionListener(this);
        t5.setBounds(60, 220, 60, 25);
        //Aqui va el icono ----------> Regresar.setIcon(icono equivalencia);
        add(t5);

        t6 = new JTextField("Años");
        t6.addActionListener(this);
        t6.setBounds(60, 260, 60, 25);
        //Aqui va el icono ----------> Regresar.setIcon(icono equivalencia);
        add(t6);

        // ========================= Textos de segundos
        sas = new JTextField("");
        sas.addActionListener(this);
        sas.setBounds(135, 60, 60, 25);
        sas.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(sas);

        sami = new JTextField("");
        sami.addActionListener(this);
        sami.setBounds(210, 60, 60, 25);
        sami.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(sami);

        sah = new JTextField("");
        sah.addActionListener(this);
        sah.setBounds(285, 60, 60, 25);
        sah.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(sah);

        sad = new JTextField("");
        sad.addActionListener(this);
        sad.setBounds(360, 60, 60, 25);
        sad.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(sad);

        same = new JTextField("");
        same.addActionListener(this);
        same.setBounds(435, 60, 60, 25);
        same.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(same);

        saañ = new JTextField("");
        saañ.addActionListener(this);
        saañ.setBounds(510, 60, 60, 25);
        saañ.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(saañ);

        // ===================================== Textos de minutos
        mias = new JTextField("");
        mias.addActionListener(this);
        mias.setBounds(135, 100, 60, 25);
        mias.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(mias);

        miami = new JTextField("");
        miami.addActionListener(this);
        miami.setBounds(210, 100, 60, 25);
        miami.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(miami);

        miah = new JTextField("");
        miah.addActionListener(this);
        miah.setBounds(285, 100, 60, 25);
        miah.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(miah);

        miad = new JTextField("");
        miad.addActionListener(this);
        miad.setBounds(360, 100, 60, 25);
        miad.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(miad);

        miame = new JTextField("");
        miame.addActionListener(this);
        miame.setBounds(435, 100, 60, 25);
        miame.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(miame);

        miaañ = new JTextField("");
        miaañ.addActionListener(this);
        miaañ.setBounds(510, 100, 60, 25);
        miaañ.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(miaañ);

        //=================> Textos de horas
        has = new JTextField("");
        has.addActionListener(this);
        has.setBounds(135, 140, 60, 25);
        has.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(has);

        hami = new JTextField("");
        hami.addActionListener(this);
        hami.setBounds(210, 140, 60, 25);
        hami.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(hami);

        hah = new JTextField("");
        hah.addActionListener(this);
        hah.setBounds(285, 140, 60, 25);
        hah.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(hah);

        had = new JTextField("");
        had.addActionListener(this);
        had.setBounds(360, 140, 60, 25);
        had.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(had);

        hame = new JTextField("");
        hame.addActionListener(this);
        hame.setBounds(435, 140, 60, 25);
        hame.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(hame);

        haañ = new JTextField("");
        haañ.addActionListener(this);
        haañ.setBounds(510, 140, 60, 25);
        haañ.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(haañ);

        // ==================> Dias
        das = new JTextField("");
        das.addActionListener(this);
        das.setBounds(135, 180, 60, 25);
        das.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(das);

        dami = new JTextField("");
        dami.addActionListener(this);
        dami.setBounds(210, 180, 60, 25);
        dami.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(dami);

        dah = new JTextField("");
        dah.addActionListener(this);
        dah.setBounds(285, 180, 60, 25);
        dah.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(dah);

        dad = new JTextField("");
        dad.addActionListener(this);
        dad.setBounds(360, 180, 60, 25);
        dad.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(dad);

        dame = new JTextField("");
        dame.addActionListener(this);
        dame.setBounds(435, 180, 60, 25);
        dame.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(dame);

        daañ = new JTextField("");
        daañ.addActionListener(this);
        daañ.setBounds(510, 180, 60, 25);
        daañ.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(daañ);

        // =====================> Meses
        meas = new JTextField("");
        meas.addActionListener(this);
        meas.setBounds(135, 220, 60, 25);
        meas.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(meas);

        meami = new JTextField("");
        meami.addActionListener(this);
        meami.setBounds(210, 220, 60, 25);
        meami.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(meami);

        meah = new JTextField("");
        meah.addActionListener(this);
        meah.setBounds(285, 220, 60, 25);
        meah.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(meah);

        mead = new JTextField("");
        mead.addActionListener(this);
        mead.setBounds(360, 220, 60, 25);
        mead.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(mead);

        meame = new JTextField("");
        meame.addActionListener(this);
        meame.setBounds(435, 220, 60, 25);
        meame.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(meame);

        meaañ = new JTextField("");
        meaañ.addActionListener(this);
        meaañ.setBounds(510, 220, 60, 25);
        meaañ.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(meaañ);

        // =========================> Textos de años
        añas = new JTextField("");
        añas.addActionListener(this);
        añas.setBounds(135, 260, 60, 25);
        añas.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(añas);

        añami = new JTextField("");
        añami.addActionListener(this);
        añami.setBounds(210, 260, 60, 25);
        añami.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(añami);

        añah = new JTextField("");
        añah.addActionListener(this);
        añah.setBounds(285, 260, 60, 25);
        añah.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(añah);

        añad = new JTextField("");
        añad.addActionListener(this);
        añad.setBounds(360, 260, 60, 25);
        añad.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(añad);

        añame = new JTextField("");
        añame.addActionListener(this);
        añame.setBounds(435, 260, 60, 25);
        añame.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(añame);

        añaañ = new JTextField("");
        añaañ.addActionListener(this);
        añaañ.setBounds(510, 260, 60, 25);
        añaañ.setEnabled(false);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(añaañ);
        
        Fondo = new JLabel();
        Fondo.setIcon(new ImageIcon("src/Imagenes/3.jpg"));
        Fondo.setBounds(0, 0, 640, 412);
        add(Fondo);
        setVisible(true);


        JOptionPane.showMessageDialog(null, "Coloque la cantidad deseada en el texto de la izquierda y pulse el boton para obtener todas las conversiones");
        t1.requestFocus(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            sas.setEnabled(true);
            sami.setEnabled(true);
            sah.setEnabled(true);
            sad.setEnabled(true);
            same.setEnabled(true);
            saañ.setEnabled(true);

            double con1 = Double.parseDouble(t1.getText());
            double res1 = con1 * 1; // =======> Aqui va el factor de conversion
            sas.setText(res1 + "");

            double con2 = Double.parseDouble(t1.getText());
            double res2 = con2 * 0.01667; // =======> Aqui va el factor de conversion
            sami.setText(res2 + "");

            double con3 = Double.parseDouble(t1.getText());
            double res3 = con3 * 0.000278; // =======> Aqui va el factor de conversion
            sah.setText(res3 + "");

            double con4 = Double.parseDouble(t1.getText());
            double res4 = con4 * 0.0000116; // =======> Aqui va el factor de conversion
            sad.setText(res4 + "");

            double con5 = Double.parseDouble(t1.getText());
            double res5 = con5 * 0.0000003; // =======> Aqui va el factor de conversion
            same.setText(res5 + "");

            double con6 = Double.parseDouble(t1.getText());
            double res6 = con6 * 0.0000000317; // =======> Aqui va el factor de conversion
            saañ.setText(res6 + "");

            t1.requestFocus(true);
        } else {
            if (e.getSource() == b2) {
                mias.setEnabled(true);
                miami.setEnabled(true);
                miah.setEnabled(true);
                miad.setEnabled(true);
                miame.setEnabled(true);
                miaañ.setEnabled(true);

                double con1 = Double.parseDouble(t2.getText());
                double res1 = con1 * 60; // =======> Aqui va el factor de conversion
                mias.setText(res1 + "");

                double con2 = Double.parseDouble(t2.getText());
                double res2 = con2 * 1; // =======> Aqui va el factor de conversion
                miami.setText(res2 + "");

                double con3 = Double.parseDouble(t2.getText());
                double res3 = con3 * 0.01667; // =======> Aqui va el factor de conversion
                miah.setText(res3 + "");

                double con4 = Double.parseDouble(t2.getText());
                double res4 = con4 * 0.000694; // =======> Aqui va el factor de conversion
                miad.setText(res4 + "");

                double con5 = Double.parseDouble(t2.getText());
                double res5 = con5 * 0.0000231; // =======> Aqui va el factor de conversion
                miame.setText(res5 + "");

                double con6 = Double.parseDouble(t2.getText());
                double res6 = con6 * 0.0000019; // =======> Aqui va el factor de conversion
                miaañ.setText(res6 + "");

                t2.requestFocus(true);
            } else {
                if (e.getSource() == b3) {
                    has.setEnabled(true);
                    hami.setEnabled(true);
                    hah.setEnabled(true);
                    had.setEnabled(true);
                    hame.setEnabled(true);
                    haañ.setEnabled(true);

                    double con1 = Double.parseDouble(t3.getText());
                    double res1 = con1 * 3600; // =======> Aqui va el factor de conversion
                    has.setText(res1 + "");

                    double con2 = Double.parseDouble(t3.getText());
                    double res2 = con2 * 60; // =======> Aqui va el factor de conversion
                    hami.setText(res2 + "");

                    double con3 = Double.parseDouble(t3.getText());
                    double res3 = con3 * 1; // =======> Aqui va el factor de conversion
                    hah.setText(res3 + "");

                    double con4 = Double.parseDouble(t3.getText());
                    double res4 = con4 * 0.04167; // =======> Aqui va el factor de conversion
                    had.setText(res4 + "");

                    double con5 = Double.parseDouble(t3.getText());
                    double res5 = con5 * 0.001388; // =======> Aqui va el factor de conversion
                    hame.setText(res5 + "");

                    double con6 = Double.parseDouble(t3.getText());
                    double res6 = con6 * 0.0001141; // =======> Aqui va el factor de conversion
                    haañ.setText(res6 + "");

                    t3.requestFocus(true);
                } else {
                    if (e.getSource() == b4) {
                        das.setEnabled(true);
                        dami.setEnabled(true);
                        dah.setEnabled(true);
                        dad.setEnabled(true);
                        dame.setEnabled(true);
                        daañ.setEnabled(true);

                        double con1 = Double.parseDouble(t4.getText());
                        double res1 = con1 * 86400; // =======> Aqui va el factor de conversion
                        das.setText(res1 + "");

                        double con2 = Double.parseDouble(t4.getText());
                        double res2 = con2 * 1440; // =======> Aqui va el factor de conversion
                        dami.setText(res2 + "");

                        double con3 = Double.parseDouble(t4.getText());
                        double res3 = con3 * 24; // =======> Aqui va el factor de conversion
                        dah.setText(res3 + "");

                        double con4 = Double.parseDouble(t4.getText());
                        double res4 = con4 * 1; // =======> Aqui va el factor de conversion
                        dad.setText(res4 + "");

                        double con5 = Double.parseDouble(t4.getText());
                        double res5 = con5 * 30; // =======> Aqui va el factor de conversion
                        dame.setText(res5 + "");

                        double con6 = Double.parseDouble(t4.getText());
                        double res6 = con6 * 0.002738; // =======> Aqui va el factor de conversion
                        daañ.setText(res6 + "");

                        t4.requestFocus(true);
                    } else {
                        if (e.getSource() == b5) {
                            meas.setEnabled(true);
                            meami.setEnabled(true);
                            meah.setEnabled(true);
                            mead.setEnabled(true);
                            meame.setEnabled(true);
                            meaañ.setEnabled(true);

                            double con1 = Double.parseDouble(t5.getText());
                            double res1 = con1 * 2592000; // =======> Aqui va el factor de conversion
                            meas.setText(res1 + "");

                            double con2 = Double.parseDouble(t5.getText());
                            double res2 = con2 * 43200; // =======> Aqui va el factor de conversion
                            meami.setText(res2 + "");

                            double con3 = Double.parseDouble(t5.getText());
                            double res3 = con3 * 720; // =======> Aqui va el factor de conversion
                            meah.setText(res3 + "");

                            double con4 = Double.parseDouble(t5.getText());
                            double res4 = con4 * 30; // =======> Aqui va el factor de conversion
                            mead.setText(res4 + "");

                            double con5 = Double.parseDouble(t5.getText());
                            double res5 = con5 * 1; // =======> Aqui va el factor de conversion
                            meame.setText(res5 + "");

                            double con6 = Double.parseDouble(t5.getText());
                            double res6 = con6 * 12; // =======> Aqui va el factor de conversion
                            meaañ.setText(res6 + "");

                            t5.requestFocus(true);
                        } else {
                            if (e.getSource() == b6) {
                                añas.setEnabled(true);
                                añami.setEnabled(true);
                                añah.setEnabled(true);
                                añad.setEnabled(true);
                                añame.setEnabled(true);
                                añaañ.setEnabled(true);

                                double con1 = Double.parseDouble(t6.getText());
                                double res1 = con1 * 31560000; // =======> Aqui va el factor de conversion
                                añas.setText(res1 + "");

                                double con2 = Double.parseDouble(t6.getText());
                                double res2 = con2 * 526000; // =======> Aqui va el factor de conversion
                                añami.setText(res2 + "");

                                double con3 = Double.parseDouble(t6.getText());
                                double res3 = con3 * 8766; // =======> Aqui va el factor de conversion
                                añah.setText(res3 + "");

                                double con4 = Double.parseDouble(t6.getText());
                                double res4 = con4 * 365.27; // =======> Aqui va el factor de conversion
                                añad.setText(res4 + "");

                                double con5 = Double.parseDouble(t6.getText());
                                double res5 = con5 * 12; // =======> Aqui va el factor de conversion
                                añame.setText(res5 + "");

                                double con6 = Double.parseDouble(t6.getText());
                                double res6 = con6 * 1; // =======> Aqui va el factor de conversion
                                añaañ.setText(res6 + "");

                                t6.requestFocus(true);
                            } else {
                                if (e.getSource() == Limpiar) {
                                    sas.setText("");
                                    sami.setText("");
                                    sah.setText("");
                                    sad.setText("");
                                    same.setText("");
                                    saañ.setText("");
                                    mias.setText("");
                                    miami.setText("");
                                    miah.setText("");
                                    miad.setText("");
                                    miame.setText("");
                                    miaañ.setText("");
                                    has.setText("");
                                    hami.setText("");
                                    hah.setText("");
                                    had.setText("");
                                    hame.setText("");
                                    haañ.setText("");
                                    das.setText("");
                                    dami.setText("");
                                    dah.setText("");
                                    dad.setText("");
                                    dame.setText("");
                                    daañ.setText("");
                                    meas.setText("");
                                    meami.setText("");
                                    meah.setText("");
                                    mead.setText("");
                                    meame.setText("");
                                    meaañ.setText("");
                                    añas.setText("");
                                    añami.setText("");
                                    añah.setText("");
                                    añad.setText("");
                                    añame.setText("");
                                    añaañ.setText("");
                                    t1.setText("");
                                    t2.setText("");
                                    t3.setText("");
                                    t4.setText("");
                                    t5.setText("");
                                    t6.setText("");
                                } else {
                                    if (e.getSource() == Regresar) {
                                        dispose();
                                        VentanaConversor back = new VentanaConversor();
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }
}
