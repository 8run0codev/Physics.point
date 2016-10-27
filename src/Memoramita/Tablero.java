package Memoramita;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingWorker;
import main.TimeWatch;

public class Tablero extends JPanel {

    private final String[] band = {"1A", "2A", "3A", "4A", "5A", "6A", "7A", "Logo polisoftA", "1B", "2B", "3B", "4B", "5B", "6B", "7B", "Logo polisoftB"};
    private final int fila = 4;
    private final int col = 4;
    private final int ancho_casilla = 140;
    public boolean play = false;
    int c = 0;
    Casilla c1;
    Casilla c2;
    int aciertos = 0;
    TimeWatch contador = new TimeWatch();

    public Tablero() {
        super();
        setBorder(BorderFactory.createEmptyBorder(0, 0, 0, 0));
        setLayout(new java.awt.GridLayout(fila, col));
        Dimension d = new Dimension((ancho_casilla * col), (ancho_casilla * fila));
        setSize(d);
        setPreferredSize(d);
        int count = 0;

        for (int i = 1; i <= (fila * col); i++) {
            Casilla p = new Casilla(String.valueOf(i));
            p.setImag(band[count]);
            count++;
            count = (count >= band.length) ? 0 : count++;
            p.showImag();
            p.addMouseListener(new juegoMouseListener());
            p.setHide(new ImageIcon(getClass().getResource("/Memoramita/iconitos/Physics/" + i + ".jpg")));
            this.add(p);
        }
        /*     
         //Tomo el tamaño de la pantalla 
         Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
         //Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto: 
         this.setLocation((pantallaTamano.width / 2) - (this.getWidth() / 2), (pantallaTamano.height / 2) - (this.getHeight() / 2));
         */
        setVisible(true);
    }

    public void comenzarJuego() {

        aciertos = 0;
        play = true;
        contador.Contar();
        Component[] componentes = this.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            ((Casilla) componentes[i]).congelarImagen(false);
            ((Casilla) componentes[i]).ocultarImag();
            ((Casilla) componentes[i]).setImag("");
        }

        for (int i = 0; i < componentes.length; i++) {
            int n = (int) (Math.random() * (band.length));
            if (!existe(band[n])) {//comprueba que imag no este asignada mas de 2 veces                
                ((Casilla) componentes[i]).setImag(band[n]);
            } else {
                i--;
            }
        }
    }

    private boolean existe(String imag) {
        int count = 0;
        Component[] componentes = this.getComponents();
        for (int i = 0; i < componentes.length; i++) {
            if (componentes[i] instanceof Casilla) {
                if (((Casilla) componentes[i]).getNameImag().equals(imag)) {
                    count++;
                }
            }
        }
        return (count == 1) ? true : false;
    }

    class juegoMouseListener implements MouseListener {

        public void mouseClicked(MouseEvent e) {

            if (play) {
                c++;
                if (c == 1) {
                    c1 = ((Casilla) e.getSource());
                    if (!c1.isCongelado()) {
                        c1.showImag();
                        System.out.println("Primera Imag: " + c1.getNameImag());
                    } else {
                        c = 0;
                    }
                } else if (c == 2 && !c1.getName().equals(((Casilla) e.getSource()).getName())) {
                    c2 = ((Casilla) e.getSource());
                    if (!c2.isCongelado()) {
                        c2.showImag();
                        System.out.println("Segunda Imag: " + c2.getNameImag());
                        Animacion ani = new Animacion(c1, c2);
                        ani.execute();
                    }
                    c = 0;
                } else {
                    c = 0;
                }
            } else {
                System.out.println("Para jugar: el boton Jugar -> JUGAR");
            }
        }

        public void mousePressed(MouseEvent e) {
        }

        public void mouseReleased(MouseEvent e) {
        }

        public void mouseEntered(MouseEvent e) {
        }

        public void mouseExited(MouseEvent e) {
        }

    }

    class Animacion extends SwingWorker<Void, Void> {

        private final Casilla casilla1;
        private final Casilla casilla2;

        public Animacion(Casilla value1, Casilla value2) {
            this.casilla1 = value1;
            this.casilla2 = value2;
        }

        protected Void doInBackground() throws Exception {
            String uno = casilla1.getNameImag();
            String dos = casilla2.getNameImag();
            System.out.println("doInBackground: procesando imagenes...");

            Thread.sleep(1000);
            if (uno.charAt(0) == dos.charAt(0)) {
                casilla1.congelarImagen(true);
                casilla2.congelarImagen(true);
                System.out.println("doInBackground: imagenes son iguales");
                aciertos++;
                if (aciertos == 8) {
                    contador.getSegundos();
                    contador.Detener();
                    System.out.println("doInBackground: ¡Has ganado!");
                    JOptionPane.showMessageDialog(null, "¡Has ganado! \nCon un tiempo de: " + contador.segundos + " segundos.");
                    
                }
            } else {
                casilla1.ocultarImag();
                casilla2.ocultarImag();
                System.out.println("doInBackground: imagenes no son iguales");
            }
            return null;
        }
    }
}
