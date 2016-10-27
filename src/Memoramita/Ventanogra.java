package Memoramita;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import main.VentanaInicio;
import main.TimeWatch;

public class Ventanogra extends JFrame implements ActionListener {

    private final Tablero tabla = new Tablero();
    TimeWatch contador = new TimeWatch();
    private final javax.swing.JMenuItem cmdExit;
    private final javax.swing.JMenuItem cmdPlay;
    private final javax.swing.JMenuBar jMenuBar1;
    private final javax.swing.JPanel jpContenedor;
    private final javax.swing.JMenu mimenu;
    private final JLabel jLabel1;
    private final JButton RegresarBoton;
    private final JButton Jugar;
    private JTextField t1;

    public Ventanogra() {
        ImageIcon Jugarboton = new ImageIcon("src/Imagenes/botonjugar.jpg");
        ImageIcon Botonatras = new ImageIcon("src/Imagenes/Botonatrasazul.jpg");

        GridBagConstraints gridBagConstraints;

        jpContenedor = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mimenu = new javax.swing.JMenu();
        cmdPlay = new javax.swing.JMenuItem();
        cmdExit = new javax.swing.JMenuItem();

        this.jpContenedor.add(tabla);

        this.jpContenedor.repaint();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setTitle("Memorama");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jpContenedor.setBorder(javax.swing.BorderFactory.createLineBorder(new Color(0, 0, 0)));
        jpContenedor.setBounds(360, 80, 560, 560);

        //PreferredSize(new java.awt.Dimension(560, 560));
        javax.swing.GroupLayout jpContenedorLayout = new javax.swing.GroupLayout(jpContenedor);
        jpContenedor.setLayout(jpContenedorLayout);
        jpContenedorLayout.setHorizontalGroup(
                jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 558, Short.MAX_VALUE)
        );
        jpContenedorLayout.setVerticalGroup(
                jpContenedorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGap(0, 558, Short.MAX_VALUE)
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 10, 10);
        getContentPane().add(jpContenedor, gridBagConstraints);

        jMenuBar1.add(mimenu);

        setJMenuBar(jMenuBar1);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1280, 720);
        setResizable(false);

        RegresarBoton = new JButton();
        RegresarBoton.setBounds(10, 10, 113, 70);
        RegresarBoton.setIcon(Botonatras);
        RegresarBoton.addActionListener(this);
        RegresarBoton.setVisible(true);
        add(RegresarBoton);

        Jugar = new javax.swing.JButton();
        Jugar.setBounds(540, 0, 200, 65);
        Jugar.setIcon(Jugarboton);
        Jugar.addActionListener(this);
        Jugar.setVisible(true);
        add(Jugar);

        jLabel1 = new javax.swing.JLabel();//Agregar imagen de fondo 
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg")));
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
        setLocationRelativeTo(null);
        setVisible(true);
        
        JOptionPane.showMessageDialog(null, "                 CLIC EN EL BOTON JUGAR\n"
                +                           "Busca las equivalencias, las imagenes son difenrentes.");
        t1.requestFocus(true);
    }
  
    private void cmdPlayActionPerformed(java.awt.event.ActionEvent evt) {
        tabla.comenzarJuego();
    }

    private void cmdExitActionPerformed(java.awt.event.ActionEvent evt) {
        System.exit(0);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == RegresarBoton) {
            System.out.println("Regresar al muenu principal");
            VentanaInicio Inicio = new VentanaInicio();
            dispose();
            contador.Detener();
        } else if (e.getSource() == Jugar) {
            contador.Contar();
            System.out.println("Disfruta el juego");
            tabla.comenzarJuego();
        }
    }
}
