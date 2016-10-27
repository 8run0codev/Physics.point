package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.nio.file.Files;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class VentanaFundamentos extends JFrame implements ActionListener, ItemListener {

    private JComboBox comboFatality;
    private final JButton RegresarBoton;
    private JTextArea areaDeTexto;
    private JScrollPane scrollPaneArea;
    private String sDirectorio = "src/Documentos";
    private JButton Aceptar;
    private JLabel Fondo;
    private JLabel labelTexto;

    public VentanaFundamentos() {

        ImageIcon Botonatras = new ImageIcon("src/Imagenes/Botonatrasadmin.jpg");

        Color ColorPhysics = new Color(211, 129, 1);

        Font fontsita = new Font("Arial", Font.PLAIN, 35);

        Container cont = getContentPane();
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Fundamentos");
        setResizable(false);

        comboFatality = new javax.swing.JComboBox();
        comboFatality.setBounds(580, 100, 250, 26);

        File f = new File(sDirectorio);
        if (f.exists()) {

            File[] ficheros = f.listFiles();
            for (int x = 0; x < ficheros.length; x++) {
                comboFatality.addItem(ficheros[x].getName());
            }

        } else {
        } //Directorio no existe 

        cont.add(comboFatality);

        areaDeTexto = new JTextArea();
        //para que el texto se ajuste al area
        areaDeTexto.setLineWrap(true);
        //permite que no queden palabras incompletas al hacer el salto de linea
        areaDeTexto.setWrapStyleWord(true);
        areaDeTexto.setEditable(false);
        scrollPaneArea = new JScrollPane();
        scrollPaneArea.setBounds(200, 150, 878, 400);
        areaDeTexto.setFont(scrollPaneArea.getFont().deriveFont(20f));
        scrollPaneArea.setViewportView(areaDeTexto);
        cont.add(scrollPaneArea);

        RegresarBoton = new javax.swing.JButton();
        RegresarBoton.setBounds(10, 10, 113, 70);
        RegresarBoton.setIcon(Botonatras);
        RegresarBoton.addActionListener(this);
        RegresarBoton.setVisible(true);
        cont.add(RegresarBoton);

        labelTexto = new JLabel();
        labelTexto.setText("Elije el tema a estudiar y selecciona aceptar");
        labelTexto.setFont(fontsita);
        labelTexto.setForeground(ColorPhysics);
        labelTexto.setBounds(200, 30, 900, 30);
        cont.add(labelTexto);

        Aceptar = new javax.swing.JButton();
        Aceptar.setBounds(1100, 590, 113, 70);
        Aceptar.addActionListener(this);
        Aceptar.setIcon(new ImageIcon("src/Imagenes/aceptar.jpg"));
        Aceptar.setVisible(true);
        cont.add(Aceptar);

        Fondo = new javax.swing.JLabel();
        Fondo.setIcon(new ImageIcon("src/Imagenes/Fondoazul.jpg"));
        Fondo.setBounds(0, 0, 1280, 720);
        add(Fondo);

        setVisible(true);

    }
//comboFatality.getSelectedItem().toString()

    @Override
    public void actionPerformed(ActionEvent e
    ) {
        if (e.getSource() == RegresarBoton) {
            dispose();
            VentanaInicio Inicio = new VentanaInicio();
        } else {
            if (e.getSource() == Aceptar) {
                areaDeTexto.setText(Textitos.getArchivo("src/Documentos/" + comboFatality.getSelectedItem().toString()));
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}
