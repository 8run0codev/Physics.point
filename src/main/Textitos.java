package main;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.ImageIcon;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Textitos extends JFrame implements ActionListener {

    private Container contenedor;
    JLabel labelTexto;/*declaramos el objeto Label*/

    JLabel ETitulo;/*declaramos el objeto Label*/

    JLabel Fondo;/*declaramos el objeto Label*/

    JTextArea areaDeTexto;
    JTextArea areaDeTitulo;
    JButton botonAbrir;/*declaramos el objeto Boton*/

    JButton RegresarBoton;

    JButton botonGuardar;/*declaramos el objeto Boton*/

    JScrollPane scrollPaneArea;
    JFileChooser fileChooser; /*Declaramos el objeto fileChooser*/

    String texto;

    public Textitos()//constructor
    {
        ImageIcon Botonatras = new ImageIcon("src/Imagenes/Botonatrasadmin.jpg");

        Color ColorPhysics = new Color(211, 129, 1);

        Font fontsita = new Font("Arial", Font.PLAIN, 35);
        Font fontsita2 = new Font("Arial", Font.PLAIN, 20);

        contenedor = getContentPane();
        contenedor.setLayout(null);

        /*Creamos el objeto*/
        fileChooser = new JFileChooser();

        areaDeTitulo = new JTextArea();
        //para que el texto se ajuste al area
        areaDeTitulo.setLineWrap(true);
        //permite que no queden palabras incompletas al hacer el salto de linea
        areaDeTitulo.setWrapStyleWord(true);
        areaDeTitulo.setBounds(373, 50, 700, 30);
        areaDeTitulo.setFont(areaDeTitulo.getFont().deriveFont(20f));

        /*Propiedades del Label, lo instanciamos, posicionamos y
         * activamos los eventos*/
        labelTexto = new JLabel();
        labelTexto.setText("Escribe o Abre el Texto que se mostrata en Fundamentos");
        labelTexto.setFont(fontsita);
        labelTexto.setForeground(ColorPhysics);
        labelTexto.setBounds(200, 100, 900, 30);

        ETitulo = new JLabel();
        ETitulo.setText("Titulo:");
        ETitulo.setFont(fontsita);
        ETitulo.setForeground(ColorPhysics);
        ETitulo.setBounds(200, 50, 900, 30);

        areaDeTexto = new JTextArea();
        //para que el texto se ajuste al area
        areaDeTexto.setLineWrap(true);
        //permite que no queden palabras incompletas al hacer el salto de linea
        areaDeTexto.setWrapStyleWord(true);
        scrollPaneArea = new JScrollPane();
        scrollPaneArea.setBounds(200, 150, 878, 400);
        areaDeTexto.setFont(scrollPaneArea.getFont().deriveFont(20f));
        scrollPaneArea.setViewportView(areaDeTexto);

        /*Propiedades del boton, lo instanciamos, posicionamos y
         * activamos los eventos*/
        botonAbrir = new JButton();
        botonAbrir.setText("Abrir");
        botonAbrir.setBounds(200, 600, 200, 23);
        botonAbrir.setFont(fontsita2);
        botonAbrir.addActionListener(this);

        botonGuardar = new JButton();
        botonGuardar.setText("Guardar");
        botonGuardar.setBounds(450, 600, 200, 23);
        botonGuardar.setFont(fontsita2);
        botonGuardar.addActionListener(this);

        RegresarBoton = new javax.swing.JButton();
        RegresarBoton.setBounds(10, 10, 113, 70);
        RegresarBoton.setIcon(Botonatras);
        RegresarBoton.addActionListener(this);
        RegresarBoton.setVisible(true);

        /*Agregamos los componentes al Conteedor*/
        contenedor.add(labelTexto);
        contenedor.add(scrollPaneArea);
        contenedor.add(botonAbrir);
        contenedor.add(botonGuardar);
        contenedor.add(areaDeTitulo);
        contenedor.add(ETitulo);
        contenedor.add(RegresarBoton);

        //Asigna un titulo a la barra de titulo
        setTitle("Agregar Teoria");
        //tamaño de la ventana
        setSize(1280, 720);
        //pone la ventana en el Centro de la pantalla
        setLocationRelativeTo(null);

        Fondo = new javax.swing.JLabel();
        Fondo.setIcon(new javax.swing.ImageIcon("src/Imagenes/Fondoazul.jpg"));
        Fondo.setBounds(0, 0, 1280, 720);
        add(Fondo);

        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent evento) {
        if (evento.getSource() == botonAbrir) {
            String archivo = abrirArchivo();
            areaDeTexto.setText(archivo);
        } else {

            if (evento.getSource() == botonGuardar) {
                guardarArchivo();
            } else {

                if (evento.getSource() == RegresarBoton) {
                    dispose();
                    VentanaAdministrador dj = new VentanaAdministrador();
                }
            }
        }
    }

    /**
     * Permite mostrar la ventana que carga archivos en el area de texto
     *
     * @return
     */
    private String abrirArchivo() {

        String aux = "";
        texto = "";

        try {
            /*llamamos el metodo que permite cargar la ventana*/
            fileChooser.showOpenDialog(this);
            /*abrimos el archivo seleccionado*/
            File abre = fileChooser.getSelectedFile();

            /*recorremos el archivo, lo leemos para plasmarlo
             *en el area de texto*/
            if (abre != null) {
                FileReader archivos = new FileReader(abre);
                BufferedReader lee = new BufferedReader(archivos);
                while ((aux = lee.readLine()) != null) {
                    texto += aux + "\n";
                }

                lee.close();
            }
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, ex + ""
                    + "\nNo se ha encontrado el archivo",
                    "ADVERTENCIA!!!", JOptionPane.WARNING_MESSAGE);
        }
        return texto;
    }

        public static String getArchivo( String ruta ){
        FileReader fr = null;
        BufferedReader br = null;
        //Cadena de texto donde se guardara el contenido del archivo
        String contenido = "";
        try
        {
            //ruta puede ser de tipo String o tipo File
            fr = new FileReader( ruta );
            br = new BufferedReader( fr );
 
            String linea;
            //Obtenemos el contenido del archivo linea por linea
            while( ( linea = br.readLine() ) != null ){ 
                contenido += linea + "\n";
            }
 
        }catch( Exception e ){  }
        //finally se utiliza para que si todo ocurre correctamente o si ocurre 
        //algun error se cierre el archivo que anteriormente abrimos
        finally
        {
            try{
                br.close();
            }catch( Exception ex ){}
        }
        return contenido;
    }
    
    /**
     * Guardamos el archivo del area de texto en el equipo
     */
    private void guardarArchivo() {

        try {
            File outFile = new File("src/Documentos/" + areaDeTitulo.getText() + ".txt");
            BufferedWriter writer = new BufferedWriter(new FileWriter(outFile));
            writer.write(areaDeTexto.getText());
            writer.newLine(); // Esto es un salto de linea
            writer.close();
            JOptionPane.showMessageDialog(null, "Listo Papu tu archivo se ha subido +10");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Hay un error con tu archivo revisalo e intenta de nuevo");
        }

    }

}
