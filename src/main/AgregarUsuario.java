package main;


import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AgregarUsuario extends JFrame implements ActionListener {

    JLabel txtUsuario;
    JLabel Titulo;
    JLabel textContraseñ;
    JLabel Fondo;
    JTextField campoUsuario;
    JTextField campoContraseña;
    JButton Aceptar;
    JButton Regresar;

    public AgregarUsuario() {

        ImageIcon Botonatras = new ImageIcon("src/Imagenes/Botonatrasadmin.jpg");
        Color ColorPhysics = new Color(211, 129, 1);

        Container cont = getContentPane();
        setSize(1280, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Agregar nuevo usuario");
        setResizable(false);

        Font fontsita = new Font("Arial", Font.PLAIN, 35);
        Font fontsita2 = new Font("Arial", Font.PLAIN, 20);
        Titulo = new JLabel("Ingresa el nuevo usuario y contraseña");
        Titulo.setBounds(395, 250, 500, 40);
        Titulo.setFont(fontsita);
        Titulo.setForeground(ColorPhysics);
        cont.add(Titulo);

        txtUsuario = new JLabel("Usuario:");
        txtUsuario.setBounds(460, 340, 120, 30);
        txtUsuario.setFont(fontsita2);
        txtUsuario.setForeground(ColorPhysics);
        cont.add(txtUsuario);

        textContraseñ = new JLabel("Contraseña:");
        textContraseñ.setBounds(460, 400, 120, 30);
        textContraseñ.setFont(fontsita2);
        textContraseñ.setForeground(ColorPhysics);
        cont.add(textContraseñ);

        campoUsuario = new JTextField();
        campoUsuario.setBounds(580, 340, 240, 30);
        cont.add(campoUsuario);

        campoContraseña = new JTextField();
        campoContraseña.setBounds(580, 400, 240, 30);
        cont.add(campoContraseña);

        Aceptar = new JButton("Guardar");
        Aceptar.setBounds(680, 540, 140, 50);
        cont.add(Aceptar);
        Aceptar.addActionListener(this);

        Regresar = new JButton();
        Regresar.setBounds(10, 10, 113, 70);
        Regresar.setIcon(Botonatras);
        cont.add(Regresar);
        Regresar.addActionListener(this);

        Fondo = new javax.swing.JLabel();
        Fondo.setIcon(new javax.swing.ImageIcon("src/Imagenes/FondoAdmin.jpg"));
        Fondo.setBounds(0, 0, 1280, 720);
        add(Fondo);

        setVisible(true);
        cont.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        while (true) {
            if (e.getSource() == Aceptar) {
                String usuario;
                String contraseña;
                usuario = campoUsuario.getText();
                contraseña = campoContraseña.getText();
               
                if (contraseña.equals("123") && usuario.equals("Admin")) {
                    dispose();
                    VentanaAdministrador admin = new VentanaAdministrador();

                } else {
                    CompararUsuario comp = new CompararUsuario();
                    comp.agregarUsuario(usuario, contraseña);
                }
            }
        }
    }

}
