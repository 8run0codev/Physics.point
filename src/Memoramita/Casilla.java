package Memoramita;

import java.awt.Cursor;
import java.awt.Dimension;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Casilla extends JLabel {

    private final int ancho = 140;
    private final int alto = 140;
    private ImageIcon hide;
    private ImageIcon imag;
    private String sImag = "";
    private boolean congelado = false;

    public Casilla(String name) {
        super();
        Dimension d = new Dimension(ancho, alto);
        setName(name);
        setSize(d);
        setPreferredSize(d);
        setText("");
        setIcon(hide);
/**        
//Tomo el tamaño de la pantalla 
        Dimension pantallaTamano = Toolkit.getDefaultToolkit().getScreenSize();
//Al ancho de la pantalla lo divido en 2 y le resto la mitad del ancho de mi ventana, con eso queda centrada en el eje X, para el eje Y es lo mismo pero con el alto: 
        this.setLocation((pantallaTamano.width / 2) - (this.getWidth() / 2), (pantallaTamano.height / 2) - (this.getHeight() / 2));
        */
        setVisible(true);
        setOpaque(true);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public void showImag() {
        setIcon(imag);
    }

    public void ocultarImag() {
        if (!congelado) {
            setIcon(getHide());
        }
    }

    public void congelarImagen(boolean value) {
        this.congelado = value;
    }

    public boolean isCongelado() {
        return this.congelado;
    }

    public void setImag(String name) {
        this.sImag = name;
        if (!name.equals("")) {
            imag = new ImageIcon(getClass().getResource("/Memoramita/iconitos/" + name + ".jpg"));
        }
    }

    public String getNameImag() {
        return sImag;
    }

    public ImageIcon getHide() {
        return hide;
    }

    public void setHide(ImageIcon hide) {
        this.hide = hide;
    }
}
