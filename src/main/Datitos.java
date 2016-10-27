package main;

public class Datitos {

    private String Usuario;
    private String Contraseña;

    /**
     * @return the Usuario
     */
    public String getUsuario() {
        return Usuario;
    }

    /**
     * @param Usuario the Usuario to set
     */
    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    /**
     * @return the Contraseña
     */
    public String getContraseña() {
        return Contraseña;
    }

    /**
     * @param Contraseña the Contraseña to set
     */
    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    public void aceptarDatos(String user , String Password){
        Usuario = user;
        Contraseña = Password;
    }
}
