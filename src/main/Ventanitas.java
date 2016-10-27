package main;


public class Ventanitas {

    public void Ventanitas() {

    }

    public void Inicio() {

        boolean dospuntosuve = true;
        VideoIntro ventanaIntro = new VideoIntro();
        TimeWatch contador = new TimeWatch();
        contador.Contar();
        do {
            System.out.print("");
            if (contador.segundos > 10) {
                dospuntosuve = false;
                VentanaInicio Inicia2 = new VentanaInicio();
                ventanaIntro.dispose();
                contador.Detener();

            }
        } while (dospuntosuve);
    }
}
