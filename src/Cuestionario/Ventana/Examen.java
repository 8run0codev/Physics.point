package Cuestionario.Ventana;

import Cuestionario.Preguntas;
import Cuestionario.Respuestas;
import java.awt.Container;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Examen extends JFrame implements ActionListener {

    public Examen() {
        initComponents();
        question.setText(p.getPregunta(posicion));
        String[] a = r.setRespuestas(posicion);
        buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
        opc1.setText(a[0]);
        opc2.setText(a[1]);
        opc3.setText(a[2]);
        opc4.setText(a[3]);
        opc1.requestFocus();
        regresar.setEnabled(false);
        terminarExamen.setEnabled(false);
        Container cont = getContentPane();
        Image icono = Toolkit.getDefaultToolkit().getImage("logophysics.png");//Icono perzonalizado en la aplicacion 
        this.setIconImage(icono);
        setLayout(null);
        setLocationRelativeTo(null);
        setTitle("Physicis.Point - Ejercicios");
        setResizable(false);
    }

    int posicion = 0;
    Respuestas r = new Respuestas();
    Preguntas p = new Preguntas();
    Object[] select = {"", "", "", "", ""};

    private void initComponents() {

        buttonGroup1 = new ButtonGroup();
        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        question = new JLabel();
        opc1 = new JRadioButton();
        opc2 = new JRadioButton();
        opc3 = new JRadioButton();
        opc4 = new JRadioButton();
        terminarExamen = new JButton();
        avanzar = new JButton();
        regresar = new JButton();
        JLabel Fondo;

        jPanel1.setBorder(BorderFactory.createTitledBorder("Physics.Point"));
        jPanel1.setName("Physics.Point"); // NOI18N

        jLabel1.setFont(new Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Cuestionario");

        question.setFont(new Font("Tahoma", 0, 18)); // NOI18N
        question.setText("¿Pregunta 1?");

        buttonGroup1.add(opc1);
        opc1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                opc1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc2);
        opc2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                opc2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc3);
        opc3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                opc3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opc4);
        opc4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                opc4ActionPerformed(evt);
            }
        });

        terminarExamen.setText("Terminar Examen");
        terminarExamen.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                terminarExamenActionPerformed(evt);
            }
        });

        avanzar.setText("Avanzar >>");
        avanzar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                avanzarActionPerformed(evt);
            }
        });

        regresar.setText("<< Regresar");
        regresar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addContainerGap()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(jLabel1)
                                                                .addComponent(question)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGap(30, 30, 30)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(opc2)
                                                                .addComponent(opc1)
                                                                .addComponent(opc3)
                                                                .addComponent(opc4))))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(0, 505, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(terminarExamen, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                        .addComponent(regresar)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(avanzar)))))
                        .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(question)
                        .addGap(47, 47, 47)
                        .addComponent(opc1)
                        .addGap(18, 18, 18)
                        .addComponent(opc2)
                        .addGap(18, 18, 18)
                        .addComponent(opc3)
                        .addGap(18, 18, 18)
                        .addComponent(opc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(avanzar)
                                .addComponent(regresar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(terminarExamen)
                        .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
        );

        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
        );

        pack();

        setVisible(true);

    }

    private void avanzarActionPerformed(ActionEvent evt) {

        if (posicion == 3) {
            avanzar.setEnabled(false);
            terminarExamen.setEnabled(true);
        }

        if (posicion < 5) {
            regresar.setEnabled(true);
            posicion++;
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }

    private void regresarActionPerformed(ActionEvent evt) {

        if (posicion == 0) {
            regresar.setEnabled(false);
        }

        if (posicion > -1) {
            posicion--;
            avanzar.setEnabled(true);
            question.setText(p.getPregunta(posicion));
            String[] a = r.setRespuestas(posicion);
            buttonGroup1.clearSelection(); // sirve para borrar las selecciones de los radio button
            opc1.setText(a[0]);
            opc2.setText(a[1]);
            opc3.setText(a[2]);
            opc4.setText(a[3]);
            opc1.requestFocus();
        } else {
            Toolkit.getDefaultToolkit().beep();
        }
    }

    private void terminarExamenActionPerformed(ActionEvent evt) {

        int calificacion = 0;

        for (int i = 0; i < 5; i++) {
            if (select[i].equals(r.getRespuesta(i))) {
                calificacion = calificacion + 1;
            }
        }

        calificacion = calificacion * 2;

        JOptionPane.showMessageDialog(null, "Tu calificacion es " + calificacion);

    }

    private void opc1ActionPerformed(java.awt.event.ActionEvent evt) {
        select[posicion] = opc1.getLabel();
    }

    private void opc2ActionPerformed(java.awt.event.ActionEvent evt) {
        select[posicion] = opc2.getLabel();
    }

    private void opc3ActionPerformed(java.awt.event.ActionEvent evt) {
        select[posicion] = opc3.getLabel();
    }

    private void opc4ActionPerformed(java.awt.event.ActionEvent evt) {
        select[posicion] = opc4.getLabel();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton avanzar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton opc1;
    private javax.swing.JRadioButton opc2;
    private javax.swing.JRadioButton opc3;
    private javax.swing.JRadioButton opc4;
    private javax.swing.JLabel question;
    private javax.swing.JButton regresar;
    private javax.swing.JButton terminarExamen;

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
