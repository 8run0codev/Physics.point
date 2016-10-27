package ConversorPhysics;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class TipoUnidad extends JFrame implements ActionListener{

    private final JButton Longitud;
    private JButton Masa;
    private JButton Tiempo;
    private JButton Regresar;
    
    public TipoUnidad(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(640, 360);
        setTitle("Conversor");
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(null);
       
        
        Regresar = new JButton("Regresar");
        Regresar.addActionListener(this);
        Regresar.setBounds(15, 35, 75, 40);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(Regresar);
        
        Longitud = new JButton("Longitud");
        Longitud.addActionListener(this);
        Longitud.setBounds(140, 75, 380, 50);
        // Aqui va el icono ---------> Longitud.setIcon(AQUIVAELFONDO);
        add(Longitud);
        
        Masa = new JButton("Masa");
        Masa.addActionListener(this);
        Masa.setBounds(140, 135, 380, 50);
        // Aqui va el icono -----------> Masa.setIcon(iconoEquivalencia);
        add(Masa);
        
        Tiempo = new JButton("Tiempo");
        Tiempo.addActionListener(this);
        Tiempo.setBounds(140, 195, 380, 50);
        //Aqui va el icono -----------> Tiempo.setIcon(iconoEquivalencia);
        add(Tiempo);
       
            setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Longitud){
            dispose();
            LongitudRem jeje = new LongitudRem();
            }
        else{
            if(e.getSource() == Regresar){
                dispose();
               //VentanaInicio jeje = new VentanaInicio();
            }
            else{
                if(e.getSource() == Tiempo){
                dispose();
                Tiempo jiji = new Tiempo();
                }
                else{
                    if(e.getSource() == Masa){
                        Masa jijiji = new Masa();
                    }
                }
            }
            
        }
    }
    
}