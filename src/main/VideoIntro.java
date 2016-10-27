package main;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class VideoIntro extends JFrame {

    JLabel fondoInicio;
    ImageIcon imagen;

    public VideoIntro() { //contructor
        
        this.setUndecorated(true);//quitar marco de lo bot4ones 
        this.setTitle("Physics.Point - Splash Screen ");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);

        setSize(1280, 720);//configurando tamaño de la ventana (ancho, alto)
        setLocationRelativeTo(null);//ventana centrada en la pantalla
        setResizable(false);//para configurar si se redimensiona la ventana             
        setVisible(true);//configurando visualización de la ventana     
        //Colocar SplashScreen
        imagen = new ImageIcon("src/Imagenes/ImagenInicioV2.gif");
        fondoInicio = new JLabel(imagen);
        imagen.setImageObserver(fondoInicio);
        add(fondoInicio);
        setSize(1280, 720);
        setVisible(true);

    }


}
